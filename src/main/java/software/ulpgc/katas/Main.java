package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person Julian = new Person("Julian", LocalDate.of(2005, 10, 21));
        System.out.println(Julian);
        System.out.println(Julian.);
    }
}
