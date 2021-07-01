package EJerciciosParcialFinalManuelV.ejercicio3;

public class Whatsapp implements IRedsocial{
    @Override
    public void integracionRedSocial(ISistemasDeControlInscripcion informacion) {
        System.out.println("Se implementa la red social de WhatsApp para mostrar informacion: ");
        System.out.println("La informacion a mostrar es: ");
        informacion.informacion();
    }
}
