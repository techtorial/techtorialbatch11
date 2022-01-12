package map;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeTest {
    public static void main(String[] args) {

        HashMap <Integer, Employee> mapOfEmployee = new HashMap();

        Employee e1 = new Employee("Max", "New York", 21, 1);
        Employee e2 = new Employee("Tim", "St Loius", 22, 2);
        Employee e3 = new Employee("David", "Denver", 34, 9);
        Employee e4 = new Employee("John", "New Mexico", 43, 19);

        mapOfEmployee.put(e1.id, e1);
        mapOfEmployee.put(e2.id, e2);
        mapOfEmployee.put(e3.id, e3);
        mapOfEmployee.put(e4.id, e4);

        System.out.println(mapOfEmployee);
        ArrayList <String> names = new ArrayList<>();

            for (Employee employee : mapOfEmployee.values()){
                names.add(employee.name);
                System.out.println(employee.name);
                System.out.println(employee.city.toUpperCase());
            }

        System.out.println(names);


    }
}
