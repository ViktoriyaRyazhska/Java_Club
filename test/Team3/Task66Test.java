package Team3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task66Test {

    @Test
    public void correct() {
        String actual = Task66.correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5");
        String expected = "RICHARD P. FEYNMAN - THE FEYNMAN LECTURES ON PHYSICS";
        assertEquals(actual,expected);
    }
    @Test
    public void correct1() {
        String actual = Task66.correct("UR5ULA K. LE GU1N - A W1ZARD 0F EARTH5EA");
        String expected = "URSULA K. LE GUIN - A WIZARD OF EARTHSEA";
        assertEquals(actual,expected);
    }
}