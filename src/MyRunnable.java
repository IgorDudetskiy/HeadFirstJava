public class MyRunnable implements Runnable {
    public void run() {
        go();
        System.out.println("23");
    }

    public void go() {
        /*try {
            Thread.sleep(2000);

        }catch (InterruptedException ie){
            ie.printStackTrace();
        }*/
        doMore();
    }

    public void doMore() {
        System.out.println("top stek");
    }
}

class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("Be back in method main");
    }

}
