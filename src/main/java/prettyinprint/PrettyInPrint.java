package main.java.prettyinprint;

public interface PrettyInPrint {
    
    public String print(Object obj);
    
    public String print(Object obj, Decoration d);
    
    public String print(Object obj, Orientation d);
    
    public String print(Object obj, Decoration d, Orientation o);
    
    public void setDecoration(Decoration d);
    
    public void setOrientation(Orientation o);

}
