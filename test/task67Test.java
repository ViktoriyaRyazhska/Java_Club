import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;


import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Tests to task#67")
class task67Test {

  @Test
  @DisplayName("test to alternative string")
  void testToAlternativeString() {

    String expected = "coNveRtIng";

    String actual = task67.toAlternativeString("COnVErTiNG");

    assertEquals(expected, actual);

  }

  @Test
  @DisplayName("test to alternative empty string")
  void testToAlternativeEmptyString() {

    assertThrows(IllegalArgumentException.class,
            () -> task67.toAlternativeString(""),
            "You put empty string. Nothing to transform!");

  }

  @Test
  @Order(1)
  @DisplayName("method have correct name and params")
  void testCorrectNameAndParametersToMethodWhichAlternativeString() {

    assertDoesNotThrow(() -> task67.class.getMethod("toAlternativeString", String.class));

  }

  @Test
  @Order(2)
  @DisplayName("method have correct return type")
  void testCorrectReturnTypeOfMethod() {

    Class<String> expected = String.class;

    Class<?> actual = findMethod("toAlternativeString").get().getReturnType();

    assertEquals(expected, actual);

  }

  private Optional<Method> findMethod(String name) {
    return Arrays.stream(task67.class.getMethods())
        .filter(n -> n.getName().equals(name))
        .findAny();
  }

}