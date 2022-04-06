package Search;

import Person.Person;

import java.util.List;

public class SearchAnonymous {
    public static String printPersonsAnonymous(List<Person> roster){
        return printPersons(roster, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getAge()>=18;
            }
        });
    }

    public static String printPersons(List<Person> roster, CheckPerson tester) {
        String result = "";
        for (Person p : roster) {
            if (tester.test(p)) {
                result+=p.printPerson();
                System.out.println(p.printPerson());
            }
        }
        return result;
    }
}
