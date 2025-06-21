import java.util.Scanner;

public class Main{
    public static void main(String [] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double number1 =scanner.nextDouble();
        System.out.print("Enter the second number : ");
        double number2 =scanner.nextDouble();
        System.out.println("Answer is "+Answer(number1,number2));
    }



    public static double Answer(double a, double b){
        double number1 =a;
        double number2=b;
        double total =number1/number2;
        return total;
    }
}

