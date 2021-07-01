package EJerciciosParcialFinalManuelV.ejercicio5;

import decorator.basic.Component;
import decorator.basic.ComponentConcrete1;
import decorator.basic.DecoratorConcrete1;
import decorator.basic.DecoratorConcrete2;

public class Client {
    public static void main (String[]args){

       ICelular celular = new Celular("Samsung",4,128,"sanpdragon",6000);
    }
}
