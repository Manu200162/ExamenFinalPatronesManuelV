package EJerciciosParcialFinalManuelV.ejercicio4;

public class CuadraElectrico implements ICuadraElectrico {

    private int bateria;
    private int estadoBateria;
    public CuadraElectrico(){

    }

    @Override
    public void cargar(int num) {
        bateria=num;
        System.out.println("Se carga la bateria");
    }

    @Override
    public void estadoElectricidad() {
        int num=(int)(Math.random()*10-1);
        System.out.println("El estado de la bateria es: "+num);
        estadoBateria=num;
    }
}
