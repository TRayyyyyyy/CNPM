package College;  
  
// Java Program to Illustrate StudentRecordManagement Class  
  
// Importing required classes  
import java.util.LinkedList;  
import java.util.Scanner;  
  
// Class  
public class StudentRecordManagement {  
  
    // Creating an empty LinkedList to store records  
    LinkedList<Record> list;  
  
    // Default Constructor  
    public StudentRecordManagement() {  
        list = new LinkedList<>(); // Initialize the linked list  
    }  
  
    // Method 1  
    // Adding Record  
    // @param record  
    public void add(Record record) {  
  
        // Checking if a record already exists or not,  
        //If not, add it to the Record list; otherwise,  
        // display an error message  
        if (!find(record.getIdNumber())) {  
            list.add(record);  
        } else {  
  
            // Print statement  
            System.out.println("Record already exists in the Record list");  
        }  
    }  
  
    // Method 2  
    // Searching Record  
    // @param idNumber  
    // @return  
    public boolean find(int idNumber) {  
  
        // Iterating over the record list using a for-each loop  
        for (Record l : list) {  
  
            // Checking if a record with the given idNumber exists  
            if (l.getIdNumber() == idNumber) {  
  
                // Print the found record  
                System.out.println(l);  
                return true;  
            }  
        }  
        return false; // Return false if the record is not found  
    }  
  
    // Method 3  
    // Delete Record  
    // @param recIdNumber  
    public void delete(int recIdNumber) {  
        Record recordDel = null;  
  
        // Iterating over the record list  
        for (Record ll : list) {  
  
            // Finding the record to be deleted by id Number  
            if (ll.getIdNumber() == recIdNumber) {  
                recordDel = ll;  
            }  
        }  
  
        // If recordDel is null, then show an error message,  
        //Otherwise, remove the record from the Record list  
        if (recordDel == null) {  
  
            // Displaying a message for an invalid record ID  
            System.out.println("Invalid record Id");  
        } else {  
  
            list.remove(recordDel);  
  
            // Display a message for the successful deletion of the record  
            System.out.println("Successfully removed record from the list");  
        }  
    }  
  
    // Method 4  
    // Finding Record  
    // @param idNumber  
    // @return  
    public Record findRecord(int idNumber) {  
  
        // Iterate over the Record list using a for-each loop  
        for (Record l : list) {  
  
            // Checking if a record with the given id Number exists  
            if (l.getIdNumber() == idNumber) {  
                return l; // Return the found record  
            }  
        }  
  
        return null; // Return null if the record is not found  
    }  
  
    // Method 5  
    // Update Record  
    // @param id  
    // @param input  
    public void update(int id, Scanner input) {  
  
        if (find(id)) {  
            Record rec = findRecord(id);  
  
            // Display a message only  
            System.out.print("What is the new Student id Number? ");  
            int idNumber = input.nextInt();  
  
            // Display a message only  
            System.out.print("What is the new Student contact Number? ");  
            long contactNumber = input.nextLong();  
            input.nextLine();  
  
            // Display a message only  
            System.out.print("Please enter the updated student's name: ");  
            String name = input.nextLine();  
  
            // Update the record with new values  
            rec.setIdNumber(idNumber);  
            rec.setName(name);  
            rec.setContactNumber(contactNumber);  
            System.out.println("Record Updated Successfully");  
        } else {  
  
            // Print statement  
            System.out.println("Record Not Found in the Student list");  
        }  
    }  
  
    // Method 6  
    // Display Records  
    public void display() {  
  
        // If the record list is empty, then  
        // print the message below  
        if (list.isEmpty()) {  
  
            // Print statement  
            System.out.println("The list has no records\n");  
        }  
  
        // Iterating over the Record list using a for-each loop  
        for (Record record : list) {  
  
            // Printing the record details  
            System.out.println(record.toString());  
        }  
    }  
}   