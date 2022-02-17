
public class CarroEconomico extends Carro {
     public CarroEconomico(){
        super();
        System.out.println("Creando Carro Económico");
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
