public class Employee_details extends Person {
    int id;
    double salary;

    public Employee_details(int id, double salary){
        this.id = id;
        this.salary = salary;
        display_details();
    }

    public void display_details(){
        System.out.println("Employee ID : "+ id);
        System.out.println("Salary : "+ salary);
    }
}