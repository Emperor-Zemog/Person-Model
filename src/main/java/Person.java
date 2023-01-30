import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Person {
    String ID;
    String firstName;
    String lastName;
    String pronouns;
    String title;
    String yearOfBirth;

    public Person (){

    }
    public Person (String inID,String inFirstName, String inLastName, String inPronouns, String inTitle, String inYOB){
        ID= inID;
        firstName=inFirstName;
        lastName=inLastName;
        pronouns=inPronouns;
        title=inTitle;
        yearOfBirth= inYOB;

    }
    public Person (String inID,String inFirstName, String inLastName, String inTitle, String inYOB){
        ID= inID;
        firstName=inFirstName;
        lastName=inLastName;
        
        title=inTitle;
        yearOfBirth= inYOB;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getID() {
        return ID;
    }

    public String getPronouns() {
        return pronouns;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }



    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public String fullName(){
        return firstName + " " + lastName;
    }
    public String formalName(){
        return getTitle() + " " + fullName();
    }
    public String getAge(){
        return ""+ (2023 - Integer.parseInt(yearOfBirth));
    }
    public String getAge(int year){
        return ""+ (year - Integer.parseInt(yearOfBirth));
    }
    public String toCSVDataRecordP(){
        return getID() + ", "+getFirstName()+ ", "+ getLastName()+", "+getPronouns()+", "+getTitle()+", "+getYearOfBirth();
    }
    public String toCSVDataRecord(){
        return getID() + ", "+getFirstName()+ ", "+ getLastName()+", "+getTitle()+", "+getYearOfBirth();
    }
}
