package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find {

    public static void main(String[] args) {

        // FindAAny with return element if any data present in List
//        List<String> list = Arrays.asList("Two","One","Three","Zero");
//        //List<String> list = Arrays.asList();
//
//        Optional<String> ans = list.stream().findAny();
//        System.out.println(ans.get());
//
//        List<String> list = Arrays.asList("Two","One","Three","Zero");
//        List<String> list = Arrays.asList();


    // FindFirst with return first element if any data present in List

        List<String> list = Arrays.asList("Two","One","Three","Zero");
        Optional<String> ans = list.stream().findFirst();
        System.out.println(ans.get());
    }
}
