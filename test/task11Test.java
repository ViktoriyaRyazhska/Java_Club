import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task11Test {

    @Test
    void weatherInfo() {
        String expected = "10.0 is above freezing temperature";
        String actual = task11.weatherInfo(50);

    }

    @Test
    void convertToCelsius() {
     String expected = "-5.0 is freezing temperature";
     double actual = task11.convertToCelsius(23);
    }
}