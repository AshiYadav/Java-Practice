package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted {

    public static void main (String args[]){

        // Sorted in asc order

        //List<Integer> list = Arrays.asList(1,5,2,7,3,0,9,8);
        //list.stream().sorted().forEach(System.out::println);

        // Sorted in reverse order
        //list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        List<String> list = Arrays.asList("David","Ashish","Uma","Kia");
        //list.stream().sorted().forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);



    }
}
