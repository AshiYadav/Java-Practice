package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Ashish","Kia");
        List<String> list2 = Arrays.asList("Mom","Dad");

        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

        List<String> str = Stream.concat(stream1,stream2).collect(Collectors.toList());
        System.out.println(str);
    }
}
