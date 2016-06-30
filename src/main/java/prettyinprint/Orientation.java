package main.java.prettyinprint;

public enum Orientation {
    HORIZONTAL("Horizontal"), VERTICAL("Vertical");
    
    private String orientation;
    
    private Orientation(String orientation) {
        this.orientation = orientation;
    }
    
    public String suffix() {
        return this.orientation;
    }

}
