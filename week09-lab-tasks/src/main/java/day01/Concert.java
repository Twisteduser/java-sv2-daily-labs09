package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person, LocalTime actual){
        if (actual.isBefore(person.getTicket().entryTime())){
            throw new IllegalArgumentException("Can not get in");
        }
        people.add(person);
    }
}
