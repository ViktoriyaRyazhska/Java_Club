import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task29Test {

  @Test
  void switchItUp() {
    assertEquals("One", task29.switchItUp(1));
    assertEquals("Two", task29.switchItUp(2));
    assertEquals("Three", task29.switchItUp(3));
    assertEquals("Four", task29.switchItUp(4));
    assertEquals("Five", task29.switchItUp(5));
    assertEquals("Six", task29.switchItUp(6));
    assertEquals("Seven", task29.switchItUp(7));
    assertEquals("Eight", task29.switchItUp(8));
    assertEquals("Nine", task29.switchItUp(9));
  }

  @Test
  void testSwitchItUpWithNumberOverNine() {
    assertEquals("Zero", task29.switchItUp(25));
  }

}