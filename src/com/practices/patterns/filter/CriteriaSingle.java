package com.practices.patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> singlePeople = new ArrayList<>();

        for (Person person : people) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePeople.add(person);
            }
        }

        return singlePeople;
    }
}
