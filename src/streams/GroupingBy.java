package streams;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // getters
}

class Student2{
    int id;
    String name;
    char grade;

    double score;

    public Student2(int id, String name, char grade, double score) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.score = score;
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

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}


class EmpSal{
    int salary;
    String dept;

    public EmpSal(int salary, String dept) {
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

public class GroupingBy {



        public static void main(String args[]) {
            List<Student2> students = Arrays.asList(
                    new Student2(1, "Alice", 'A', 50.00),
                    new Student2(2, "Bob", 'B', 30.00),
                    new Student2(3, "Charlie", 'A', 22.00),
                    new Student2(4, "David", 'C', 82.00),
                    new Student2(5, "Eve", 'B', 41.00)
            );

            // *********************Just for printing the Students name under which grade ***************

//            Map<Character,List<Student2>> map = students.stream().collect(Collectors.groupingBy(x -> x.getGrade()));
//            map.forEach((k,v) -> {
//                System.out.println("Key is "+k);
//                v.forEach(x -> System.out.print(" "+x.getName()+" "));
//            });


            // ********************** Counting no,of students within grade ***************************

//            Map<Character,Long> map = students.stream().collect(Collectors.groupingBy(Student2::getGrade, Collectors.counting()));
//
//            map.forEach((k,v) -> System.out.println("Key is "+k+ " and count is "+v));



            // ******************* Grouping Students by Grade and Averaging Their Scores **************

//            Map<Character,Double> map = students.stream().collect(Collectors.groupingBy(Student2::getGrade,Collectors.averagingDouble(Student2::getScore)));
//
//            map.forEach((k,v) -> System.out.println("Key is "+k+ " and average result is "+v));


            // **************** Grouping Students by grade and Summing Their scores

//            Map<Character, Double> map = students.stream()
//            .collect(Collectors.groupingBy(Student2::getGrade, Collectors.summingDouble(Student2::getScore)));
//            map.forEach((k,v) -> System.out.println("Key is "+k+ " and summing result is "+v));


            // ****************** Grouping Persons by Age Range and Finding the Oldest Person in Each Group

//            List<Person> persons = Arrays.asList(
//                    new Person("Alice", 25),
//                    new Person("Bob", 30),
//                    new Person("Charlie", 35),
//                    new Person("David", 40),
//                    new Person("Eve", 45)
//            );

//            Map<String, Optional<Person>> oldestPersons = persons.stream()
//                    .collect(Collectors.groupingBy(
//                            p -> p.getAge() < 30 ? "Young" : p.getAge() < 40 ? "Middle-aged" : "Old",
//                            Collectors.maxBy(Comparator.comparingInt(Person::getAge))
//                    ));
//
//            System.out.println(oldestPersons);



            // ******** find the highest salary in each dept

            List<EmpSal> list = Arrays.asList(
                    new EmpSal(20000, "A"),
                    new EmpSal(13000, "B"),
                    new EmpSal(19000, "A"),
                    new EmpSal(28000, "B"),
                    new EmpSal(88000, "D"),
                    new EmpSal(30000, "A"),
                    new EmpSal(15000, "D")
            );

            Map<String,Optional<EmpSal>> map = list.stream().collect(Collectors.groupingBy(EmpSal::getDept, Collectors.maxBy(Comparator.comparingInt(EmpSal::getSalary))));
            map.forEach((k,v) -> System.out.println("Dept is "+k+" SSalary is "+v.get().getSalary()));


            EmpSal op = list.stream().max(Comparator.comparingInt(EmpSal::getSalary)).get();
            System.out.println(op.getSalary());
        }
}
