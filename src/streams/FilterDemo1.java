package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;





public class FilterDemo1 {

    public static void main (String args[]){



        // ***********************filter based on even numbers ****************************************

        // List<Integer> list = Arrays.asList(10,15,27,31,44,21,8);
        // List<Integer> filteredList = list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        // System.out.println("Filtered List is : "+filteredList);

        // filter based on even numbers and using Consumer interface
        //list.stream().filter(x -> x%2 == 0).forEach(t -> System.out.println(t));

        // filter based on even numbers and using Consumer interface and using shortcut i.e. replacing lambda expression
        //list.stream().filter(x -> x%2 == 0).forEach(System.out::println);


        // ***************************  filter Names on length > 6 and  < 8 *******************************

        //List<String> list = Arrays.asList("Ashok","Lomal","Ram","AAshish","Yadav","BahotLambaNaam");

        // List<String> filteredList = list.stream().filter(str -> str.length() > 6 && str.length() < 8).collect(Collectors.toList());
        // System.out.println("Filtered List is : "+filteredList);

        // filter based on String length and using Consumer interface
        // list.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(t -> System.out.println(t));

        // filter based on String length and using Consumer interface and using shortcut i.e. replacing lambda expression
        // list.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(System.out::println);


        // ********************************** filter data based on null ***********************************

        // List<String> list = Arrays.asList("Ashok","Lomal",null,"AAshish",null,"BahotLambaNaam");

        // filter based on String length and using Consumer interface and using shortcut i.e. replacing lambda expression
        // list.stream().filter(str -> str != null).forEach(System.out::println);


        // ********************************** filter object based on salary > 30000 ********************************

        List<Employee> empList = Arrays.asList(
                new Employee(10,"Ashish", 10000),
                new Employee(20,"Yadav", 8000),
                new Employee(23,"Ram", 30000),
                new Employee(25,"Sham", 70000),
                new Employee(26,"Suresh", 45000),
                new Employee(30,"Ashish", 20000));

        //empList.stream().filter(x -> x.getSalary() > 25000).forEach(t -> System.out.println(t.getName()));

        // Filtering salary based on 25000 and also printing the names of employee
        //empList.stream().filter(x -> x.getSalary() > 25000).map(Employee::getName).forEach(System.out::println);

        // Filtering salary based on 25000 and also collecting the names of employee
        // List<String> names = empList.stream().filter(x -> x.getSalary() > 25000).map(Employee::getName).collect(Collectors.toList());
        // System.out.println("Filtered name list : "+names);

        //empList.stream().sorted((a,b) -> a.getSalary() - b.getSalary()).map(Employee::getSalary).forEach(System.out::println);
    }
}

class Employee{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


