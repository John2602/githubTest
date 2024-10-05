import java.util.Scanner;  // Import the Scanner class

public class ClassA {
     static void main() {
         Scanner myObj = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Enter your name: ");

         String userName = myObj.nextLine();  // Read user input
         System.out.println("Username is: " + userName);  // Output user input
         System.out.println("Enter your age: ");
         int age = myObj.nextInt();
         System.out.println("Age is: " + age);
         System.out.println("Enter your height: ");
         int height = myObj.nextInt();
         System.out.println("Height is: " + height);
         System.out.println("Enter your weight: ");
         int weight = myObj.nextInt();
         System.out.println("Weight is: " + weight);
         System.out.println("Enter your birthday: ");
         String birthday = myObj.nextLine();
         System.out.println("Birthday is: " + birthday);
         System.out.println("Enter your gender: ");
         String gender = myObj.nextLine();
         System.out.println("Gender is: " + gender);
         if (gender.equals("male") && age > 18 && height > 150) {
             System.out.println("You have Good health");
         } else if (gender.equals("female") && age > 18 && height > 150) {
             System.out.println("You have Good health");
         } else if (gender.equals("male") && age > 18 && height < 150) {
             System.out.println("Please Consult Doctor");
         } else if (gender.equals("female") && age > 18 && height < 150) {
             System.out.println("Please Consult Doctor");
         } else if (gender.equals("male") && age < 18 && height > 150) {
             System.out.println("You have Alfa jeans");
         } else if (gender.equals("female") && age < 18 && height > 150) {
             System.out.println("You have Alfa jeans");
         } else {
             System.out.println("You have Bad health");
         }
     }

    }


