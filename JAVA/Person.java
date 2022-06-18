//parameterised constructor
public class Person {
    String name;
    int age;
    Person(String n, int a){
        name = n;
        age = a;
    }
    void printDetails(){
        System.out.print("My name is " + name);
        System.out.println(" I am " + age + " years old");
    }
    public static void main(String[] args) {
        Person ple;
        ple = new Person("Bernard", 20);
        ple.printDetails();
        System.out.println("-------");
    }
    
}
