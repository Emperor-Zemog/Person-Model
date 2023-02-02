public class Worker extends Person{
    double hourlyPayRate;
    Worker(String inID,String inFirstName, String inLastName, String inTitle, String inYOB,double payRate){
        super(inID,inFirstName,inLastName,inTitle,inYOB);
        hourlyPayRate=payRate;

    }
    Worker(String inID,String inFirstName, String inLastName, String inPronouns, String inTitle, String inYOB,double payRate){
        super(inID,inFirstName,inLastName,inPronouns,inTitle,inYOB);
        hourlyPayRate=payRate;

    }
    public double calculateWeeklyPay(double hoursWorked){
        double normalHours;
        double overtimeHours=0.0;
        if (hoursWorked > 40){
            normalHours=40;
            overtimeHours=hoursWorked-40;
        }else{
            normalHours = hoursWorked;
        }
        return hourlyPayRate*normalHours+hourlyPayRate*1.5*overtimeHours;
    }
    public String displayWeeklyPay(double hoursWorked){
        double normalHours;
        double overtimeHours=0.0;
        double normalPay=0;
        double overtimePay=0;
        String overtime;
        String normal;
        if (hoursWorked > 40){
            normalHours=40;
            overtimeHours=hoursWorked-40;
            normalPay=hourlyPayRate*normalHours;
            overtimePay= 1.5*hourlyPayRate*overtimeHours;
            normal = "Normal Hours Worked: "+normalHours+ " Normal Pay: "+normalPay;
            overtime= " Overtime Hours Worked: "+overtimeHours+" Overtime Pay: "+overtimePay;

        }else{
            normalHours = hoursWorked;
            normalPay=hourlyPayRate*normalHours;
            normal = "Normal Hours Worked: "+normalHours+ " Normal Pay: "+normalPay;
            overtime="";
        }
        return normal+overtime;
    }
}
