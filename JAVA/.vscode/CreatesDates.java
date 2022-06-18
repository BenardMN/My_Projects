import java.util.Date;
class CreatesDates{
    public static void main(String[] args) {
        Date d1, d2;
        d1 = new Date();
        System.out.println("Date 1: " + d1);
        d2 = new Date("December 7 2000 8:30 AM");
        System.out.println("Date 2: " + d2);
    }
}