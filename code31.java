// Q2: Person class with Employee subclass

class Person {
    // Instance variables
    String fname;
    String lname;
    
    // Constructor
    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
    
    // Method to get first name
    public String getFirstName() {
        return fname;
    }
    
    // Method to get last name
    public String getLastName() {
        return lname;
    }
}

class Employee extends Person {
    // Instance variables
    String jobtitle;
    int empid;
    
    // Constructor
    public Employee(String fname, String lname, int empid, String jobtitle) {
        super(fname, lname);
        this.empid = empid;
        this.jobtitle = jobtitle;
    }
    
    // Method to get employee ID
    public int getEmployeeId() {
        return empid;
    }
    
    // Override getLastName to include job title
    @Override
    public String getLastName() {
        return lname + " - " + jobtitle;
    }
    
    // Display method in child class
    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + empid);
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Job Title: " + jobtitle);
        System.out.println("Full Name with Job: " + getFirstName() + " " + getLastName());
    }
}

// Main class to test
public class Q2_PersonEmployeeDemo {
    public static void main(String[] args) {
        System.out.println("=== Testing Person ===");
        Person person = new Person("John", "Smith");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        
        System.out.println("\n=== Testing Employee ===");
        Employee emp1 = new Employee("Sarah", "Johnson", 1001, "Software Engineer");
        emp1.display();
        
        System.out.println("\n=== Testing Another Employee ===");
        Employee emp2 = new Employee("Mike", "Davis", 1002, "Manager");
        emp2.display();
        
        System.out.println("\n=== Testing getEmployeeId() method ===");
        System.out.println("Employee ID: " + emp1.getEmployeeId());
    }
}
