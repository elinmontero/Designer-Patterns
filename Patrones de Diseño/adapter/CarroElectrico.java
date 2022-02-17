
public class CarroElectrico {    
         
        private boolean conectado = false;
        
        public CarroElectrico(){
        System.out.println("Creando Carro Eléctrico");
        this.conectado = false;
    }
    
   
    public void conectar(){
        System.out.println("Conectando Carro Eléctrico");
        this.conectado = true;
    }    
   
    public void activar(){
        if(!this.conectado) {
            System.out.println("No se puede activar el carro porque no está conectado");
        }   else{
                System.out.println("está conectado, activando carro eléctrico");
        }    
        
    }
    
     public void moverRapido(){
        if(!this.conectado) {
            System.out.println("el carro no se puede mover más rápido porque no está conectado");
        }   else{
                System.out.println("El carro se está moviendo mas rápido");
        }    
        
    }
    
     public void detener(){
        if(!this.conectado) {
            System.out.println("No se puede detener el carro porque no está conectado");
        }   else{
                System.out.println("El carro eléctrico se está deteniendo");
        }    
        
    }
    
     public void desconectar(){
        System.out.println("Desconectando Carro Eléctrico");
        this.conectado = false;
    }      
    
    
    
}
