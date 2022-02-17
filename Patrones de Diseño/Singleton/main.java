
public class main {

    
    public static void main(String[] args) {
         Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                Televisor tv1 = Televisor.getMonitor();
                System.out.println("el hashcode es " + tv1.hashCode());
            }
        });
        
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                Televisor tv2 = Televisor.getMonitor();
                System.out.println("el hashcode es " + tv2.hashCode());
            }
        });
       
        t1.start();
        t2.start();
        
        
        
    }
    
}
