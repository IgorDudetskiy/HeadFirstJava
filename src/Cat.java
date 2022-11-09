public class Cat {

    private String name;
    private String t;

    void setName(){
        t = "gh";

    }
    String getName(){
       // t="Bubble";
        return t;
    }
}
class TestCat{
    public static void main(String[] args) {
        Cat k = new Cat();
        k.setName();
        String l = k.getName();
        System.out.println(k.getName());
        String s = "25";
        int x = Integer.parseInt(s);
        System.out.println(x);


    }
}