public class DVDPlayer {

    boolean canRecord = false;

    void playDVD(){
        System.out.println("go play DVD");
    }

    void recordDVD(){
        System.out.println("go record DVD");
    }
}

class DVDPlayerTestDrive{
    public static void main(String[] args) {

        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}
