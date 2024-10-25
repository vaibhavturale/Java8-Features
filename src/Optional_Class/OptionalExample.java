package Optional_Class;

import java.util.Optional;

import static java.util.Optional.of;

public class OptionalExample {
    public static void main(String[] args) {

        String str="Learning Optional Class";

        Optional<String> optional=Optional.ofNullable(str);
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("Value Not Present"));

    }
}
