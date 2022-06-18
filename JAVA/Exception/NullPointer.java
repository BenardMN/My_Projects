package Exception;

//Task: Program to demonstrate null pointer exception and 
 //index out of bounds exception
 //@author: Bernard 
 
public class NullPointer {
    public static void main(String args[]) {
        {
            try{
                String a = null;
                System.out.println(a.charAt(2));
            } catch(NullPointerException e){
                System.out.println("The string is null i.e. has nothing..");
            } catch(IndexOutOfBoundsException x){
                System.out.println("String is out of bound");
            }
        }
    }
}
