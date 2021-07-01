package EJerciciosParcialFinalManuelV.ejercicio5;



public class Celular implements ICelular {

private String marca;
private int ram;
private int    almacenamiento;
private String cpu;
private int price;

    public Celular(String marca,int ram, int almacenamiento, String cpu,int price) {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.cpu = cpu;
        this.price=price;
        this.marca=marca;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void operation() {
        System.out.println("Atributos del celular:");
        System.out.println("Marca: "+marca);
        System.out.println("ram: "+ram+" GB" );
        System.out.println("Almacenamiento: "+almacenamiento+" GB");
        System.out.println("Cpu: "+cpu);
        System.out.println("Precio: "+price+ " Bolivianos");
        System.out.println("-----------------------------------------------------");
    }
}
