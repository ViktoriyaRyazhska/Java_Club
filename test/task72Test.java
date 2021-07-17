import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task72Test {

  Dictionary dictionary;

  @BeforeEach
  void setUp() {
    dictionary = new Dictionary();
    dictionary.newEntry("apple", "fruit");
  }

  @Test
  void testDictionary() {

    String expected = "fruit";

    String actual = dictionary.look("apple");

    assertEquals(expected, actual);

  }


  @Test
  void testFindNoExistingRecord() {

    String expected = "Cant find entry for potato";

    String actual = dictionary.look("potato");

    assertEquals(expected, actual);

  }

}