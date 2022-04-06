package Search;

import Person.Person;

import java.util.List;

public class SearchLocal implements CheckPerson{
    public static String printPersonsLocal(List<Person> roster){
        return printPersons(roster, new SearchLocal());
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

    @Override
    public boolean test(Person p) {
        return p.getAge()>=18;
    }
}
