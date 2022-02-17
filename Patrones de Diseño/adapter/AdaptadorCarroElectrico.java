
// Esta es la clase que se va a adaptar.
public class AdaptadorCarroElectrico extends Carro {
    private CarroElectrico carroelectrico;
    
    public AdaptadorCarroElectrico(){
        super();
        System.out.println("Creando adaptador Carro Eléctrico");
        this.carroelectrico = new CarroElectrico();
    }
    
    @Override
    public void apagar(){
        System.out.println("Apagando adaptador carro  eléctrico");
        this.carroelectrico.detener();
        this.carroelectrico.desconectar();
        
    }
    
    @Override
    public void encender(){
        System.out.println("Encendiendo adaptador carro eléctrico");
        this.carroelectrico.conectar();
        this.carroelectrico.activar();
    }
    
    @Override
    public void acelerar(){
        System.out.println("acelerando adaptador carro eléctrico");
        this.carroelectrico.moverRapido();
    }           
    
    
    
}
