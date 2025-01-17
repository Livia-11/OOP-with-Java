package app.oop.enums;


public class Program {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person(1, "John", "MUGISHA", Gender.MALE, 12 );
        System.out.println(person1.getFirstName());
        System.out.println(person1.getGender());
        System.out.println(person2.getFirstName());
        System.out.println(person2.getGender());


//        Gender gender = Gender.FEMALE;
//        Day day = Day.Friday;
//
//        System.out.println(day);
//        System.out.println(day.name());
//        System.out.println(day.ordinal());
//
//        System.out.println(gender);
//        System.out.println(gender.name());
//        System.out.println(gender.ordinal());
//
//        Day d1 = Day.Monday;
//        d1.information();
//        for(Day d:Day.values())
//            System.out.println(d);


    }
}
