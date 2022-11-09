public class Crow extends Birds{
    Crow crow1 = new Crow("Crow1's Name", crowWings);


    public Crow(String name, Wings wings) {
        super(name, wings);
    }

    public void fly(){
        System.out.println("I can to fly");
    }
}
