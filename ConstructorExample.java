import java.util.Scanner;

class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using the default constructor
        System.out.println("Creating a person with default constructor:");
        Person person1 = new Person();
        person1.displayInfo();

        // Using the parameterized constructor
        System.out.println("\nCreating a person with parameterized constructor:");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        Person person2 = new Person(name, age);
        person2.displayInfo();

        scanner.close(); // Close the scanner to avoid resource leak
    }
}
