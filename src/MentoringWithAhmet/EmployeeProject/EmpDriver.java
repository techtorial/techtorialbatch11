package MentoringWithAhmet.EmployeeProject;

public class EmpDriver {
    public static void main(String[] args) {
        Employee employee1=new Employee("Kemal",2000,45,1985);
        employee1.information(employee1);
        Employee employee2= new Employee("Ahmet", 4000,50,2019);
        employee2.information(employee2);
    }
}
