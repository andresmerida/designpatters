package com.practices.patterns.filter;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> people);
}
