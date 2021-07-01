package EJerciciosParcialFinalManuelV.ejercicio3;

public class Facebook implements IRedsocial{
    @Override
    public void integracionRedSocial(ISistemasDeControlInscripcion informacion) {
        System.out.println("Se implementa la red social de facebook para mostrar informacion: ");
        System.out.println("La informacion a mostrar es: ");
        informacion.informacion();
    }
}
