import java.util.Calendar;
import static java.lang.System.out;

public class FullMoons {

    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        /*Calendar c = Calendar.getInstance();
        c.set(2004, 1, 7, 15, 40);
        String s = String.format("Full moon on %tc", c);
        out.println(s);
        for (int x = 0; x < 2; x++) {
            long day1 = c.getTimeInMillis();
            day1 += (DAY_IM * 29.52);
            //out.println(day1);
            c.setTimeInMillis(day1);
            String s1 = String.format("Full moon on %tc", c);
            out.println(s1);

*/
        Calendar c = Calendar.getInstance();
        c.set(2004, 1, 7, 15, 40);
        long day1 = c.getTimeInMillis();
        for (int x = 0; x < 3; x++){
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            out.println(String.format("full moon on %tc", c));
        }

    }
}