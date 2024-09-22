package College;  
  
// Class  
public class Record {  
  
    // Instance variables  
    private String name;  
    private int idNumber;  
    private long contactNumber; // Change the type to long  
  
    // Default Constructor  
    public Record() {}  
  
    // Parameterized Constructor  
    // @param name - The name of the record  
    // @param idNumber - The ID number of the record  
    // @param contactNumber - The contact number of the record  
    public Record(String name, int idNumber, long contactNumber) // Change the type to long  
    {  
  
        // this keyword refers to the current instance itself  
        this.name = name;  
        this.idNumber = idNumber;  
        this.contactNumber = contactNumber;  
    }  
  
    // Getting the value of contactNumber  
    // @return the value of contactNumber  
    public long getContactNumber() { return contactNumber; } // Change the return type to long  
  
    // Set the value of contactNumber  
    // @param contactNumber - The new value of contactNumber  
    public void setContactNumber(long contactNumber) // Change the type to long  
    {  
        this.contactNumber = contactNumber;  
    }  
  
    // Getting the value of idNumber  
    // @return the value of idNumber  
    public int getIdNumber() { return idNumber; }  
  
    // Setting the value of idNumber  
    // @param idNumber - The new value of idNumber  
    public void setIdNumber(int idNumber)  
    {  
        this.idNumber = idNumber;  
    }  
  
    // Getting the value of name  
    // @return the value of name  
    public String getName() { return name; }  
  
    // Setting the value of name  
    // @param name - The new value of name  
    public void setName(String name) { this.name = name; }  
  
    // toString() Method  
    // @return - A string representation of the record  
    @Override  
    public String toString()  
    {  
  
        // Returning the record as a formatted string  
        return "Record{" +  
            "name='" + name + '\'' +  
            ", idNumber=" + idNumber +  
            ", contactNumber=" + contactNumber +  
            '}';  
    }  
}  