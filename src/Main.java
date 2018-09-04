import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Vasya", "Pupkin", 32, 181.5);
        Person p2 = new Person("Mikhail", "Zelencov", 13, 154);
        Person p3 = new Person("Irina", "Smirnova", 24, 167);
        Person p4 = new Person("Marina", "Egorova", 46, 171.2);
        Person[] persons = {p1, p2, p3, p4};

        System.out.println("Before:");
        for (Person p : persons) {
            System.out.println(p);
        }

        Arrays.sort(persons, new PersonFirstNameComparator());
        System.out.println("\nAfter sort by FirstName:");
        for (Person p : persons) {
            System.out.println(p);
        }

        Arrays.sort(persons, new PersonLastNameComparator());
        System.out.println("\nAfter sort by LastName:");
        for (Person p : persons) {
            System.out.println(p);
        }

        Arrays.sort(persons, new PersonAgeComparator());
        System.out.println("\nAfter sort by Age:");
        for (Person p : persons) {
            System.out.println(p);
        }

        Arrays.sort(persons, new PersonHeightComparator());
        System.out.println("\nAfter sort by Height:");
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
