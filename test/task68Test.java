import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests to task#68")
class task68Test {

  @Test
  @DisplayName("remove '!'")
  void testRemoveExclamationMarks() {

    String expected = "test";

    String actual = task68.remove("test!!!", 3);

    assertEquals(expected, actual);

  }

  @Test
  @DisplayName("remove '!' with empty string")
  void testRemoveExclamationMarksWithEmptyString() {

    assertThrows(IllegalArgumentException.class,
            () -> task68.remove("", 1),
            "This string is empty or amount of exclamation marks to delete is less than zero");

  }

  @Test
  @DisplayName("remove '!' with negative number of '!' to delete")
  void testRemoveExclamationMarksWithNegativeNumber() {

    assertThrows(IllegalArgumentException.class,
            () -> task68.remove("Test", -1),
            "This string is empty or amount of exclamation marks to delete is less than zero");

  }

  @Test
  @DisplayName("try to remove '!' from String without '!'")
  void testRemoveExclamationMarksWithStringWithoutExclamationMarks() {

    assertThrows(NoSuchElementException.class,
            () -> task68.remove("Test", 5),
            "There is nothing to delete!");

  }

  @Test
  @DisplayName("try to remove '!' from String without '!'")
  void testRemoveExclamationMarksThatExceedExisting() {

    assertThrows(NoSuchElementException.class,
            () -> task68.remove("Test!!!", 5),
            "The number of exclamation marks you want to remove exceeds the number of existing ones");

  }


}