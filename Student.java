import java.util.Scanner;

class Students {
    private String name;
    private int rollNumber;
    private int age;

    public Students(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        
        Students[] students = new Students[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll number: ");
            int roll = sc.nextInt();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            
            students[i] = new Students(name, roll, age);
        }

        
        System.out.println("\n--- Student List ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            students[i].display();
        }
    }
}
