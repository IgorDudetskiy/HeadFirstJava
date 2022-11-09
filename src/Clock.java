public class Clock {
    String time;
    String t;

    void setTime(){
        t="1245";
        time = t;
    }
    String getTime(){
        return time;
    }
}

class ClockTestDrive{
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime();
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
