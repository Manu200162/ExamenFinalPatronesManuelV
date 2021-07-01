package EJerciciosParcialFinalManuelV.ejercicio1;

public class Turista implements ITurista {

    @Override
    public void visitarDepartamento(LaPaz laPaz) {
        System.out.println("Se visita la ciudad de la Paz");
        System.out.println("La informacion de la ciudad es:");
        laPaz.showInfo();
    }

    @Override
    public void visitarDepartamento(Cochabamba cochabamba) {

    }

    @Override
    public void visitarDepartamento(SantaCruz santaCruz) {

    }
}
