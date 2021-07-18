import java.util.Scanner;

public class task11 {
    public static String weatherInfo(double temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(double temperature) {
        double celsius = (temperature - 32) + 5/9.0;
        return temperature;
    }

    public static void execute(Scanner sc) {
        System.out.println("This method convert temperature to celsius and give you weather info");
        System.out.println("Enter temperature: ");
        double temperature = sc.nextDouble();
        String result = weatherInfo(temperature);
        System.out.println(result);
    }

}
