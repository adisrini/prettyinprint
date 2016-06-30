package main.java.prettyinprint;

public abstract class PrintableObject {
    
    protected Object object;
    
    public PrintableObject(Object object) {
        this.object = object;
    }
    
    public abstract String output();

}
