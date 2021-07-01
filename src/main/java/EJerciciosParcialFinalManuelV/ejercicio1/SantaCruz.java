package EJerciciosParcialFinalManuelV.ejercicio1;


public class SantaCruz implements IDepartamento {
    //nombre,número provincias, numero habitantes , clima,
    //dinero por turismo
    private String nombre;
    private int    numprovincias;
    private int    numHabitantes;
    private String clima;

    public SantaCruz(){
        this.nombre="Santa Cruz";
        this.numprovincias=36;
        this.numHabitantes=2000000;
        this.clima="tempertaruras de 30 grados , mayormente calido";
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumprovincias() {
        return numprovincias;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public String getClima() {
        return clima;
    }

    public void showInfo(){
        System.out.println("Informacion del departamento");
        System.out.println("Departamento: "+nombre);
        System.out.println("Numero de provincias: "+numprovincias);
        System.out.println("Numero de habitantes: "+numHabitantes);
        System.out.println("Clima: "+clima);
        System.out.println("--------------------------------------------");
    }

    @Override
    public void accept(ITurista turista) {

    }
}
