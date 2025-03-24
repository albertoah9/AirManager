import TeleChargeAndPaySystem8.TeleChargeAndPaySystem;
import TeleChargeAndPaySystem8.FailedInternetConnectionException;
import TeleChargeAndPaySystem8.InvalidCardNumberException;
import TeleChargeAndPaySystem8.OrderRejectedException;

public class SistemaDePago {
    private Factura factura;
    private TeleChargeAndPaySystem servicioPago;

    public SistemaDePago(Factura factura) {
        if (factura == null) {
            throw new IllegalArgumentException("La factura no puede ser nula.");
        }
        this.factura = factura;
        this.servicioPago = new TeleChargeAndPaySystem();
    }

    public boolean procesarPago() {
        if (factura.getEstado() == Factura.EstadoFactura.PAGADO) {
            System.out.println("La factura ya ha sido pagada.");
            return false;
        }

        if (factura.getMonto() <= 0) {
            System.err.println("Error: El monto de la factura debe ser mayor a cero.");
            return false;
        }

        try {
            boolean pagoExitoso = servicioPago.procesarPago(factura.getMonto());

            if (pagoExitoso) {
                factura.marcarComoPagado();
                System.out.println("El pago fue procesado exitosamente.");
            } else {
                System.err.println("Error: El pago no se pudo procesar.");
            }

            return pagoExitoso;

        } catch (FailedInternetConnectionException e) {
            System.err.println("Error: Problema de conexión a Internet. Intenta nuevamente.");
        } catch (InvalidCardNumberException e) {
            System.err.println("Error: El número de tarjeta proporcionado no es válido.");
        } catch (OrderRejectedException e) {
            System.err.println("Error: La orden fue rechazada.");
        } catch (Exception e) {
            System.err.println("Error desconocido: " + e.getMessage());
        }

        return false;
    }

    public void mostrarEstadoFactura() {
        System.out.println("Factura ID: " + factura.getId());
        System.out.println("Monto: " + factura.getMonto());
        System.out.println("Estado: " + factura.getEstado());
    }
}
