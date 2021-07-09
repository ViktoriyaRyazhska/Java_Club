import java.util.Scanner;

public class task12 {

  public static void execute(Scanner sc) {
    System.out.println("This task does nothing, it was modified with lombok");
    System.out.println("How class looked before change");
    System.out.println("public class EncapsulationDemo{\n" +
            "  public int number;\n" +
            "  public String stringValue;\n" +
            "  public Object anObject;\n" +
            "}");
    System.out.println("And after");
    System.out.println("import lombok.AllArgsConstructor;\n" +
            "import lombok.Getter;\n" +
            "import lombok.Setter;\n" +
            "import lombok.NoArgsConstructor;\n" +
            "\n" +
            "@Getter\n" +
            "@Setter\n" +
            "@NoArgsConstructor\n" +
            "@AllArgsConstructor\n" +
            "public class EncapsulationDemo{\n" +
            "  private int number;\n" +
            "  private String stringValue;\n" +
            "  private Object anObject;\n" +
            "}\n");
  }
}
