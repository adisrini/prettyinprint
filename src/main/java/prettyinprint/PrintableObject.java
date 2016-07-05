package main.java.prettyinprint;

public abstract class PrintableObject {
    
    protected Object object;
    
    public PrintableObject(Object object) {
        this.object = object;
    }
    
    public abstract boolean isEmpty();
    
    public abstract String outputNormalHorizontal();
    
    public abstract String outputNormalVertical();
    
    public abstract String outputFancyHorizontal();
    
    public abstract String outputFancyVertical();

}
