public class Colour  {
    int r;
    int g;
    int b;
    String type;

    public Colour(int r, int g, int b, String type){
        this.r = r;
        this.g = g;
        this.b = b;
        this.type = type;
    }

    public boolean equalsColour(Colour colour2) {
        if (this.type.equals(colour2.type)){
            return this.r == colour2.r && this.g == colour2.g && this.b == colour2.b;
        }

        else{
            return false;
        }
    }

    public Object add(Colour colour) {
        if (this.type.equals(colour.type)){
            return new Colour(this.r + colour.r, this.g + colour.g, this.b + colour.b, this.type);
        }

        else{
            return "Cannot add these colours, different types.";
        }
    }
}
