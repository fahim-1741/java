import java.util.Scanner;

public class Simplecalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
           System.out.println("Enter first number : ");
            double n1 = sc.nextDouble();

            System.out.println("Enter second number : ");
            double n2 =sc.nextDouble();

            System.out.println("sum =" +(n1+n2));
            System.out.println("subtraction = "+(n1-n2));
            System.out.println("multiplication = "+(n1*n2));
            System.out.println("division =  %.2f%n "+(n1/n2));

            sc.close();
    }
}