package EJerciciosParcialFinalManuelV.ejercicio1;


public class LaPaz implements IDepartamento {
    //nombre,número provincias, numero habitantes , clima,
    //dinero por turismo
    private String nombre;
    private int    numprovincias;
    private int    numHabitantes;
    private String clima;
    private double dineroPorTurismo;

    public LaPaz(){
        this.nombre="La Paz";
        this.numprovincias=32;
        this.numHabitantes=1000000;
        this.clima="Mayormente nublado";
        this.dineroPorTurismo=0;
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

    public double getDineroPorTurismo() {
        return dineroPorTurismo;
    }

    public void setDineroPorTurismo(double dinero){
        this.dineroPorTurismo=dineroPorTurismo+dinero;
    }

    public void showInfo(){
        System.out.println("Departamento: "+nombre);
        System.out.println("Numero de provincias: "+numprovincias);
        System.out.println("Numero de habitantes: "+numHabitantes);
        System.out.println("Clima: "+clima);
        System.out.println("Dinero por turismo: "+dineroPorTurismo+" Bolivianos");
        System.out.println("--------------------------------------------");
    }

    @Override
    public void accept(ITurista turista) {
        turista.visitarDepartamento(this);
    }
}
