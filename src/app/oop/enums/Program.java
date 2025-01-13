package app.oop.enums;

enum Gender{
    MALE,FEMALE;
}
public class Program {

    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        System.out.println(gender);
        System.out.println(gender.name());
        System.out.println(gender.ordinal());
    }
}
