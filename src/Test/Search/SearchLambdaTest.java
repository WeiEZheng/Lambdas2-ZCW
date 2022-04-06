package Search;

import Person.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchLambdaTest {

    @Test
    void printPersonsLambda() {
        //Given
        List<Person> people = new ArrayList<>();
        Person subject1 = new Person("Subject1",
                LocalDate.of(1992,1,1),
                Person.Sex.MALE,
                "subject1@email.com");
        people.add(subject1);
        Person subject2 = new Person("Subject2",
                LocalDate.of(1993,1,1),
                Person.Sex.MALE,
                "subject2@email.com");
        people.add(subject2);
        Person subject3 = new Person("Subject3",
                LocalDate.of(2010,1,1),
                Person.Sex.MALE,
                "subject3@email.com");
        people.add(subject3);
        Person subject4 = new Person("Subject1",
                LocalDate.of(1995,1,1),
                Person.Sex.FEMALE,
                "subject4@email.com");
        people.add(subject4);
        Person subject5 = new Person("Subject5",
                LocalDate.of(2011,1,1),
                Person.Sex.FEMALE,
                "subject5@email.com");
        people.add(subject5);
        //When
        String expected = subject1.printPerson()+subject2.printPerson()+subject4.printPerson();
        String actual = SearchLambda.printPersonsLambda(people);
        //Then
        Assertions.assertEquals(expected,actual);
    }
}