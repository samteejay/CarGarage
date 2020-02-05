package main.java.com.samteejay.javaBook;
import main.java.com.samteejay.javaBook.attributes.Name;

public class Person {
    private Name personName ;
    private static int personCounter ;

    public Person() {
        personCounter++;
    }

    public Person(Name personName ) {
        this.personName = personName ;
    }

    public static String helloWorld() {
        return "Hello World" ;
    }

    public static String hello(String name ) {
        return "Hello " + name ;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
