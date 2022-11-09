public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"круглосуточный","взаимный","обоюдный", "умный"};
        String[] wordListTwo = {"круглосуточный2","взаимный2","обоюдный2", "умный2"};
        String[] wordListThree = {"круглосуточный3","взаимный3","обоюдный3", "умный3"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int x = wordListOne.length;
        System.out.println(x);

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1]+ " " + wordListTwo[rand2]+ " " + wordListThree[rand3];

        System.out.println(" Всё, что нам нужно, это " + phrase);
    }
}
