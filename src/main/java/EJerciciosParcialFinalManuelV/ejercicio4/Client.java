package EJerciciosParcialFinalManuelV.ejercicio4;

public class Client {
    public static void main(String [] args){

        //Cuadratrack normal
        CuadraGasolinaEspecial cuadraNormal= new CuadraGasolinaEspecial("Gasolina Especial");
        cuadraNormal.llenarGasolina(45);
        cuadraNormal.estadoDelCombustible();
        //CuadraElectrico
        CuadraElectrico cuadraElectrico=new CuadraElectrico();
        //CuadraElectricoAdaptado

        CuadraElectricoAdaptado cuadraElectricoAdaptado=new CuadraElectricoAdaptado(cuadraElectrico);
        cuadraElectricoAdaptado.llenarGasolina(15);
        cuadraElectricoAdaptado.estadoDelCombustible();

    }
}
