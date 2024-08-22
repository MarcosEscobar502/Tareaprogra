package Package;
import lombok.Data;

@Data
public class Estudiante {
    private int carnet;
    private String nombre;
    private String apellidos;

    @Override
    public String toString() {
        return "Estudiante{" +
                "carnet=" + carnet +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}