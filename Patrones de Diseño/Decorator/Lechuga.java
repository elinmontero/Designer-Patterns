
public class Lechuga extends DecoradorChimi {
    
    private Chimi chimi;
    
    public Lechuga(Chimi c){
        this.chimi= c;
    }
    
    @Override
    public String getDescripcion(){
        return chimi.getDescripcion() + " + lechuga";
    }
}       
    
