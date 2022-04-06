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

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        Period period = Period.between(birthday, LocalDate.now());
        return period.getYears();
    }

    public String printPerson() {
        String print = "Name: "+name+
                "\nBirthdate: "+birthday.toString()+
                "\nGender: "+gender+
                "\nEmail Adddress: "+emailAddress+
                "\n---------";
        return print;
    }
}
