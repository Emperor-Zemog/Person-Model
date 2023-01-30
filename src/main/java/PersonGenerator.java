import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.*;
public class PersonGenerator {





    public static void main (String[] args){
        SafeInput inPt= new SafeInput();
        int mode=0;
        int birthYear = 0;
        ArrayList<Person> people = new ArrayList<Person>();
        String pronouns="";


        Boolean done = false;
        Scanner pipe = new Scanner(System.in);
        File pFile;
        while(done == false) {
           String iD=(inPt.getNonZeroLenString(pipe, "ID of Person"));
           String firstName=(inPt.getNonZeroLenString(pipe, "First Name of Person"));
            String lastName=(inPt.getNonZeroLenString(pipe, "Last Name of Person"));
            if(mode ==0){
                pronouns=(inPt.getNonZeroLenString(pipe, "Pronouns of Person"));
            }

            String title=(inPt.getNonZeroLenString(pipe, "Title of Person"));
            birthYear=(inPt.getInt(pipe, "Year of Birth"));

            if(mode==0){
                people.add(new Person(iD,firstName,lastName,pronouns, title, ""+ birthYear));
            } else {
                people.add(new Person(iD,firstName,lastName, title, "" + birthYear));
            }
            done = inPt.getYNConfirm(pipe, "Are you done with input");
        }
        if (inPt.getYNConfirm(pipe,"Do you want to save your list?")==true) {
            try {
                pFile = new File("PersonTestDataTest.txt");
                if (pFile.createNewFile()) {
                    System.out.println("File created: " + pFile.getName());
                } else {
                    System.out.println("File already exists.");
                }
                PrintStream pWriter = new PrintStream(pFile);
                int listLength = people.size();
                for(int x=0; x < listLength; x++){
                    if(mode == 0){
                        pWriter.println(people.get(x).toCSVDataRecordP());
                    }else {
                        pWriter.println(people.get(x).toCSVDataRecord());
                    }


                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        }


    }
}
