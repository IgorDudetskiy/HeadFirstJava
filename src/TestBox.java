import java.sql.Date;
import java.sql.SQLOutput;
import java.util.Calendar;

public class TestBox {


    public static void main(String[] args) {
        double d = 42.5;
        String doubleString = ""+d;
        String doubleString1 = Double.toString(d);
        System.out.println(doubleString+" "+ doubleString1);
        Date today = new Date(3);
        String date = String.format("%tA, %tB %td",today,today,today);
        System.out.println(today);
        System.out.println("");

        Calendar c = Calendar.getInstance();
        c.set(2004,0,7,15,40);
        long day1 = c.getTimeInMillis();
        day1 += 1000*60*60;
        c.setTimeInMillis(day1);
        //System.out.println(day1);
        System.out.println("New hour " + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 35);
        System.out.println("Add 35 days " + c.getTime());
        c.roll(c.DATE, 35);
        System.out.println("roll 35 days " + c.getTime());
        c.set(c.DATE, 1);
        System.out.println("set date in 1 " + c.getTime());
        System.out.println(" ");
        String s = String.format("%,d", 1000000000);
        System.out.println(s);


    }
}
