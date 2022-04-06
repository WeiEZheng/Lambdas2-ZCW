package Person;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        Period period = Period.between(birthday, LocalDate.now());
        return period.getYears();
    }

    public void printPerson() {
        String print = "Name: "+name+
                "\nBirthdate: "+birthday.toString()+
                "\nGender: "+gender+
                "\nEmail Adddress: "+emailAddress;
        System.out.println(print);
    }
}
