package EJerciciosParcialFinalManuelV.ejercicio4;

public class CuadraGasolinaEspecial implements ICuadratrackNormal {

    private String tipocuadra;
    private int cantidadGasolina;
    private int capacidad;

    public CuadraGasolinaEspecial(String tipocuadra) {

        this.tipocuadra = tipocuadra;
    }

    @Override
    public void llenarGasolina(int numero) {
        System.out.println("Se llena el tanque");
        this.cantidadGasolina=numero;
    }

    @Override
    public void estadoDelCombustible() {
        int num=(int)(Math.random()*50);
        System.out.println("Numero Aleatorio: "+num);
        capacidad=num;
    }
}
