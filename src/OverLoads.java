public class OverLoads {
    String uniqueID;

    public int addNums(int a, int b) {
        return a + b;
    }
    public double addNums(double a, double b) {
        return a + b;
    }

    public void setUniqueID(String theId){
        uniqueID = theId;
    }
    public void setUniqueID(int ssNumber){
        String numString = "" + ssNumber;
        setUniqueID(numString);
    }
}
