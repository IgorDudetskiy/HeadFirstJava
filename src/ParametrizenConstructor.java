public class ParametrizenConstructor {
    String name = "Name";
    int age = 13;
    //Parameterized Constructor
    ParametrizenConstructor(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);;
    }
}
class TestParametrizenConstructor{
    public static void main(String[] args) {
        ParametrizenConstructor b = new ParametrizenConstructor("bn", 2);

    }
}
