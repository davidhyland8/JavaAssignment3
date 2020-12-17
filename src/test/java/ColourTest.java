import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    @Test
    public void equalsColour(){
        Colour colour1 = new Colour(200, 1, 30, "RGB");
        Colour colour2 = new Colour(200, 1, 30, "RGB");
        assertTrue(colour1.equalsColour(colour2));
    }

    @Test
    public void add(){
        Colour colour3 = new Colour(20, 15, 30, "RGB");
        Colour colour4 = new Colour(2, 40, 30, "RGB");
        Colour colour5 = new Colour(22, 55, 60, "RGB");
        assertTrue(colour5 == colour3.add(colour4));
    }
}