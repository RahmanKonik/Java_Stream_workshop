import java.util.Arrays;
import java.util.stream.Stream;

public class Stream2 {

    public static void main(String[] args){

        String[] name = {"K","o","n","i","k"};

        Stream<String> stream = Stream.of(name);

        stream.forEach(System.out::print);

        int number[] = {1,2,3,4,5,6};

        Stream<int[]> streamNum = Stream.of(number);


        streamNum.flatMapToInt(Arrays::stream).forEach(item -> System.out.println(item));


    }
    
}
