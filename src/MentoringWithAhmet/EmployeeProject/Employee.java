package MentoringWithAhmet.EmployeeProject;

import java.time.LocalDate;

public class Employee {
    //instance data(variable): is a variable that belongs to the class.(it is a way
    // *** initiliaze your object features.
    String name;
    double salary;
    int workHours;
    int hireYear;

    //Constructor: Constructor is a way of initiliazing the instance variables.
    public Employee(String name, double salary,int workHours,int HireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=HireYear;
    }
    public double Tax(){
        if(salary<=1000){
            return 0.0;
        }else{
            return salary*0.03;
        }
    }
    public double Bonus(){
        //THE LOGIC: it pays every extra hours from 40
        int extraHours = workHours-40;
        if(extraHours>0){
            return extraHours*30;
        }else{
            return 0.0;
        }
    }
    public double increaseSalary(){
        LocalDate now = LocalDate.now();
        int year=now.getYear()-hireYear;
        if(year<10){
            return salary*0.05;
        }else if (year>=9 && year<20){
            return salary*0.1;
        }else{
            return salary*0.15;
        }
    }
    public void information(Employee employee1){
        System.out.println("Name: "+ name);
        System.out.println("Salary " + this.salary);
        System.out.println("Work Hours "+ workHours);
        System.out.println("Hire Year " + hireYear);
        System.out.println("Tax :" + employee1.Tax());
        System.out.println("Bonus :" + Bonus());
        System.out.println("Increased Of Salary " + increaseSalary());
        System.out.println("Salary with Tax and Bonus "+ ((salary- employee1.Tax())+Bonus()));
        System.out.println("Total salary with the Raise of Salary "+ (salary+increaseSalary()));
    }
}
