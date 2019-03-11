package Model;

public class Beverage implements BeverageInterface {
    private boolean alcoholic;
    private int color;
    private int flavor;
    private String description;

    public Beverage(){
        alcoholic=false;
        color=0;
        flavor=0;
        description="";
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getFlavor() {
        return flavor;
    }

    public void setFlavor(int flavor) {
        this.flavor = flavor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
