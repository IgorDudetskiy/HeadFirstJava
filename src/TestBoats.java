public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        SailBoat b2 = new SailBoat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();

    }
}
class SailBoat{
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    int length = 34;
    public SailBoat() {
    }
    public void move() {
        System.out.print("hoist sail ");
    }
}

