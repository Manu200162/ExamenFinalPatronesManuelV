package EJerciciosParcialFinalManuelV.ejercicio3;

public class Twitter implements IRedsocial{
    @Override
    public void integracionRedSocial(ISistemasDeControlInscripcion informacion) {
        System.out.println("Se implementa la red social de Twitter para mostrar la informacion: ");
        System.out.println("La informacion a mostrar es: ");
        informacion.informacion();
    }
}
