## **Java Design Patterns**

## Singleton Design Pattern in Java (Creational Pattern)

Java Singleton Pattern is one of the Gangs of Four Design patterns and comes in the Creational Design Pattern category. 
From the definition, it seems to be a very simple design pattern but when it comes to implementation, it comes 
with a lot of implementation concerns. The implementation of Java Singleton pattern has always been a controversial 
topic among developers. Here we will learn about Singleton design pattern principles, different ways to 
implement Singleton design pattern and some of the best practices for it’s usage.

#### Java Singleton 
* Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
* The singleton class must provide a global access point to get the instance of the class. 
* Singleton pattern is used for logging, drivers objects, caching and thread pool.
* Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
* Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.

To implement Singleton pattern, we have different approaches but all of them have following common concepts.

* Private constructor to restrict instantiation of the class from other classes.
* Private static variable of the same class that is the only instance of the class.
* Public static method that returns the instance of the class, this is the global access point for outer world 
to get the instance of the singleton class.

great reference: 

https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples

You can see three examples explained in the package: com.practices.patterns.singleton;


## Factory Design Pattern in Java (Creational Pattern)

Factory Pattern is one of the Creational Design pattern and it’s widely used in JDK as well as frameworks like Spring and Struts.

Factory design pattern is used when we have a super class with multiple sub-classes and based on input, 
we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class 
from client program to the factory class.

Super class in factory design pattern can be an interface, abstract class or a normal java class.

#### Factory Design Pattern Advantages

* Factory design pattern provides approach to code for interface rather than implementation.
* Factory pattern removes the instantiation of actual implementation classes from client code. 
  Factory pattern makes our code more robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.
* Factory pattern provides abstraction between implementation and client classes through inheritance.

#### Factory Design Pattern Examples in JDK

* java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
* valueOf() method in wrapper classes like Boolean, Integer etc.

You can see three examples in package: com.practices.patterns.factory

## Builder Design Pattern in Java (Creational Pattern)

Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns 
when the Object contains a lot of attributes.

There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

* Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, 
the type of arguments are same and from client side its hard to maintain the order of the argument.
* Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters 
and optional parameters need to send as NULL.
* If the object is heavy and its creation is complex, then all that complexity will be part of 
Factory classes that is confusing.

We can solve the issues with large number of parameters by providing a constructor with required parameters 
and then different setter methods to set the optional parameters. The problem with this approach is that the Object 
state will be inconsistent until unless all the attributes are set explicitly.

Builder pattern solves the issue with large number of optional parameters and inconsistent state 
by providing a way to build the object step-by-step and provide a method that will actually return the final Object.

Let’s see how we can implement builder design pattern in java.

1. First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class. 
We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.
2. Java Builder class should have a public constructor with all the required attributes as parameters.
3. Java Builder class should have methods to set the optional parameters and it should return the same Builder 
object after setting the optional attribute.
4. The final step is to provide a build() method in the builder class that will return the Object needed by client program. 
For this we need to have a private constructor in the Class with Builder class as argument.

#### Builder Design Pattern Example in JDK

Some of the builder pattern example in Java classes are;

* java.lang.StringBuilder#append() (unsynchronized)
* java.lang.StringBuffer#append() (synchronized)

You can see an example in the package: com.practices.patterns.builder

## Prototype Design Pattern in Java (Creational Pattern)

Prototype design pattern is one of the Creational Design pattern, so it provides a mechanism of object creation.

rototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources 
and you have a similar object already existing.

Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. 
Prototype design pattern uses java cloning to copy the object.

It would be easy to understand prototype design pattern with an example. 
Suppose we have an Object that loads data from database. Now we need to modify this data in our program multiple times, 
so it’s not a good idea to create the Object using new keyword and load all the data again from database.

The better approach would be to clone the existing object into a new object and then do the data manipulation.

If the object cloning was not provided, we will have to make database call to fetch the employee list every time. 
Then do the manipulations that would have been resource and time consuming.

You can see two samples program showing Prototype design pattern example in java:
    package: com.practices.patterns.prototype
    
## Adapter Design Pattern in Java (Structural Design Pattern)

Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work 
together. The object that joins these unrelated interface is called an Adapter.

One of the great real life example of Adapter design pattern is mobile charger. Mobile battery needs 3 volts to charge 
but the normal socket produces either 120V (US) or 240V (India). So the mobile charger works as an adapter 
between mobile charging socket and the wall socket.

#### Adapter Design Pattern Example in JDK

Some of the adapter design pattern example I could easily find in JDK classes are;

* java.util.Arrays#asList()
* java.io.InputStreamReader(InputStream) (returns a Reader)
* java.io.OutputStreamWriter(OutputStream) (returns a Writer)

## Bridge Design Pattern in Java (Structural Design Pattern)

Today we will look into Bridge Design Pattern in java. When we have interface hierarchies in both interfaces 
as well as implementations, then bridge design pattern is used to decouple the interfaces from implementation 
and hiding the implementation details from the client programs.

According to GoF bridge design pattern is: 

Decouple an abstraction from its implementation so that the two can vary independently

Bridge design pattern can be used when both abstraction and implementation can have different hierarchies 
independently and we want to hide the implementation from the client application.

Good reference: https://www.journaldev.com/1491/bridge-design-pattern-java

We can see the example implement in the package: com.practices.patterns.bridge
    
## Composite Design Pattern in Java (Structural Design Pattern)

Composite pattern is used where we need to treat a group of objects in similar way as a single object. 
Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. 
This type of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.

This pattern creates a class that contains group of its own objects. This class provides ways to modify its group of same objects.

We are demonstrating use of composite pattern via following example in which we will show employees hierarchy of an organization.

#### Implementation

We have a class Employee which acts as composite pattern actor class. CompositePatternDemo, 
our demo class will use Employee class to add department level hierarchy and print all employees.

![screen shot 2018-02-09 at 12 35 00 pm](https://user-images.githubusercontent.com/6967921/36038671-b6f3c782-0d96-11e8-9aeb-56a5d5a37d38.png)
