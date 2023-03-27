import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Stream5 {

    public static void main(String[] args){


        String fileName = "myFile.txt";

        try (Stream<String> stream= Files.lines(Paths.get(fileName))) {

            stream.forEach(line -> System.out.println(line));
        } catch (IOException e) {

            System.out.println(e);
        } 


    }
    
}
