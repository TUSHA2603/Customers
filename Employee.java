package Customers;   
    import java.util.*;
public class Employee extends ContracterDetail {
    public Employee(String frsit_Name, String last_Name, String street, String adress, String city, String state,
            String eamil, String number) {
        super(frsit_Name, last_Name, street, adress, city, state, eamil, number);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your First Name");
        String Frsit_Name=sc.next();
        System.out.println("Enter the Last_Name");
        String Last_Name=sc.next();
        System.out.println("Enter your Street");
        String Street=sc.next();
        System.out.println("Enter your Address");
        String Adress=sc.next();
        System.out.println("Enter your City");
        String City=sc.next();
        System.out.println("Enter your State");
        String State=sc.next();
        System.out.println("Enter your Eamil");
        String Eamil=sc.next();
        System.out.println("Enter your Phone Number");
        String Number=sc.next();
        ContracterDetail Employee=new ContracterDetail(Frsit_Name, Last_Name, Street, Adress, City, State, Eamil, Number);
        System.out.println(Employee.getFrsit_Name());
        System.out.println(Employee.getLast_Name());
        System.out.println(Employee.getState());
        System.out.println(Employee.getAdress());
        System.out.println(Employee.getCity());
        System.out.println(Employee.getState());
        System.out.println(Employee.getEamil());
        System.out.println(Employee.getNumber());
        Employee.Detail(Frsit_Name, Last_Name, Street, Adress, City, State, Eamil, Number);

    }
    
}


