import java.util.Scanner;

public class Employee 
{
    private String fName;
    private String lName;
    private double salary;
    
    // default constructor 
    public Employee()
    {
        fName = " ";
        lName = " ";
        salary = 0.0;
    }
    
    // constructor 1 
    public Employee(String fName, String lName, double salary)
    {
        Scanner input = new Scanner(System.in);
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        
        while(salary < 0.0)
        {
           System.out.println("Salary cannot be below 0: ");
           System.out.println("Please enter salary above 0: ");
           salary = input.nextDouble();
           
           this.salary = salary;
        }
    }
    
    public void setFirstName(String fName)
    {
        this.fName = fName;
    }
    
    public void setLastName(String lName)
    {
        this.lName = lName;
    }
    
    public void setSalary(double salary)
    {

      this.salary = salary;  
        
    }
    
    public String getFirstName()
    {
        return fName;
    }
    
    public String getLastName()
    {
        return lName;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
}










