package app.oop.enums;


public class Program {

    enum Gender{
        MALE,FEMALE;
    }
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        System.out.println(gender);
        System.out.println(gender.name());
        System.out.println(gender.ordinal());
    }
}
