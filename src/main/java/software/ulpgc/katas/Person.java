package software.ulpgc.katas;

import java.time.LocalDate;

public record Person(String name, LocalDate birthday) {
    private static final int DAYS_PER_YEAR =365;

    private int toYears(long days){
        return (int)(days / DAYS_PER_YEAR);
    }

    private int age(){
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age() +
                '}';
    }
}
