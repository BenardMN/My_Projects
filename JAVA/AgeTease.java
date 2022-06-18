import javax.swing.*;
public class AgeTease {
    public static void main(String args[]) {}
        int check(){
        int age = 20;
        if(age<40){
            JOptionPane.showMessageDialog(null, "You're still young!");
        }else{
            JOptionPane.showMessageDialog(null, "You're" + age + " "+"...howdy, old timer!");
        }
        return age;   
    }
}
