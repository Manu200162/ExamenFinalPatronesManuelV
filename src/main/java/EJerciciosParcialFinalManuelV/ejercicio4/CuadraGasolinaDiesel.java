package EJerciciosParcialFinalManuelV.ejercicio4;

public class CuadraGasolinaDiesel implements ICuadratrackNormal {

    private String tipocuadra;
    private int cantidadGasolina;
    private int capacidad;

    public CuadraGasolinaDiesel(String tipocuadra) {
        this.tipocuadra = tipocuadra;
    }

    @Override
    public void llenarGasolina(int numero) {
        this.cantidadGasolina=numero;
    }

    @Override
    public void estadoDelCombustible() {
        int num=(int)(Math.random()*50);
        System.out.println("Numero Aleatorio: "+num);
        capacidad=num;
    }
}
