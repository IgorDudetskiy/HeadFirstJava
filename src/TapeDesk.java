public class TapeDesk {

    boolean canRecord = false;


    void playTape(){
        System.out.println("пленка проигрывателя");
    }

    void recordTape(){
        System.out.println("идет запись на пленку");
    }
}

class TapeDeckTestDrive{
    public static void main(String[] args) {

        TapeDesk t = new TapeDesk();

        t.canRecord = true;
        t.playTape();

        if(t.canRecord == true){
            t.recordTape();
        }
    }
}
