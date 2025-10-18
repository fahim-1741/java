import java.util.Scanner;

class Area {

    double area;

  

    Area(double base, double height) {

        area = 0.5 * base * height;

        System.out.println("Area of the Triangle: " + area);

    }

    

    Area(double length, double width, boolean isRectangle) {

        if (isRectangle) {

            area = length * width;

            System.out.println("Area of the Rectangle: " + area);

        }

    }

   

    Area(double radius) {

        area = Math.PI * radius * radius;

        System.out.println("Area of the Circle: " + area);

    }

}

public class Areacalculate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Base of triangle: ");

        double base = sc.nextDouble();

        System.out.print("Height of triangle: ");

        double height = sc.nextDouble();

        new Area(base, height);

        System.out.print("Length of rectangle: ");

        double length = sc.nextDouble();

        System.out.print("Width of rectangle: ");

        double width = sc.nextDouble();

        new Area(length, width, true);

        System.out.print("Radius of circle: ");

        double radius = sc.nextDouble();

        new Area(radius);

        sc.close();

    }

}