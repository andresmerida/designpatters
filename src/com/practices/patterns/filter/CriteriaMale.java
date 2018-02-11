package com.practices.patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    public static final String MALE_GENDER = "MALE";

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> malePeople = new ArrayList<>();

        for (Person person : people) {
            if (person.getGender().equalsIgnoreCase(MALE_GENDER)) {
                malePeople.add(person);
            }
        }

        return malePeople;
    }
}
