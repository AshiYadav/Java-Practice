package streams;

import java.util.HashSet;
import java.util.Set;

public class Match {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("One Ashish");
        set.add("Two Ashish");
        set.add("One Ashish");
        set.add("Three Ashish");
        set.add("Two Ashish");

        // ***** any match : it will check whether string is starting with given string or not return boolean value

//        boolean ans = set.stream().anyMatch(x -> {
//            return x.startsWith("One");
//        });
//        System.out.println(ans);

        // ***** all match : it will check whether all strings are starting with given string or not return boolean value

//        boolean ans = set.stream().allMatch(x -> {
//            return x.startsWith("One");
//        });
//        System.out.println(ans);


        // ***** none match : it will check whether all strings does not starting with given string and return boolean value

//        boolean ans = set.stream().noneMatch(x -> {
//            return x.startsWith("One");
//        });
//        System.out.println(ans);
    }
}
