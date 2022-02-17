
public class CarroNormal extends Carro {
    
    public CarroNormal(){
        super();
        System.out.println("Creando Carro Normal");
    }
    
    @Override
    public void apagar(){
        System.out.println("Apagando Carro Normal");
    }
    
    @Override
    public void encender(){
        System.out.println("Encendiendo Carro Normal");
    }
    
    @Override
    public void acelerar(){
        System.out.println("acelerando Carro Normal");
    }
    
    
}
