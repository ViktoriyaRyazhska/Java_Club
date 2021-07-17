import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task31Test {

  @Test
  void testRentalCarCostForMore7Days() {

    int expected = 350;

    int actual = task31.rentalCarCost(10);

    assertEquals(expected, actual);

  }

  @Test
  void testRentalCarCostForMore3Days() {

    int expected = 140;

    int actual = task31.rentalCarCost(4);

    assertEquals(expected, actual);

  }

  @Test
  void testRentalCarCostForLess3Days() {

    int expected = 80;

    int actual = task31.rentalCarCost(2);

    assertEquals(expected, actual);

  }


  @Test
  void testRentalCarCostWithWrongValue() {

    assertThrows(IllegalArgumentException.class,
            () -> task31.rentalCarCost(-1));

  }
}