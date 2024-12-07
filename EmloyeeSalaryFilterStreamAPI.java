import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

class Employee {
    int salary = 0;
}


public class EmloyeeSalaryFilterStreamAPI {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();


        e1.salary = 56000;
        e1.salary = 6000;
        e1.salary = 46000;
        e1.salary = 96000;


        ArrayList<Integer> empSalary = new ArrayList<>(Arrays.asList(e1.salary,e2.salary,e3.salary,e4.salary));

        List<Integer> salary = empSalary.stream().filter(n -> (n > 50000)).collect((Collectors.toList()));
        System.out.println(salary);

    }
}
