package EJerciciosParcialFinalManuelV.ejercicio3;

import java.util.List;

public class SistemaDeEscuela implements ISistemasDeControlInscripcion{
    //nombre, capacidad, estudiantes[], requisitos
    private IRedsocial redsocial;
    private String nombre;
    private int capacidad;
    private List<Estudiante> listEstudiantes;
    private String requisitos;

    public SistemaDeEscuela(IRedsocial redsocial, String nombre, int capacidad, List<Estudiante> listEstudiantes, String requisitos) {
        this.redsocial=redsocial;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.listEstudiantes = listEstudiantes;
        this.requisitos = requisitos;
    }


    @Override
    public void informacion() {
        System.out.println("Nombre de la escuela: "+nombre);
        System.out.println("Capacidad de la escuela: "+capacidad+" Estudiantes");
        System.out.println("Lista de estudiantes: ");
        for(Estudiante estudiante: listEstudiantes){
            System.out.println("Nombre: "+estudiante.getNombreEstudiante()+" Ci estudiante: "+estudiante.getCi());
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    @Override
    public void integracionRedSocial() {
        System.out.println("Añadiendo red social*********************");
        redsocial.integracionRedSocial(this);

    }
}
