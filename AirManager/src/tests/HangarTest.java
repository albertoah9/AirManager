package src.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HangarTest {

    @Test
    public void testConstructorYGetters() {
        // Arrange (preparación)
        int id = 1;
        double ancho = 10.5;
        double alto = 5.2;
        double largo = 20.0;
        int numPlazas = 3;
        
        // Act (acción)
        Hangar hangar = new Hangar(id, ancho, alto, largo, numPlazas);
        
        // Assert (verificación)
        assertEquals(id, hangar.getId());
        assertEquals(ancho, hangar.getAncho());
        assertEquals(alto, hangar.getAlto());
        assertEquals(largo, hangar.getLargo());
        assertEquals(numPlazas, hangar.getNumPlazas());
    }

    @Test
    public void testSetters() {
        // Arrange
        Hangar hangar = new Hangar(1, 10.0, 5.0, 20.0, 2);
        
        // Act
        hangar.setId(2);
        hangar.setAncho(12.5);
        hangar.setAlto(6.0);
        hangar.setLargo(25.0);
        hangar.setNumPlazas(4);
        
        // Assert
        assertEquals(2, hangar.getId());
        assertEquals(12.5, hangar.getAncho());
        assertEquals(6.0, hangar.getAlto());
        assertEquals(25.0, hangar.getLargo());
        assertEquals(4, hangar.getNumPlazas());
    }

    @Test
    public void testEquals() {
        // Arrange
        Hangar hangar1 = new Hangar(1, 10.0, 5.0, 20.0, 2);
        Hangar hangar2 = new Hangar(1, 10.0, 5.0, 20.0, 2);
        Hangar hangar3 = new Hangar(2, 12.0, 6.0, 25.0, 3);
        
        // Assert
        assertEquals(hangar1, hangar2); // Deberían ser iguales si tienen los mismos valores
        assertNotEquals(hangar1, hangar3); // Deberían ser diferentes
    }

    @Test
    public void testHashCode() {
        // Arrange
        Hangar hangar1 = new Hangar(1, 10.0, 5.0, 20.0, 2);
        Hangar hangar2 = new Hangar(1, 10.0, 5.0, 20.0, 2);
        
        // Assert
        assertEquals(hangar1.hashCode(), hangar2.hashCode());
    }
}