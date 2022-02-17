
import java.util.Scanner;



public class main {
    private static Scanner S = new Scanner(System.in);
    private static Carro carro;   

    
    public static void main(String[] args) {
        int opcion;
        
        do{
            opcion= preguntarOpcion();
            switch(opcion){
                case 1:
                    carro = new CarroNormal();
                    usarCarro();
                    break;
                    
                case 2:
                    carro = new CarroEconomico();
                    usarCarro();
                    break;    
                
                case 3:
                    carro = new AdaptadorCarroElectrico();
                    usarCarro();
                    break;    
                
                case 4:
                    System.out.println("Cerrando el programa");
                    break;
                    
                default:
                    System.out.println("Opción no válida");
            }
            System.out.println("\n\n");           
            
        }while(opcion !=4);               
        
    }
    
    private static int preguntarOpcion(){
        System.out.println(
                "Menú de opciones \n"                
                +"................\n"
                +"1. Encender Carro Normal.\n"
                +"2. Encender Carro Económico.\n"
                +"3. Encender Carro Eléctrico.\n"
                +"4. Salir.\n"
                +"Seleccione opción: "
        );   
        return Integer.parseInt(S.nextLine());
    }
    
    private static void usarCarro(){
        carro.encender();
        carro.apagar();
        carro.acelerar();
    
    }
    
    
    
}
