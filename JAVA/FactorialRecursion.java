/** Recursion: a method calls itself
 * Task: Program to calculate factorial of a number using recursion
 * @author Bernard Munuve
 */
public class FactorialRecursion {
    int fact(int n){
        int result;
        if(n == 1)return 1;
        result = fact(n-1)*n;
        return result;
    }
    public static void main(String args[]) {
        FactorialRecursion f = new FactorialRecursion();
        System.out.println("Factorial of 4 is: "+ f.fact(4));
        System.out.println("Factorial of 5 is: "+ f.fact(5));
    }
}
