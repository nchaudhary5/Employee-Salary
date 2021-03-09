import java.util.Scanner;

class EmployeeTest 
{
    public static void main(String[] args)
    {
        String f;
        String l;
        double s;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Employee 1:"); 
        System.out.print("Enter first Name: ");
        f = input.nextLine();
        
        System.out.print("Enter last Name: ");
        l = input.nextLine();
        
        System.out.print("Enter salary: $");
        s = input.nextDouble();
        
        Employee E1 = new Employee(f, l, s);
        // print information 
     
        System.out.println("--------------------");
        System.out.println("First Name is: " + E1.getFirstName());
        System.out.println("Last Name is: " + E1.getLastName());
        System.out.println("monthly Salary: $" + E1.getSalary());
        System.out.println("Yearly salary: $" + (E1.getSalary() * 12));
        System.out.println("After 10% raise, yearly salary is: " + (((E1.getSalary() * 12) * 0.1) + (E1.getSalary() * 12))); 
     
     
        System.out.println("\nEmployee 2:");
        System.out.println("------------");
        input.nextLine();
     
        System.out.print("Enter first Name: ");
        f = input.nextLine();
        
        System.out.print("Enter last Name: ");
        l = input.nextLine();
        
        System.out.print("Enter salary: $");
        s = input.nextDouble();
        
        
        Employee E2 = new Employee(f, l, s);
        // print information 
        System.out.println("Employee 1:");
        System.out.println("--------------------");
        System.out.println("First Name is: " + E2.getFirstName());
        System.out.println("Last Name is: " + E2.getLastName());
        System.out.println("Monthly salary: " + E2.getSalary());
        System.out.println("Yearly Salary: $" + E2.getSalary() * 12);
        System.out.println("After 10% raise, yearly salary is: " + (((E2.getSalary() * 12) * 0.1) + (E2.getSalary() * 12))); 
        
    }
}