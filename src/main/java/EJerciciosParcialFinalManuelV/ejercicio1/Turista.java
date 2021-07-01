package EJerciciosParcialFinalManuelV.ejercicio1;

public class Turista implements ITurista {

    private String nombre;
    private double dinero;
    private String ci;

    public Turista(String nombre, double dinero,String ci) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.ci=ci;
    }

    @Override
    public void visitarDepartamento(LaPaz laPaz) {
        System.out.println("Se visita la ciudad de la Paz");
        System.out.println("La informacion de la ciudad es:");
        laPaz.showInfo();
        int gastado= (int)(Math.random()*80-1);
        dinero=dinero-gastado;
        laPaz.setDineroPorTurismo(gastado);
        System.out.println("El turista gastara: "+gastado+" Bolivianos");
        System.out.println("El dinero que le queda es: "+dinero+" Bolivanos");
        System.out.println("El dinero por turismo del departamento es: "+laPaz.getDineroPorTurismo()+" Bolivianos");
        System.out.println("************************************************************************");
    }

    @Override
    public void visitarDepartamento(Cochabamba cochabamba) {
        System.out.println("Se visita la ciudad de Cochabamba");
        System.out.println("La informacion de la ciudad es:");
        cochabamba.showInfo();
        double gastado=cochabamba.getNumHabitantes()*0.1;
        dinero=dinero-gastado;
        cochabamba.setDineroPorTurismo(gastado);
        System.out.println("El turista gastara: "+gastado+" Bolivianos");
        System.out.println("El dinero que le queda es: "+dinero+" Bolivanos");
        System.out.println("El dinero por turismo del departamento es: "+cochabamba.getDineroPorTurismo()+" Bolivianos");
        System.out.println("************************************************************************");
    }

    @Override
    public void visitarDepartamento(SantaCruz santaCruz) {
        System.out.println("Se visita la ciudad de Santa Cruz");
        System.out.println("La informacion de la ciudad es:");
        santaCruz.showInfo();
        double gastado= santaCruz.getNumprovincias()*0.5;
        santaCruz.setDineroPorTurismo(gastado);
        dinero=dinero-gastado;
        System.out.println("El turista gastara: "+gastado+" Bolivianos");
        System.out.println("El dinero que le queda es: "+dinero+" Bolivanos");
        System.out.println("El dinero por turismo del departamento es: "+santaCruz.getDineroPorTurismo()+" Bolivianos");
        System.out.println("************************************************************************");

    }
}
