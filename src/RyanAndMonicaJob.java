public class RyanAndMonicaJob implements Runnable{
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }
    public void run(){
        for(int x = 0;x<10;x++){
            makeWithdrawal(10);
            if(account.getBalance()<0){
                System.out.println("excess limit!");
            }
        }
    }
    public synchronized void makeWithdrawal(int amount){
        if (account.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName()+" try to take money");
        try {
            System.out.println(Thread.currentThread().getName()+" go to sleep");
            Thread.sleep(500);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
            System.out.println(Thread.currentThread().getName()+" wake up");
        account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+" ending withdraw");
        }
        else {
            System.out.println("sorry, for client " + Thread.currentThread().getName()+" a lack of money");
        }

    }
}
class BankAccount{
    private int balance =100;

    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }
}

