import java.util.Scanner;
public class GrossSalary {
    int hours, dependants;
    int overtime;
    double SocialSecurity, FederalIncomeTax, StateIncomeTax, UnionFees = 10, gross, salary, regular, extra,extraCost;
    Scanner sc  = new Scanner(System.in);

    public double Calculate(){
        //get hours worked in the week
        System.out.println("Enter hours worked in the week");
        int hours = sc.nextInt();

        //calculate gross pay = (regular_pay + overtime_pay)
        //regular hours initialized to 40....worker assumed to have worked for these hours weekly by default
        regular = 40 * 16.78;
        if(hours>40){
            overtime = (hours-40);
        }else{
            overtime = 0;
        }
        extra = overtime * 1.5 * 16.78;
        gross = regular + extra;
        System.out.println("Gross Salary: "+ gross);
        return gross;
    }
    //calculate the withheld amounts ie. the total deductions
    public void WithheldAmt(){
        SocialSecurity = 0.06 * gross;
        System.out.println("Social Security: "+ SocialSecurity);
        FederalIncomeTax = 0.14 * gross;
        System.out.println("Federal Income Tax: "+ FederalIncomeTax);
        StateIncomeTax = 0.05 * gross;
        System.out.println("State Income Tax: "+ StateIncomeTax);
    }
    public double checkdep() {
        //get number of dependants
        System.out.println("Enter number of dependants: ");
        int dependants = sc.nextInt(); 
        //check if there any extra costs
        if(dependants>3){
             extraCost = 35;
            }else{
                extraCost = 0;
            }
            System.out.println("Extra cost: " + extraCost);
            return extraCost;
        }
    //calculate final take home pay = (gross - all_deductions)
    public double finalPay(){
        double pay = (SocialSecurity + FederalIncomeTax + StateIncomeTax + extraCost + UnionFees);
        salary =  gross - pay;
        return salary;
    }
    public static void main(String[] args) {
        GrossSalary ben  = new GrossSalary();
        ben.Calculate();
        ben.WithheldAmt();
        ben.checkdep();
        System.out.println("Final take home pay:" +ben.finalPay());
    }
}
