package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapDemo1 {

    public static void main (String args[]) {


        // *********************** Map String to uppercase ****************************************

        // List<String> list = Arrays.asList("ashi","Yadv","KUMAR","NeHa","TilII","Ashish","3848");

        // List<String> upp  = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        // System.out.println("Mapped List is : "+upp);

        // list.stream().map(x -> x.toUpperCase()).forEach(System.out::println);


        // *********************** Map String length to collection ****************************************

         //List<String> list = Arrays.asList("ashi","Yadv","KUMAR","NeHa","TilII","Ashish","3848");

         // List<Integer> leng = list.stream().map(x -> x.length()).collect(Collectors.toList());
         // Set<Integer> leng = list.stream().map(x -> x.length()).collect(Collectors.toSet());
         //System.out.println("Mapped string length : "+leng);



        // *********************** Map number to mul 3 ****************************************

        // List<Integer> list = Arrays.asList(4,5,7,0,1,8,6);

        // list.stream().map(x -> x * 3).forEach(System.out :: println);


        // *********************** FIlter salary  > 25000 and return only salary to List ****************************************


//        List<Employee> empList = Arrays.asList(
//                new Employee(10,"Ashish", 10000),
//                new Employee(20,"Yadav", 8000),
//                new Employee(23,"Ram", 30000),
//                new Employee(25,"Sham", 70000),
//                new Employee(26,"Suresh", 45000),
//                new Employee(30,"Ashish", 20000));

        // List<Integer> li = empList.stream().filter(x -> x.getSalary() > 25000).map(t -> t.getSalary()).collect(Collectors.toList());
        // System.out.println("Filtered and map list  is : "+ li);
    }
}

class Employee1{
    int id;
    String name;
    int salary;

    public Employee1(int id, String name, int salary) {
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
