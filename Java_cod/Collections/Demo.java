import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}


class Demo{
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Alice", 22),
                new Person("Bob", 17),
                new Person("Charlie", 22)
        );

// Example: Collect names of adults (age >= 18)
        Stream<String> adults = personList.stream()
                .filter(p -> p.getAge() >= 18)
                .map(p -> p.getName());

        adults.forEach(System.out::println);



    }

}