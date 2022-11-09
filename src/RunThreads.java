public class RunThreads implements Runnable{
    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("thread Alpha");
        beta.setName("thread Beta");
        beta.start();
        alpha.start();
    }
    public void run(){
        for(int i = 0;i<15;i++){
            String threadName = Thread.currentThread().getName();
            System.out.println("Now working "+ threadName);
        }

    }
}
