package Team3;

import java.util.Scanner;

public class Tasl59 {
    public static String position(char alphabet)
    {
        char inputLetterToLowerCase= Character.toLowerCase(alphabet);
        int asciiValueOfinputChar= (int)inputLetterToLowerCase;
        int position= asciiValueOfinputChar-96;
        return ("Position of alphabet: " + position);
    }

    public static void showFunctionality(){
        System.out.println("This program return letters position in the alphabet.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter= sc.next().charAt(0);
        String position= Tasl59.position(letter);
        System.out.println(position);

    }
}
