import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Person {

    private String name;
    private int age;

    public Person( String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){

        return name;
    }

    public int getAge(){
        return age;
    }
}


public class Stream6 {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(
            new Person("Konik",23),
            new Person("onik",24),
            new Person("Newton",25));

        Stream<String> names = people.stream()
               .map(Person::getName)
               .filter(name -> name.startsWith("K"));

        names.forEach(System.out::println);
    }
    
}


