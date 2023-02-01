public class SalaryWorker extends Worker{
    double annualSalary;
    SalaryWorker(String inID, String inFirstName, String inLastName, String inTitle, String inYOB, double annualPay) {
        super(inID, inFirstName, inLastName, inTitle, inYOB, 0.0);
        annualSalary=annualPay;
    }
    SalaryWorker(String inID, String inFirstName, String inLastName, String inPronouns ,String inTitle, String inYOB, double annualPay) {
        super(inID, inFirstName, inLastName, inPronouns, inTitle, inYOB, 0.0);
        annualSalary=annualPay;
    }
    public double calculateWeeklyPay(double hoursWorked){

        return annualSalary / 52;
    }
    public String displayWeeklyPay(double hoursWorked){

        return "The Weekly Pay of: "+calculateWeeklyPay(hoursWorked)+" is a fraction of the Annual Salary";
    }
}
