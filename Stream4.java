import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Stream4 {

    public static void main(String[] agrs){

        Map<String, Integer> map = new HashMap<>();

        map.put("e",1);
        map.put("a",2);
        map.put("d",3);
        map.put("c",4);
        map.put("b",5);

        Stream<Map.Entry<String, Integer>> stream = map.entrySet().stream();

        stream.forEach(entry -> System.out.println(entry.getKey() +": "+entry.getValue()));
    }
    
}
