import java.util.Scanner;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celcius) {
        double fahrenheit = (9.0 / 5) * celcius +32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) *(fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celcius");
            System.out.println("2. Celcius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            System.out.println("Enter fahrenheit: ");
            fahrenheit = input.nextDouble();
            System.out.println("Fahrenheit to Celcius: " + fahrenheitToCelsius(fahrenheit));
            System.out.println("Enter Celsius: ");
            celsius = input.nextDouble();
            System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }
}
