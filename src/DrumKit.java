public class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    void playSnare(){
        System.out.println("bah bah ba-bah");
    }
    void playTopHat(){
        System.out.println("din din di-din");
    }
}
class DrumKitTestDrive{
    public static void main(String[] args) {

        DrumKit d = new DrumKit();
        d.snare = false;
        d.playSnare();
        d.playTopHat();

        if(d.snare == true){
            d.playSnare();
        }
    }
}
