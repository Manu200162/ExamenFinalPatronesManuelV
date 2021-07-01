package EJerciciosParcialFinalManuelV.ejercicio3;

public class Estudiante {

    private String nombreEstudiante;
    private int ci;
    private int edad;

    public Estudiante(String nombreEstudiante, int ci, int edad) {
        this.nombreEstudiante = nombreEstudiante;
        this.ci = ci;
        this.edad = edad;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public int getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }
}
