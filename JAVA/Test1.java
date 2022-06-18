//java program to demosntrate how to request jvm to run garbage colllector
public class Test1 {
    public static void main(String[] args) throws InterruptedException{
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        t1 = null;
        System.gc();
        t2 = null;
        Runtime.getRuntime().gc();
    }
    //finalize method
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Garbage collector called.");
        System.out.println("Object garbage collected"+ this);
    }
}
