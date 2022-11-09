import java.util.*;
import java.io.*;

public class SortMountains {
    LinkedList<Mountain> mtn = new LinkedList<Mountain>();

    static class NameCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return one.name.compareTo(two.name);
        }
    }

    static class HeightCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two){
            return (two.height - one.height);
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }
    public void go(){
        mtn.add(new Mountain("long-Reyndg", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Marun", 14156));
        mtn.add(new Mountain("Casl", 14265));

        System.out.println("In direct add:\n" + mtn);
        NameCompare nc = new NameCompare();
        Collections.sort(mtn,nc);
        System.out.println("On name: \n" + mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn,hc);
        System.out.println("On high:\n" + mtn);
    }
}
class Mountain{
    String name;
    int height;

    Mountain(String nc, int hc) {
        name = nc;
        height = hc;
    }
    public String toString(){
        return name+" "+ height;
    }
}