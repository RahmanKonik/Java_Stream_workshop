import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Stream1 {

    public static void main(String[] args){

        List<String> names = Arrays.asList("alice","Bob","Deb");

        Stream<String> nameStream = names.stream();

        nameStream.forEach(item -> System.out.println(item));

        List<Integer> number = Arrays.asList(1,2,3,4);

        Stream<Integer> numberStream = number.stream();

        numberStream.forEach(numbers -> System.out.println(numbers));
        

        // create a stream with list

        List<String> person = Arrays.asList("K","o","n","i","k");

        Stream<String> namePerson = person.stream();

        // print the string  by namePerson

        namePerson.forEach(value -> System.out.print(value));
        
    }
}