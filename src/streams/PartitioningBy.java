package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class DJ{
    String name;
    int id;

    public DJ(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

public class PartitioningBy {

    public static void main(String[] args) {

//        This method partitions the elements of a stream into two groups based on a given predicate.
//        The result is a Map<Boolean, List<T>> where the keys are true and false,
//        and the values are lists of elements that match the predicate and
//        do not match the predicate, respectively
//        It return map<Bollean,List>

        List<DJ> list  = Arrays.asList(
                new DJ("Ashish",5),
                new DJ("Yadav",3),
                new DJ("Kumar",8),
                new DJ("Uma",1),
                new DJ("Kia",10),
                new DJ("Mom",7)

        );

        Map<Boolean,List<DJ>> map  = list.stream().collect(Collectors.partitioningBy(x -> x.getId() > 5));
         System.out.println(map);
    }
}
