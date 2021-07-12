package Team3;

import java.util.Scanner;

public class Tasl59 {
    public static int findPosition(char inputLetter)
    {
        // converting input letter in to uniform case.
        char inputLetterToLowerCase= Character.toLowerCase(inputLetter);
        // COnverting chat in to its ascii value
        int asciiValueOfinputChar= (int)inputLetterToLowerCase;
        // ASCII value of lower case letters starts from 97
        int position= asciiValueOfinputChar-96;
        return position;

    }

    public static void showFunctionality(){
        System.out.println("This program return letters position in the alphabet.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter= sc.next().charAt(0);
        int position= Tasl59.findPosition(letter);
        System.out.println("Position of letter "+letter+" in alphabet is: "+position);

    }
}
