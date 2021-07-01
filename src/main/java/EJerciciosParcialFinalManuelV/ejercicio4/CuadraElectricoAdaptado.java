package EJerciciosParcialFinalManuelV.ejercicio4;

public class CuadraElectricoAdaptado implements ICuadratrackNormal {
    private CuadraElectrico cuadraElectrico ;

    public CuadraElectricoAdaptado(CuadraElectrico cuadraElectrico) {
        this.cuadraElectrico = cuadraElectrico;
        System.out.println("Se adapta el cuadra electrico");
    }

    @Override
    public void llenarGasolina(int numero) {
        System.out.println("Adaptado");
        cuadraElectrico.cargar(numero);
    }

    @Override
    public void estadoDelCombustible() {
        System.out.println("Adaptado");
        cuadraElectrico.estadoElectricidad();
    }
}
