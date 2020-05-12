import java.util.Optional;

public class Main {
    public static void main(String args[]){
//        Optional<Object> empty = Optional.empty();
//
//        System.out.println(empty.isPresent());
//        System.out.println(empty);
//        Optional<String> stringOptional = Optional.ofNullable(null);
//        System.out.println(stringOptional.isPresent());
//        System.out.println(stringOptional.isEmpty());
//
//
//       stringOptional.ifPresent(word ->{
//           System.out.println(word);
//       } );
//
//        stringOptional.ifPresentOrElse(System.out::println, () ->{System.out.println("hello");});

        Person person = new Person("bibek","BIBEk@gmail.com");
        System.out.println(person.getEmail().map(String::toLowerCase).orElse("email is not provided"));

    }

}
class Person{
    private final String name;
    private final String email;

    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
