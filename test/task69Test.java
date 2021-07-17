import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class task69Test {

  List<String> stringList;
  List<String> listFromTask;

  @BeforeEach
  void setUp() {
    stringList = List.of("test");
    listFromTask = task69.push("test");
  }

  @Test
  void testPush() {

    List<String> expected = stringList;

    List<String> actual = task69.push("test");

    assertEquals(expected, actual);

  }

  @Test
  void testArraySize() {

    int expected = stringList.size();

    int actual = listFromTask.size();

    assertEquals(expected, actual);

  }

  @Test
  void testPushGet() {

    String expected = stringList.get(0);

    String actual = listFromTask.get(0);

    assertEquals(expected, actual);

  }


}