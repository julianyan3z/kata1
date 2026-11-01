package software.ulpgc.katas;

import java.time.LocalDate;

public record Person(String name, LocalDate birthday) {
    public static final int DAYS_PER_YEARS = 365;

    private int toYears(long days){
        return (int) (days / DAYS_PER_YEARS);
    }

    public int age(){
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }
}
