class Employee {
    float salary=40000;}
class programmer extends Employee{
    int bonus=10000;
    public static void main(String args[]) {
        programmer p = new programmer();
        System.out.println("Programmer salary is: "+p.salary);
        System.out.println("Bonus for Programmer is: "+p.bonus);
    }
}

