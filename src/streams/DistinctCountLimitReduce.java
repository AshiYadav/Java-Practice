package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DistinctCountLimitReduce {

    public static void main (String args[]){

        // List<String> li = Arrays.asList("i20","Seltos","Swift","i20","Creta","Swift");

        // Distinct
        //li.stream().distinct().forEach(System.out::println);

        // Limit
        //li.stream().distinct().limit(2).forEach(System.out::println);

        //count

        //Long t = li.stream().distinct().count();
        //System.out.println(t);


        //List<Integer> li = Arrays.asList(1,4,2,6,3,5,9,44,11,88,45);

//        long t = li.stream().filter(x -> x%2 == 0).count();
//        System.out.println(t);

        // Finding min

        // Optional<Integer> t = li.stream().min((a, b) -> a-b);
        //Optional<Integer> t = li.stream().min((a, b) -> {return a.compareTo(b);});
         // Optional<Integer> t = li.stream().max((a, b) -> b-a);
         //System.out.println(t.get());

        // Finding Max

        // Optional<Integer> t = li.stream().max((a, b) -> a-b);
        //Optional<Integer> t = li.stream().min((a, b) -> {return b.compareTo(a);});
        // Optional<Integer> t = li.stream().min((a, b) -> b-a);
         //System.out.println(t.get());



        // ******** Reduce ***************


//        List<String> li = Arrays.asList("A","B","1","C","2");
//        Optional<String> ans = li.stream().reduce((acc,curr) -> {
//            return acc+curr;
//        });
//        System.out.println(ans.get());

        List<Integer> li = Arrays.asList(1,2,5,2,8,5,0);
        Optional<Integer> ans = li.stream().reduce((acc,curr) -> {
            return acc+curr;
        });
        System.out.println(ans.get());


    }
}
