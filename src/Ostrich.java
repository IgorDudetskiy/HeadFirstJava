public class Ostrich extends Birds{

    Ostrich ostrich1 = new Ostrich("Ostrich1's Name", ostrichWings);

    public Ostrich(String name, Wings wings) {
        super(name, wings);
    }

    public void hideHead(){
        System.out.println("I am a ostrich");
    }

}
