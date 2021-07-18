import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task56Test {

    @Test
    void areYouPlayingBanjo() {
        assertEquals( "Nope!", "Martin does not play banjo", task56.areYouPlayingBanjo("Martin"));
        assertEquals( "Nope!", "Rikke plays banjo", task56.areYouPlayingBanjo("Rikke"));
    }
}