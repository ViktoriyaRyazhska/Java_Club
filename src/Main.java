import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("To see list of tasks print 'list' \n" +
                "or 'exit' to finish the program: ");
        String str = sc.next();
        switch (str) {
            case "list":
                printAllTasks();
                break;
            case "exit":
                System.exit(0);
            default:
                throw new RuntimeException("Incorrect command");
        }

        System.out.println("Please gimme number of task: ");
        int taskNumber = sc.nextInt();

        switch (taskNumber) {
            case 2:  task2.execute(sc);  break;     case 6:  task6.execute(sc);  break;
            case 8:  task8.execute(sc);  break;
            case 10: task10.execute(sc); break;     case 12: task12.execute(sc); break;
            case 14: task14.execute(sc); break;
            case 18: task18.execute(sc); break;     case 22: task22.execute(sc); break;
            case 26: task26.execute(sc); break;     case 30: task30.execute(sc); break;
            case 34: task34.execute(sc); break;     case 38: task38.execute(sc); break;
            case 42: task42.execute(sc); break;     case 46: task46.execute(sc); break;
            case 50: task50.execute(sc); break;     case 54: task54.execute(sc); break;
            case 58: task58.execute(sc); break;
            case 60: Task60.execute(sc); break;
            case 62: task62.execute(sc); break;
            case 66: task66.execute(sc); break;     case 70: task70.execute(sc); break;

            default:
                System.out.println("You need to enter number from 1 to 72");
        }

        sc.close();
    }

    private static void printAllTasks() {
        Map<Integer, String> tasks = new LinkedHashMap<>();
        tasks.put(2, "Multiplying two numbers");
        tasks.put(6, "Convert to binary");
        tasks.put(8, "Century from year");
        tasks.put(10, "Age range compatibility equation");
        tasks.put(12, "Lombok Encapsulation");
        tasks.put(14, "Fractions class");
        tasks.put(18, "Opposite number");
        tasks.put(22, "How old will i be in 2099");
        tasks.put(26, "Convert boolean values to strings yes or no");
        tasks.put(30, "Thinkful logic drills traffic light");
        tasks.put(34, "Get the mean of an array");
        tasks.put(38, "How good are you really");
        tasks.put(42, "Twice as old");
        tasks.put(46, "21 sticks");
        tasks.put(50, "Tdd area calculations");
        tasks.put(54, "Opposite number");
        tasks.put(58, "Triple trouble 2");
        tasks.put(62, "Grasshopper debug");
        tasks.put(66, "Correct the mistakes of the character recognition software");
        tasks.put(70, "Unfinished loop bug fixing number 1");

        for (Map.Entry<Integer, String> task: tasks.entrySet()) {
            System.out.println(task.getKey() + " " + task.getValue());
        }
    }


}
