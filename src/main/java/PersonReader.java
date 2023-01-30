import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.*;
public class PersonReader {
    public static void main (String[] args)  throws IOException{
        int fileIndex = 0;
        int mode=1;
        SafeInput inPt= new SafeInput();
        Boolean done = false;
        Scanner pipe = new Scanner(System.in);
        ArrayList<String> sList = new ArrayList<String>();
        ArrayList<Person> people = new ArrayList<Person>();

        JFileChooser jChoose= new JFileChooser(new File("Person Model.iml"));
        FileFilter txtFilefilter = new FileFilter() {
            public boolean accept(File file) {
                if (file.getName().endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        };
        File [] files = jChoose.getCurrentDirectory().listFiles(txtFilefilter);
        while(done ==false){

            for (int i = 0; i < files.length; i++) {
                System.out.println(i+": "+ files[i].getName());
            }
            fileIndex= inPt.getRangedInt(pipe,"Please select the number corresponding to the file you want ",0,files.length-1);
            done = inPt.getYNConfirm(pipe, "You selected "+files[fileIndex].getName()+ " Is this correct?");
        }
        Path fPath= Path.of(files[fileIndex].getPath());
        String contents= Files.readString(fPath);
        sList=splitSubstrings(contents);
        if(mode==0){
            for(int x=0;x < sList.size();x=x+6){
                people.add(new Person(sList.get(x),sList.get(x+1),sList.get(x+2),sList.get(x+3),sList.get(x+4),sList.get(x+5)));
            }
            System.out.printf("%-10s %-10s %-14s %-10s %-10s %-10s\n","ID#","FirstName","LastName","Pronouns","Title","BirthYear");
            System.out.println("____________________________________________________________________________");
            for(int x=0;x < people.size();x++){
                System.out.printf("%-10s %-10s %-14s %-10s %-10s %-10s\n",people.get(x).getID(),people.get(x).getFirstName(),people.get(x).getLastName(),people.get(x).getPronouns(),people.get(x).getTitle(),people.get(x).getYearOfBirth());
            }
        }else if(mode == 1){
            for(int x=0;x < sList.size();x=x+5){
                people.add(new Person(sList.get(x),sList.get(x+1),sList.get(x+2),sList.get(x+3),sList.get(x+4)));
            }
            System.out.printf("%-10s %-10s %-14s %-10s %-10s\n","ID#","FirstName","LastName","Title","BirthYear");
            System.out.println("____________________________________________________________________________");
            for(int x=0;x < people.size();x++){
                System.out.printf("%-10s %-10s %-14s %-10s %-10s\n",people.get(x).getID(),people.get(x).getFirstName(),people.get(x).getLastName(),people.get(x).getTitle(),people.get(x).getYearOfBirth());
            }
        }



    }
    public static ArrayList<String> splitSubstrings(String s)
    {


        int i, j;


        int stringLength = s.length();


        ArrayList<String> subStringList = new ArrayList<String>();

        i=0;
        j=0;
        while(i<stringLength){
            if(s.charAt(i)==' '){
                subStringList.add(s.substring(j,i-1));
                j=i;
            } else if(s.charAt(i)=='\n'){
                subStringList.add(s.substring(j,i-1));
                j=i+1;

            }else if (i==stringLength-1) {
                subStringList.add(s.substring(j,i));
            }
            i++;
        }


        return subStringList;
    }
}
