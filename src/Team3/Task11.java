package Team3;

import java.util.Scanner;

public class Task11 {
    public static  String weatherInfo (int temp){
        var c = temp;
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }



    public static double convertToCelsius (int temperature) {
        double celsius = (temperature-32)/1.8;
        return celsius;
    }

    public static void showFunctionality(){
        System.out.println("This program converts fahrenheit to celsius and says whether the temperature is above freezing temperature or is freezing temperature");
        Scanner i = new Scanner(System.in);
        System.out.println("Enter temperature to know whether the temperature is above freezing temperature or is freezing temperature :");
        int first = i.nextInt();
        String multiple = weatherInfo(first);
        System.out.println( multiple );

        System.out.println("enter fahrenheit which you want to convert in celsius :");
        int second = i.nextInt();

        double mui = convertToCelsius(second);

        System.out.println(second +" fahrenheit = "+ mui+" celsius" );
    }
}
