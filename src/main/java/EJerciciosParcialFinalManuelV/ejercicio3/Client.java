package EJerciciosParcialFinalManuelV.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String [] args){
        List<Estudiante> list1 = new ArrayList<>();
        list1.add(new Estudiante("Jose1",4565,15));
        list1.add(new Estudiante("Jose2",5685,15));
        list1.add(new Estudiante("Jose3",4235,16));
        list1.add(new Estudiante("Jose4",5448,17));
        list1.add(new Estudiante("Jose5",7420,16));

        List<Estudiante> list2 = new ArrayList<>();
        list2.add(new Estudiante("Jose6",4789,17));
        list2.add(new Estudiante("Jose7",6341,18));
        list2.add(new Estudiante("Jose8",4748,18));


        List<Estudiante>list3= new ArrayList<>();
        list3.add(new Estudiante("Jose8",4123,20));
        list3.add(new Estudiante("Jose9",4153,21));
        list3.add(new Estudiante("Jose10",1423,19));
        list3.add(new Estudiante("Jose11",7052,21));

        ISistemasDeControlInscripcion sistemaColegio=new SistemaDeColegio(new Whatsapp(),"Colegio 1",20,list1,"Haber cursado el quinder");
        sistemaColegio.integracionRedSocial();

        ISistemasDeControlInscripcion sistemaEscuela= new SistemaDeEscuela(new Twitter(),"Escuela 1",25,list2,"No haberse applazado");
        sistemaEscuela.integracionRedSocial();

        ISistemasDeControlInscripcion sistemaUniversidad= new SistemaUniversidad(new Facebook(),"UPB",600,list3,"Ser estudiante de exelencia");
        sistemaUniversidad.integracionRedSocial();

    }
}
