
/* UTILIZANDO EL PATRON DE DISEÑO SINGLETON, EL CUAL LIMITA UNA CLASE A CREAR
   NO MAS DE UN OBJETO */
public class Televisor {
    
     private static Televisor mTelevisor;  // null
    
    private Televisor(){}
    
    /*  LA PALABRA CLAVE SYNCHRONIZED ES LA PALABRA CLAVE EN ESTE MÉTODO PARA
    NO PERMITIR INSTANCIAR MAS DE UN OBJETO DE UNA MISMA CLASE */
    public synchronized static Televisor getMonitor(){
        if (mTelevisor == null){
            mTelevisor = new Televisor();
        }
            
        return mTelevisor;
    }
    
}
