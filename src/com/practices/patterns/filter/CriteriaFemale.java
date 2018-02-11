package com.practices.patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

    public static final String FEMALE_GENDER = "FEMALE";

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> femalePeople = new ArrayList<>();

        for (Person person : people) {
            if (person.getGender().equalsIgnoreCase(FEMALE_GENDER)) {
                femalePeople.add(person);
            }
        }

        return femalePeople;
    }
}
