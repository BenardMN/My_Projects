public class encapsulation{
    private String name;
    private int ssn, age;

    public void setName(String newName) {
        name  = newName;
    }
    public String getName() {
        return name;
    }
    public void setSSNumber(int num){
        ssn = num;
    }
    public int getSSNumber(){
        return ssn;
    }
     public void setAge(int x){
         age = x;
    }
    public int getAge(){
        return age;
    }
public static void main(String[] args){
    encapsulation d = new encapsulation();
    d.setName("Bernard");
    d.setSSNumber(546376);
    d.setAge(21);
    System.out.println("Employee name: "+ d.getName());
    System.out.println("Age: "+ d.getAge());
    System.out.println("Social Security Number: "+ d.getSSNumber());
}}