import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("To see list of tasks print 'list' or 'exit' to finish the program: ");
        String command = sc.next().toLowerCase();

        switch (command) {
            case "list":
                getPrograms().forEach((key, value) -> System.out.println(key + " " + value));
                break;
            case "exit":
                System.exit(0);
            default:
                throw new RuntimeException("Incorrect command");
        }

        System.out.println("Please, give me the task number: ");

        int taskNumber = sc.nextInt();

        try {
            Class.forName("task" + taskNumber)
                    .getDeclaredMethod("execute", Scanner.class)
                    .invoke(null, sc);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }

    }

    private static Map<Integer, String> getPrograms() {
        Map<Integer, String> tasks = new LinkedHashMap<>();
        tasks.put(1, "Double integer");
        tasks.put(2, "Multiplying two numbers");
        tasks.put(3, "Getting volume of cuboid");
        tasks.put(4, "Pixel art planning");
        tasks.put(5, "Greeting");
        tasks.put(6, "Convert to binary");
        tasks.put(7, "Clock");
        tasks.put(8, "Century from year");
        tasks.put(9,  "Make negative");
        tasks.put(10, "Age range compatibility equation");
        tasks.put(11, "Grasshopper debug");
        tasks.put(12, "Lombok Encapsulation");
        tasks.put(13, "Dingle mouse");
        tasks.put(14, "Fractions class");
        tasks.put(16, "Two fighters, one winner.");
        tasks.put(17, "Block");
        tasks.put(18, "Opposite number");
        tasks.put(19, "Is n divisible by x and y?");
        tasks.put(20, "Convert a Boolean to a String");
        tasks.put(21, "Do I get a bonus?");
        tasks.put(22, "How old will i be in 2099");
        tasks.put(23, "Rock Paper Scissors!");
        tasks.put(24, "Basic mathematical operations");
        tasks.put(25, "Is love");
        tasks.put(26, "Convert boolean values to strings yes or no");
        tasks.put(27, "Will there be enough space?");
        tasks.put(29, "SwitchItUp");
        tasks.put(30, "Traffic light");
        tasks.put(31, "Transportation on vacation");
        tasks.put(32, "String repeat");
        tasks.put(33, "humanYearsCatYearsDogYears");
        tasks.put(34, "Get the mean of an array");
        tasks.put(36, "Counting sheep...");
        tasks.put(37, "Reversed sequence");
        tasks.put(38, "How good are you really");
        tasks.put(40, "Sum of positive");
        tasks.put(41, "My head is at the wrong end!");
        tasks.put(42, "Twice as old");
        tasks.put(44, "Grasshopper - Summation");
        tasks.put(46, "21 sticks");
        tasks.put(50, "Tdd area calculations");
        tasks.put(51, "Convert a Number to a String");
        tasks.put(52, "Reversed Strings");
        tasks.put(53, "Welcome to the city");
        tasks.put(54, "Opposite number");
        tasks.put(56, "Are You Playing Banjo?");
        tasks.put(57, "No spaces");
        tasks.put(58, "Triple trouble 2");
        tasks.put(59, "Find the position!");
        tasks.put(60, "Fake Binary");
        tasks.put(61, "CharProblem");
        tasks.put(62, "Grasshopper debug");
        tasks.put(64, "All Star Code Challenge #18");
        tasks.put(65, "SortAndStar");
        tasks.put(66, "Correct the mistakes of the character recognition software");
        tasks.put(68, "Remove n exclamation marks in the sentence from left to right");
        tasks.put(69, "Push An Object Into Array");
        tasks.put(70, "Unfinished loop bug fixing number 1");
        tasks.put(71, "Filtering even numbers");
        tasks.put(72, "Interactive Dictionary");

        return tasks;
    }

}
