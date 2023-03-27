import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sound.sampled.SourceDataLine;

public class Main1 {

    public static void main(String[] args){

        try {

            List<ShoppingArticle1> database = loadDatabaseFile();

        } catch (IOException e) {

            e.printStackTrace();
        }


    }

    public static List<ShoppingArticle1> loadDatabaseFile() throws IOException {

        try (Stream<String> stream = Files.lines(Path.of("database.csv"))) {

            stream
                  .peek((line)-> {
                    System.out.println(line);
                  })
                  .skip(1)

                  .map((line)-> {
                    return line.split(",");
                  })
                  .peek((arr) -> {
                    System.out.println(Arrays.toString(arr));
                  })

                  .map((arr) -> {
                    return new ShoppingArticle1(arr[0], arr[1], Double.valueOf(arr[2]),arr[3]);
                  })
                  .peek(System.out::println)

                  .collect(Collectors.toUnmodifiableList());
            
        } catch (IOException e) {

            e.printStackTrace();
        }
        return null;
    }
    
}
