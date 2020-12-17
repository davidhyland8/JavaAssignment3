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
        maxMinValues();
    }

    public Colour(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
        this.type = "RGB";
        maxMinValues();
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

    public void maxMinValues(){
        if (this.r > 255){
            this.r = 255;
        }

        if (this.r < 0){
            this.r = 0;
        }

        if (this.g > 255){
            this.g = 255;
        }

        if (this.g < 0){
            this.g = 0;
        }

        if (this.b > 255){
            this.b = 255;
        }

        if (this.b < 0){
            this.b = 0;
        }
    }

    @Override
    public String toString(){
        return String.format("Type: %s, first component: %d, second component: %d, third component: %d", this.type, this.r, this.g, this.b);
    }

    public int getR(){
        return this.r;
    }

    public int getG(){
        return this.g;
    }

    public int getB(){
        return this.b;
    }

    public String getType(){
        return this.type;
    }
}
