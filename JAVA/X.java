public class X{
    int a;
    X(){
        a=0;
    }
    void display(){
        System.out.println(a);
    }
 public static void main(String args[]) {
    Y y1 = new Y();
    y1.display();
    }}
class Y extends X{
    int b;
    Y(){
        super();
        b=1;
    }
    void display(){
        super.display();
        System.out.println(b);
    }  
}

