import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DragoncaveTest {

    @Test
    void displayResultTests() {

        assertAll("All cases",
                ()->assertEquals("Gobbles you down in one byte!", DragonCave.displayResult("1")),
                ()->assertEquals("Offers you some of his treeasure. You got lucky this time." DragonCave.displayResult("2")),
                );


    }
}