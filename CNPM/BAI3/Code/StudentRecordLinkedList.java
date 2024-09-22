package College;  
  
// Java Program to Illustrate StudentRecordLinkedList Class  
  
// Importing required classes  
import java.util.Scanner;  
  
// Class  
public class StudentRecordLinkedList {  
  
    // Main driver method  
    public static void main(String[] args)  
    {  
  
        // Creating the object StudentRecordManagement.  
        StudentRecordManagement hr = new StudentRecordManagement();  
  
        // Creating a Record object.  
        Record record = new Record();  
      
        // Initial Employee record  
        // Using mutators to hard code the data  
        record.setIdNumber(4238);  
        record.setContactNumber(89770);  
        record.setName("Surya");  
  
        // Calling add() method to add static data (Hard Coded Data) to linked List  
        hr.add(record);  
  
        // Creating Scanner Object to read input  
        Scanner input = new Scanner(System.in);  
  
        // Creating an integer variable to store the user's choice  
        int option = 0;  
  
        // Do - While loop for menu-driven program  
        do {  
            // Display the menu  
            menu();  
            option = input.nextInt();  
  
            // Switch case to handle user's choice  
            switch (option) {  
  
            // Case 1: Add Student  
            case 1:  
  
                // Prompt user for Student information  
                System.out.print("What is the Student id Number? ");  
                int idNumber = input.nextInt();  
  
                System.out.print("What is the Student contact Number? ");  
                long contactNumber = input.nextLong();  
                input.nextLine(); // Consume the newline character  
  
                System.out.print("What is the Student Name? ");  
                String name = input.nextLine();  
  
                // Create a new Record object and pass constructor parameters.  
                record = new Record(name, idNumber, contactNumber);  
                // Call the add() method  
                hr.add(record);  
                System.out.println(record.toString());  
  
                // Break statement used to exit the switch case  
                break;  
  
            // Case 2: Delete Student  
            case 2:  
  
                // Prompt user for Student id to delete  
                System.out.print("What is the Student id number? ");  
                int rId = input.nextInt();  
  
                // Invoke the delete() method to remove the record  
                hr.delete(rId);  
  
                break;  
  
            // Case 3: Update Student  
            case 3:  
  
                // Prompt user for Student id to update  
                System.out.print("What is the Student id number? ");  
                int rIdNo = input.nextInt();  
                hr.update(rIdNo, input);  
  
                break;  
  
            // Case 4: Search Student  
            case 4:  
  
                // Prompt user for Student id to search  
                System.out.print("What is the Student id? ");  
                int bookId = input.nextInt();  
  
                if (!hr.find(bookId)) {  
                    System.out.println("Student id does not exist\n");  
                }  
  
                break;  
  
            // Case 5: Display Students  
            case 5:  
                hr.display();  
                break;  
  
            // Case 6: Exit program  
            case 9:  
  
                // Display exit message and terminate the program  
                System.out.println("\nThanks for using the Student Record Management System. Have a great day!\n");  
                System.exit(0);  
  
                break;  
  
            // Case 7: Default case  
            // If none of the above cases execute  
            default:  
  
                // Print an error message for invalid input  
                System.out.println("\nInvalid input\n");  
                break;  
            }  
        }  
  
        // Continue the loop until the user chooses to exit (option 9)  
        while (option != 9);  
    }  
  
    // Method 2  
    // Menu - Static menu for displaying options  
    public static void menu()  
    {  
  
        // Printing statements displaying the menu on the console  
        System.out.println("MENU");  
        System.out.println("1: Add Student");  
        System.out.println("2: Delete Student");  
        System.out.println("3: Update Student");  
        System.out.println("4: Search Student");  
        System.out.println("5: Display Students");  
        System.out.println("9: Exit program");  
        System.out.print("Enter your selection : ");  
    }  
}  