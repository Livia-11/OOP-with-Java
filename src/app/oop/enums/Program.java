package app.oop.enums;


public class Program {

    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        Day day = Day.Friday;

        System.out.println(day);
        System.out.println(day.name());
        System.out.println(day.ordinal());

        System.out.println(gender);
        System.out.println(gender.name());
        System.out.println(gender.ordinal());

        Day d1 = Day.Monday;
        d1.information();
        for(Day d:Day.values())
            System.out.println(d);
    }
}
