
public class Queso extends DecoradorChimi{
    private Chimi chimi;
    
    public Queso(Chimi c){
        this.chimi= c;
    }
    
    @Override
    public String getDescripcion(){
        return chimi.getDescripcion() + " + queso";
    }
    
    
    
}
