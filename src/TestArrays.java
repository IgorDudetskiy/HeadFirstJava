public class TestArrays {
    public static void main(String[] args) {

        int y = 0;
        String [] islands = new String[4];
        int [] index = new int[4];

        islands[0] = " Bermudu";
        islands[1] = " Fidgi";
        islands[2] = " Azor";
        islands[3] = " Kosunel";

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int ref;
        while (y<4){
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y =y + 1;
        }
    }
}
