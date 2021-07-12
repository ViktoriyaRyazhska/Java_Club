package Team3;

import java.util.*;

public class Task71 {
    public static void FilterOddNumber() {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner cons = new Scanner(System.in);
        System.out.println("Enter the number of the digits: ");
        int number = cons.nextInt();
        for(int i=0;i<number;i++){
            System.out.println("Enter the "+(i+1)+" number");
            int j= cons.nextInt();
            numbers.add(j);
        }
        System.out.println("Unsorted List: " + numbers);
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer number1 = iterator.next();
            if (number1 % 2 == 0) {
                iterator.remove();
            }

        }
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
    }
    public static void showFunctionality() {
        System.out.println("This program removes even numbers from the list and return a list that contains odd number.");
        FilterOddNumber();
    }

}
