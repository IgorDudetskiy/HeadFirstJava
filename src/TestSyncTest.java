public class TestSyncTest {
    public static void main(String[] args) {
        TestSync job = new TestSync();
        Thread a = new Thread(job);
        Thread b = new Thread(job);
        a.start();
        b.start();
    }
}
class TestSync implements Runnable{
    private int balance;
    public void run(){
        for (int i = 0; i<50; i++){
            incremant();
            System.out.println("Balance equal " + balance);
        }
    }
    public synchronized void incremant(){
        int i = balance;
        balance = i+1;
    }
}
