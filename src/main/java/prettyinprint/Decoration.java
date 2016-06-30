package main.java.prettyinprint;

public enum Decoration {
    NORMAL("Normal"), FANCY("Fancy");
    
    private String suffix;
    
    private Decoration(String suffix) {
        this.suffix = suffix;
    }
    
    public String suffix() {
        return this.suffix;
    }

}
