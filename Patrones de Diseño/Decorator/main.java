/* este patrón soluciona el problema de agregar o quietar responsabilidades
a un objeto en tiempo de ejecución. */
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("Bienvenidos a D'super Chimi");
        System.out.println("***************************");
        System.out.println();
    
    
    Chimi chimi = new Chimi();
    
    int opcion = 0;
    do{
        System.out.println("Que le va a adicionar a su chimi?");
        System.out.println("1= lechuga, 2= tomate, 3= queso, 0=terminar");
        opcion = sc.nextInt();
        switch(opcion){
            case 0:
                break;
            case 1:
                chimi = new Lechuga(chimi);
                    break;
            case 2:
                chimi = new Tomate (chimi);
                    break;
            case 3:
                chimi = new Queso (chimi);
                    break;
            default:
                System.out.println("Opción no válida");            
        }
    
    
}   while (opcion !=0);
    
    System.out.println();
    System.out.println("Entregando.....");
    System.out.println(chimi.getDescripcion());
    System.out.println("Disfrute su chimi");
    
    }
}