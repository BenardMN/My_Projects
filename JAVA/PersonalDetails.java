public class PersonalDetails {
    String FirstName, MiddleName, LastName, PhoneNumber, City, ZipCode;
    void showDetail(){
        System.out.println("Customer Name: " + FirstName + " " + MiddleName + " " + LastName);
        System.out.println("Telephone: " +PhoneNumber);
        System.out.println("Customer Address: "+ ZipCode + " " + City);
    }
    public static void main(String args[]) {
      AccountDetails account = new AccountDetails();
      account.FirstName = "Tyrrese";
      account.MiddleName = "Gibbson";
      account.LastName = "Bernard";
      account.PhoneNumber = "0798765432";
      account.City = "Bangkhok";
      account.ZipCode = "234-768";
      account.showDetail();
      System.out.println("Account balance: "+account.Account());
    }
}
class AccountDetails extends PersonalDetails{
    double Account(){
        double AccountBal = 12000;
        return AccountBal;   
    }
}
