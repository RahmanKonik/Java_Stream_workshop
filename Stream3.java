import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Stream;

/* creating a stream from a hashSet 
 * 
 * 
 */

public class Stream3 {

    public static void main(String[] agrs){

    //String array list

    ArrayList<String> list = new ArrayList<>();

    list.add("k");
    list.add("o");
    list.add("n");
    list.add("i");
    list.add("k");

    Stream<String> arrayListStream = list.stream();
    
    arrayListStream.forEach(n -> System.out.print(n));

    //Integer array list

    ArrayList<Integer> number = new ArrayList<>();

    number.add(1);
    number.add(2);
    number.add(3);
    number.add(4);

    Stream<Integer> numberStream = number.stream();
    System.out.println();

    numberStream.forEach(value -> System.out.print(value));


    // hashset 

    HashSet<String> set = new HashSet<>();

    set.add("b");
    set.add("a");
    set.add("n");
    set.add("i");
    set.add("k");

    Stream<String> setStream = set.stream();
    System.out.println();

    setStream.forEach(System.out::println);





    }

}
