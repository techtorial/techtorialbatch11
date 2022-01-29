package MentoringWithAhmet.RecapJava.OOP;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /*
    INTERVIEW QUESTION:INHERITANCE:
    1) WHAT DO YOU KNOW ABOUT INHERITANCE AND HOW DO YOU INHERIT TWO CLASSES ?
     *Inheritance is a way to make a connections(relationship) between classes.
     *We need to use EXTENDS KEY WORD to make this connections.
    2)WHY DO YOU NEED INHERITANCE IN YOUR FRAMEWORK ?
     *We need inheritance because of reducing the execution time by minimizing
     the amount of code which  makes your application more safe.
    3)WHAT IS THE ADVANTAGE OF USING INHERITANCE IN OOP?
    -your application will be more safe
    -Your framework will not have duplicated data.(EFFICIENCY)


    INTERVIEW QUESTION:ENCAPSULATION:
    1)What is encapsulation?
    encapsulation is a way to make your data not accessible and manipulable by everyone
    *is a way of restriction the data from the users or classes
    *Limiting the users,classes to access your data
    *it is hiding the data from users or classes.
    2)Why do you use encapsulation?
    3)How can you access the data from encapsulation?
    Getter and Setters.
    4)If encapsulation is hiding the data from users and with getter-setters
    they can still access it? then what is the point of it?
    Because we want to to limit the users or classes with the conditions(format)
    that we want to have.Example is below.

    POLYMORPHISM:
    1)What is polymorphism?
    is a different form of the object/methods.
    2)What is dynamic and static polymorphism?
    Dynamic polymorphism-> Run time --> Overriding
    Static polymorphism --> Compile TIme-->Overloading
    3)What is overloading and overriding?
    Overloading-Overriding:
    1)Overloading must have different method signature
    --> public void overloading(int a )
    --> public void overloading(int a, String b)
    2)Overloading methods should be in same class
    3)Overloading methods can have final, static, private
    1)Overriding must have same name and same method signature WITH DIFFERENT IMPLEMENTATION.
    --> public void overriding(int number);
    @overriding
     --> public void overriding(int number);
    2) Overriding methods should be in different classes(like parent-child or class-subclasses)
    3) Overriding methods cannot be static, final private.

    ABSTRACT:
    INTERVIEW QUESTIONS:
    1) WHAT IS ABSTRACT?
    abstract is a way to organize the methods with only necessary information(
    We do not need to have a body for abstract methods because everyclass which extented to the
    abstract class can MAKE THEIR OWN IMPLEMENTATION by overrriding.
    2) Why do you need to have abstract class in your framework?
    For many methods, we need developers to make their own implementation in our company, so
    they create abstract class with abstract-normal methods to make people find the
    necessary data in a short amount of time.
    2-1)Where do you use the abstract in your framework
    Almost everypart of my OOP concept.

    INTERFACE:
    1)What is interface ?
    Interface is a blueprint of the object like class which has special methods that can be
    overridden to make new implementation.
    2)Why do you need interface if you have abstract class?
    *Because interface have more features in terms of accessing the more parents by overriding
    their methods.
    3)WHat is the difference between interface and abstract? (MOST COMMON QUESTION)

    ABSTRACT:
    1)Abstract class is declared with ABSTRACT keyword
    2)Abstract class can have abstract and non-abstract methods
    3)To make a connection with abstract class we need to use EXTEND key word
    4)In abstract class you can Extend the classes only ONCE.
    5)You can have any variable.
    6)you can have public, protected... for the methods

    INTERFACE:
    1)Interface class is declared with Interface keyword
    2)Interface class can have only abstract methods
    3)To make a connection with interface class we need to use IMPLEMENT key word.
    4)in interface class you can Extend once and also implement multiple classes(parents).
    5)Your variable  final static as default.
    6) methods must be public abstract.


     */

    public static void main(String[] args) {
        Academician academician = new Academician();
        academician.name="Ahmet";
        academician.classes="Biology";
        academician.Teaching();
        System.out.println(academician.name);
        System.out.println(academician.classes);
        Teachers teachers=new Teachers();
        System.out.println(teachers.getEmail());
        teachers.setEmail("ahmet@yahoo.com");
        System.out.println(teachers.getEmail());
        teachers.setEmail("asfd235436erg4534@gmail.com");
        System.out.println(teachers.getEmail());

        //Ahmet is a teacher who attends the meeting periodically and the tests.
        //Enes is a part time teacher who doesn't attend the meeting and grade the tests
        Teachers ahmet = new Teachers();
        ahmet.AttendMeeting();
        ahmet.GradingTest();
        Academician enes = new Teachers();
        enes.Teaching();
        Workers mehmet = new Teachers();
        List<String> list = new ArrayList<>();
        ArrayList list2 = new ArrayList();

       // Officer officer= new Officer();
        HumanResource humanResource = new HumanResource();
        humanResource.work();

        humanResource.work1();
        SecurityGuard securityGuard = new SecurityGuard();
        securityGuard.work1();
        securityGuard.work();



    }


}
