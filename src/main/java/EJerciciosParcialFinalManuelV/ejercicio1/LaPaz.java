package EJerciciosParcialFinalManuelV.ejercicio1;


public class LaPaz implements IDepartamento {
    //nombre,número provincias, numero habitantes , clima,
    //dinero por turismo
    private String nombre;
    private int    numprovincias;
    private int    numHabitantes;
    private String clima;

    public LaPaz(){
        this.nombre="La Paz";
        this.numprovincias=32;
        this.numHabitantes=1000000;
        this.clima="Mayormente nublado";
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
