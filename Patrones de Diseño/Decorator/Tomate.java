
public class Tomate extends DecoradorChimi {   
    
    private Chimi chimi;
    
    public Tomate(Chimi c){
        this.chimi= c;
    }
    
    @Override
    public String getDescripcion(){
        return chimi.getDescripcion() + " + tomate";
    }
    
}
