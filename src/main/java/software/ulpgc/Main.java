package software.ulpgc;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Person("Alberto", LocalDate.parse("2002-05-10")));
    }
}
