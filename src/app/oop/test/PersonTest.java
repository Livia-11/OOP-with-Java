package app.oop.test;

import app.oop.enums.Gender;
import app.oop.enums.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {


        public void getFirstName() {
            Person person1 = new Person();
            Person person2 = new Person(1, "John", "MUGISHA", Gender.MALE, 12);
            Assert.assertEquals("John", person2.getFirstName());
            Assert.assertNull(person1.getFirstName());
            Assert.assertNotEquals("John", person1.getFirstName());

            Assert.assertEquals("John", person2.getFirstName());
            Assert.assertEquals("JOHN", person2.getFirstName());
    }

    @Test
    public void getGender() {
        Person person1 = new Person();
        Person person2 = new Person(1, "John", "MUGISHA", Gender.MALE, 12);
        Assert.assertSame(Gender.MALE, person2.getGender());
        Assert.assertEquals("MALE", person2.getGender());
    }
}
