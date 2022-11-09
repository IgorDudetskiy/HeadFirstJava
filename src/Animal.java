public class Animal {
    public Animal() {
        System.out.println("Animal");
    }
        public void eat() {
            System.out.println("eat");
        }

    }


class Hippo extends Animal {
    public Hippo() {
        System.out.println("hippo");
    }

}

class SmallHippo extends Hippo {
    public SmallHippo() {
        System.out.println("SmallHippo");
    }
   // public void eat(){
    //    System.out.println("eat small hippo");
   // }

}

class TestAnimal {
    public static void main(String[] args) {
        System.out.println("Start");
        SmallHippo smallHippo = new SmallHippo();
        smallHippo.eat();


    }

}
