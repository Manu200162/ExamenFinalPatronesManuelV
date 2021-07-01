package EJerciciosParcialFinalManuelV.ejercicio5;



public class Decorator implements ICelular {

    private ICelular component;

    public Decorator(ICelular component){
        this.component=component;
    }

    public ICelular getDecorator(){
        return this.component;
    }
    public void setComponent(ICelular component){
        this.component=component;
    }



    @Override
    public void operation() {
        this.component.operation();
    }

    @Override
    public int getPrice() {
        return component.getPrice();
    }

    @Override
    public void setPrice(int price) {
            this.component.setPrice(price);
    }

    @Override
    public int getAlmacenamiento() {
        return component.getAlmacenamiento();
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
        component.setAlmacenamiento(almacenamiento);
    }
}
