package GuessNumber.src;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberTest {
    @Test
    void newGameRequestedTest1() {
        var s = new GuessNumber();
        assertTrue(s.newGameRequested("y"));
        assertTrue(s.newGameRequested("Y"));
    }
    @Test
    void newGameRequestedTest2(){
        var s = new GuessNumber();
        assertFalse(s.newGameRequested("n"));
        assertFalse(s.newGameRequested("N"));
    }

}
