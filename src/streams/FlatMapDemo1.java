package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    int id;
    String name;
    char grade;

    public Student(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
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
}

public class FlatMapDemo1 {

    public static void main(String args[]) {

        // Flat map takes 1 argument and return stream of objects because 1 argument is basically list of integer or list of some other objects
        // Where as Map takes 1 argument and do operation and return 1 result


        // ************* FLat map collect all complex objects from colletion tolist **************

//        List<Integer> list1 = Arrays.asList(1, 2);
//        List<Integer> list2 = Arrays.asList(3, 4);
//        List<Integer> list3 = Arrays.asList(5, 6);
//
//        List<List<Integer>> fin = Arrays.asList(list1, list2, list3);

        // List<Integer> ans = fin.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        // System.out.println("Flatmap list is : " + ans);

        //fin.stream().flatMap(x -> x.stream()).forEach(System.out::println);

        // *************** Doing more operation on flat map***************************************

        //fin.stream().flatMap(x -> x.stream().map(t -> t*3)).forEach(System.out::println);


        // *************** Doing more operation on flat map***************************************

//        List<String> list1 = Arrays.asList("Ashish","Yadav","Kumar");
//        List<String> list2 = Arrays.asList("Kia","Rao","Sharma");
//        List<String> list3 = Arrays.asList("Uma","Kumar","Singh");
//
//        List<List<String>> ans = Arrays.asList(list1,list2,list3);
//        ans.stream().flatMap(x -> x.stream()).forEach(System.out::println);


        // *************** Doing flat map on List of Objects  ***************************************

        List<Student> list1 = Arrays.asList(
                new Student(1,"Ashish",'A'),
                new Student(2,"Kia",'B'),
                new Student(3,"Uma",'C')
        );

        List<Student> list2 = Arrays.asList(
                new Student(4,"Mom",'D'),
                new Student(5,"Dad",'E'),
                new Student(6,"Didi",'F')
                );

        List<List<Student>> fin = Arrays.asList(list1,list2);

        fin.stream().flatMap(x -> x.stream().map(Student::getName)).forEach(System.out::println);


    }

}
