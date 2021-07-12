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
            case 1:  Task1.execute(sc);  break;     case 2:  task2.execute(sc);  break;
            case 3:  Task3.execute(sc);  break;     case 4:  Task4.execute(sc);   break;
            case 5:  Task5.execute(sc);  break;     case 6:  task6.execute(sc);  break;
            case 7:  Clock.execute(sc);  break;     case 8:  task8.execute(sc);  break;
            case 9:  task9.execute(sc);  break;     case 10: task10.execute(sc); break;
            case 12: task12.execute(sc); break;     case 13: Dinglemouse.execute(sc); break;
            case 14: task14.execute(sc); break;     case 16: task16.execute(sc); break;
            case 17: Block.execute(sc);  break;     case 18: task18.execute(sc); break;
            case 20: task20.execute(sc); break;     case 22: task22.execute(sc); break;
            case 24: task24.execute(sc); break;     case 25: OppositesAttract.execute(sc); break;
            case 26: task26.execute(sc); break;     case 29: Kata.execute(sc);   break;
            case 30: task30.execute(sc); break;     case 32: task32.execute(sc); break;
            case 33: task33.execute(sc); break;     case 34: task34.execute(sc); break;
            case 38: task38.execute(sc); break;     case 42: task42.execute(sc); break;
            case 46: task46.execute(sc); break;     case 50: task50.execute(sc); break;
            case 52: task52.execute(sc); break;     case 54: task54.execute(sc); break;
            case 56: task56.execute(sc); break;     case 58: task58.execute(sc); break;
            case 60: Task60.execute(sc); break;     case 62: task62.execute(sc); break;
            case 64: task64.execute(sc); break;     case 66: task66.execute(sc); break;
            case 68: Task68.execute(sc); break;     case 70: task70.execute(sc); break;

            default:
                System.out.println("You need to enter number from 1 to 72");
        }

        sc.close();
    }

    private static void printAllTasks() {
        Map<Integer, String> tasks = new LinkedHashMap<>();
        tasks.put(1, "Double integer");
        tasks.put(2, "Multiplying two numbers");
        tasks.put(3, "Getting volume of cuboid");
        tasks.put(4, "Getting volume of cuboid");
        tasks.put(5, "Greeting");
        tasks.put(6, "Convert to binary");
        tasks.put(7, "Clock");
        tasks.put(8, "Century from year");
        tasks.put(9,  "Make negative");
        tasks.put(10, "Age range compatibility equation");
        tasks.put(12, "Lombok Encapsulation");
        tasks.put(13, "Dinglemouse");
        tasks.put(14, "Fractions class");
        tasks.put(16, "Two fighters, one winner.");
        tasks.put(17,"Block");
        tasks.put(18, "Opposite number");
        tasks.put(20, "Convert a Boolean to a String");
        tasks.put(22, "How old will i be in 2099");
        tasks.put(25, "Is love");
        tasks.put(26, "Convert boolean values to strings yes or no");
        tasks.put(29, "SwitchItUp");
        tasks.put(30, "Thinkful logic drills traffic light");
        tasks.put(32, "String repeat");
        tasks.put(33, "humanYearsCatYearsDogYears");
        tasks.put(34, "Get the mean of an array");
        tasks.put(38, "How good are you really");
        tasks.put(42, "Twice as old");
        tasks.put(46, "21 sticks");
        tasks.put(50, "Tdd area calculations");
        tasks.put(52, "Hello");
        tasks.put(54, "Opposite number");
        tasks.put(56, "No spaces");
        tasks.put(58, "Triple trouble 2");
        tasks.put(60, "CharProblem");
        tasks.put(62, "Grasshopper debug");
        tasks.put(64, "SortAndStar");
        tasks.put(66, "Correct the mistakes of the character recognition software");
        tasks.put(68, "PushAnObjectIntoArray");
        tasks.put(70, "Unfinished loop bug fixing number 1");

        for (Map.Entry<Integer, String> task: tasks.entrySet()) {
            System.out.println(task.getKey() + " " + task.getValue());
        }
    }


}
