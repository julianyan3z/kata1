package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person julian = new Person("julian", LocalDate.of(2005, 10, 2));
        System.out.println(julian);
    }
}
