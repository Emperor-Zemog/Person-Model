import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class PersonTest {
    Person person;


    @BeforeEach
     void setUp(){
        person = new Person("0009","Valerie","Nyx","She/Her","Ms.","1998");
    }


    @Test
    void setFirstName() {
    person.setFirstName("Val");
        System.out.println(person.getFirstName());
    }

    @Test
    void setLastName() {
        person.setLastName("Nova");
        System.out.println(person.getLastName());
    }

    @Test
    void setPronouns() {
        person.setPronouns("She/Her/They");
        System.out.println(person.getPronouns());
    }

    @Test
    void setTitle() {
        person.setTitle("Mrs");
        System.out.println(person.getTitle());
    }

    @Test
    void setYearOfBirth() {
        person.setYearOfBirth("1999");
        System.out.println(person.getYearOfBirth());

    }

    @Test
    void fullName() {
        System.out.println(person.fullName());
    }

    @Test
    void formalName() {
        System.out.println(person.formalName());
    }

    @Test
    void getAge() {
        System.out.println(person.getAge());
    }

    @Test
    void testGetAge() {
        System.out.println(person.getAge(2027));
    }

    @Test
    void toCSVDataRecordP() {
        System.out.println(person.toCSVDataRecordP());
    }

    @Test
    void toCSVDataRecord() {
        System.out.println(person.toCSVDataRecord());
    }
}