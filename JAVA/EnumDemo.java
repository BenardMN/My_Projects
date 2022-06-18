public class EnumDemo {
     enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}
     enum Month{JAN, FEB, MAR, APR, MAY, JUNE, JULY, DEPT, OCT, NOV, DEC}
    public static void main(String args[]) {
        Day day;
        Month libra;
        day = Day.FRIDAY;
        libra = Month.DEC;
        System.out.print("My sign is libra since I was born in ");
        System.out.println(libra);
        System.out.print("That’s the ");
        System.out.print( libra.ordinal() );
        System.out.println("-th month of the year.");
        System.out.println(" (Counting from 0, of course!)");
        System.out.print("Isn’t it nice to get to ");
        System.out.println(day); // Output value will be: FRIDAY
        System.out.println( day + " is the " + day.ordinal()
                                               + "-th day of the week.");
    }
}
