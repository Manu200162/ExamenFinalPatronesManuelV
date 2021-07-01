package EJerciciosParcialFinalManuelV.ejercicio1;

import java.lang.invoke.ConstantCallSite;

public class Cliente {

    public static void main (String[]args){
        LaPaz laPaz= new LaPaz();
        Cochabamba cochabamba= new Cochabamba();
        SantaCruz santaCruz=new SantaCruz();

        Turista turista=new Turista("Juan Lopez",600000,"45645665C");
        laPaz.accept(turista);
        cochabamba.accept(turista);
        santaCruz.accept(turista);

    }
}
