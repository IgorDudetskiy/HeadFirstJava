public class TestThreads {

    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        Thread one = new Thread(t1);
        Thread two = new Thread(t2);
        one.start();
        two.start();
    }
}
class ThreadOne implements Runnable {

    public void run() {
        Accum a = Accum.getAccum();
        try {
            for (int x = 0; x < 98; x++) {
                a.updateCounter(1000);
            }
            Thread.sleep(50);
        } catch (InterruptedException ex) {

        }System.out.println("One " + a.getCount());
    }

}
class ThreadTwo implements Runnable {
    public void run() {
        Accum a = Accum.getAccum();
        try {
            for (int x = 0; x < 99; x++) {
                a.updateCounter(1);
            }
            Thread.sleep(50);
        } catch (InterruptedException ex) {

        }
        System.out.println("Two " + a.getCount());
    }
}

class Accum {
    private static Accum a = new Accum();
    private int counter = 0;
    public static Accum getAccum() {
        return a;
    }
    public void updateCounter(int add) {
        counter += add;
    }
    public int getCount() {
        return counter;
    }
    private Accum() {}
    }


