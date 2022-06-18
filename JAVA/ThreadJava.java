//Threads in java
public class ThreadJava {
    public static void main(String[] args) {
        A oba  = new A();
        oba.start();
        B obb = new B();
        obb.start();
    }
}
class A extends Thread{
    public void run(){
        for(int i=0; i<=5; i++)
        System.out.println("In thread A");
        System.out.println("Exiting thread A");
    }
}
class B extends Thread{
    public void run(){
        for(int j=0; j<=5; j++)
        System.out.println("In thread B");
        System.out.println("Exiting thread B");
    }
}
