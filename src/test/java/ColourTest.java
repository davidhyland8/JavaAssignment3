import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {
    @Test
    public void equalsColour(){
        Colour colour1 = new Colour(200, 1, 30, "RGB");
        Colour colour2 = new Colour(200, 1, 30, "RGB");
        assertTrue(colour1.equalsColour(colour2));
    }
}