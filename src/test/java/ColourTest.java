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
        assertEquals(colour5, colour3.add(colour4));
    }

    @Test
    public void maxMinValues(){
        Colour colour6 = new Colour(258, -10, 300, "RGB");
        Colour colour7 = new Colour(255, 0, 255, "RGB");
        assertEquals(colour6, colour7);
    }
}