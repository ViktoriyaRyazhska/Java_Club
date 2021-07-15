package Team3;

import java.util.Scanner;

public class Task62 {
    public static String weatherInfo(double temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");
    }

    public static double convertToCelsius(double temperature) {
        double celsius = (temperature - 32) * (5/9.0);
        return celsius;
    }

    public static void showFunctionality(){
        System.out.println("This program convert fahrenheit to celsius ");
        System.out.println("Enter fahrenheit ");
        Scanner in = new Scanner(System.in);
        double far = in.nextDouble();
        System.out.println("Values in Celsius : " + weatherInfo(far));
    }
}
