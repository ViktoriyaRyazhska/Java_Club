//Task 11 (Grasshopper - Debug)
package com.team4;
public class Task11 {

    public static String weatherInfo(double temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(double temperature) {
        double celsius = (temperature - 32) * 5/9;
        return celsius;
    }

    public static void execute(){
        System.out.println("Input your temperature ");
        double n16 = MyMain.scanner.nextDouble();
        System.out.println(Task11.weatherInfo(n16));
    }
}
