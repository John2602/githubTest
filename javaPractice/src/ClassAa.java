
import java.util.Scanner;  // Import the Scanner class

public class ClassAa {
    static void method1() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your name: ");
        String userName = myObj.nextLine();  // Read user input
        // Output user input
        System.out.println("Enter your age: ");
        int age = myObj.nextInt();
        System.out.println("Enter your height: ");
        int height = myObj.nextInt();
        System.out.println("Enter your gender: ");
        String gender = myObj.nextLine();
        System.out.println(" Name: "+ userName);
        System.out.println(" Age: "+ age);
        System.out.println(" Height: "+ height);
        System.out.println(" Gender : "+ gender);
        if (gender.equals("male") && age > 18 && height > 150) {
            System.out.println("You have Good health");
        } else if (gender.equals("male") && age < 18 && height > 150) {
            System.out.println("You have Good health");
        } else if (gender.equals("male") && age > 18 && height < 150) {
            System.out.println("Please Consult Doctor");
        } else if (gender.equals("male") && age < 18 && height < 150) {
            System.out.println("Please Consult Doctor");
        } else {
            System.out.println("You have Bad health");
        }
        if (gender.equals("female") && age > 18 && height > 150) {
            System.out.println("You have Good health");
        } else if (gender.equals("female") && age < 18 && height > 150) {
            System.out.println("You have Good health");
        } else if (gender.equals("female") && age > 18 && height < 150) {
            System.out.println("Please Consult Doctor");
        } else if (gender.equals("female") && age < 18 && height < 150) {
            System.out.println("Please Consult Doctor");
        } else {
            System.out.println("You have Bad health");
        }

    }

}
