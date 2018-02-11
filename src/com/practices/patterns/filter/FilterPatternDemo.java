package com.practices.patterns.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Robert","Male", "Single"));
        people.add(new Person("John", "Male", "Married"));
        people.add(new Person("Laura", "Female", "Married"));
        people.add(new Person("Diana", "Female", "Single"));
        people.add(new Person("Mike", "Male", "Single"));
        people.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPeople(male.meetCriteria(people));

        System.out.println("\nFemales: ");
        printPeople(female.meetCriteria(people));

        System.out.println("\nSingle Males: ");
        printPeople(singleMale.meetCriteria(people));

        System.out.println("\nSingle Or Females: ");
        printPeople(singleOrFemale.meetCriteria(people));
    }

    private static void printPeople(List<Person> people) {
        for (Person person : people) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
