import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task62Test {

  @Test
  void testWeatherInfoAboveFreezing() {

    String expected = "18.333333333333332 is above freezing temperature";

    String actual = task62.weatherInfo(65);

    assertEquals(expected, actual);

  }

  @Test
  void testWeatherInfoFreezing() {

    String expected = "-6.666666666666667 is freezing temperature";

    String actual = task62.weatherInfo(20);

    assertEquals(expected, actual);

  }


}