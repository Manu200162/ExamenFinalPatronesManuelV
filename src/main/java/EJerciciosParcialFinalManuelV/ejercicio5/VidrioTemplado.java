package EJerciciosParcialFinalManuelV.ejercicio5;



public class VidrioTemplado extends Decorator {
    private String attribute1;
    private int attribute2;
    private int attribute3;

    public VidrioTemplado(ICelular component) {
        super(component);
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }

    public int getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(int attribute3) {
        this.attribute3 = attribute3;
    }

    @Override
    public void operation(){
        System.out.println("Se añade un vidrio templado");
        super.setPrice(super.getPrice()+80);
        System.out.println("El nuevo precio es: "+super.getPrice()+" Bolivianos");
    }

}
