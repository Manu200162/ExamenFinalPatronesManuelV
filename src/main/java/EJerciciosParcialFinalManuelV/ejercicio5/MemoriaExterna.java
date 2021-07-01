package EJerciciosParcialFinalManuelV.ejercicio5;



public class MemoriaExterna extends Decorator {
    private String attribute1;
    private int memoriaExterna;
    private int attribute3;

    public MemoriaExterna(ICelular component,int memoriaExterna) {

        super(component);
        this.memoriaExterna=memoriaExterna;
    }


    public int getAttribute2() {
        return memoriaExterna;
    }

    public void setAttribute2(int attribute2) {
        this.memoriaExterna = attribute2;
    }



    @Override
    public void operation(){
        System.out.println("Se añade una memoria externa de : "+memoriaExterna+" GB");
        super.setPrice(super.getPrice()+20);
        super.setAlmacenamiento(super.getAlmacenamiento()+memoriaExterna);
        System.out.println("El nuevo precio es: "+super.getPrice()+" Bolivianos");
        System.out.println("Capacidad de memoria: "+super.getAlmacenamiento()+" GB");
    }

}
