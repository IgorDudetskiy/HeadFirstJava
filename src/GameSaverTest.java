import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"bow", "Knife", "Kastet"});
        GameCharacter two = new GameCharacter(200, "Troll ", new String[]{"Nake hand", "big axe"});
        GameCharacter three = new GameCharacter(120, "Mag ", new String[]{"magic", "invisibility"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        /*one = null;
        two = null;
        three = null;*/

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("Type first:" + oneRestore.getType()+oneRestore.getWeapons() + oneRestore.getPower());
            System.out.println("Type second:" + twoRestore.getType());
            System.out.println("Type third:" + threeRestore.getType());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
