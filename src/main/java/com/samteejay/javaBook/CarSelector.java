package main.java.com.samteejay.javaBook;

public class CarSelector {
    public static void main(String[] arguments ) {
        for (String argument : arguments ) {
            System.out.println( "processing car: " +
                    argument );
        }
    }
}
