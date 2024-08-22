package Package;

import org.junit.Test;
import static org.junit.Assert.*;

public class EstudianteTest {

    @Test
    public void testToString() {
        Estudiante estudiante = new Estudiante();
        estudiante.setCarnet(123456);
        estudiante.setNombre("Juan");
        estudiante.setApellidos("Pérez");

        String expected = "Estudiante{carnet=123456, nombre='Juan', apellidos='Pérez'}";
        assertEquals(expected, estudiante.toString());
    }
}