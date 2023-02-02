import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.*;
public class InheritanceDemo {

    public static void main (String[] args){
        ArrayList<Worker> workers = new ArrayList<Worker>();
        ArrayList<Double> workHours = new ArrayList<Double>();

        workers.add(new SalaryWorker("0044","Lewis","Hamilton","He/Him","Sir","1985",40000000));
        workers.add(new SalaryWorker("0001","Venessa","DeMegret","She/Her","Ms.","2000",43000));
        workers.add(new SalaryWorker("0066","Vesper","Gomez","She/They","Ms.","2029",67000));
        workers.add(new Worker("0009","Valerie","Nyx","She/Her/They","Mrs.","1998",26.0));
        workers.add(new Worker("0007","Ariel","Gomez","She/Her","Mrs.","1998",38.0));
        workers.add(new Worker("0095","Delilah","Blanc","She/They","Ms.","1999",15.0));
        workHours.add(40.0);
        workHours.add(50.0);
        workHours.add(40.0);
        for(int x=0; x < workHours.size(); x++){
            System.out.println("___________________________Week "+(x+1) +"__________________________________________");
            System.out.printf("%-10s %-10s %-14s %-14s %-10s\n","ID#","FirstName","LastName","Pronouns","Weekly Salary");
            System.out.println("____________________________________________________________________________");
            for(int y=0; y < workers.size(); y++){
                System.out.printf("%-10s %-10s %-14s %-14s %-10s\n",workers.get(y).getID(),workers.get(y).getFirstName(),workers.get(y).getLastName(),workers.get(y).getPronouns(),workers.get(y).calculateWeeklyPay(workHours.get(x)));
            }

        }
    }
}
