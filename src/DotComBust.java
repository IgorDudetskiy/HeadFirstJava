import java.util.*;
public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        one.setName("eToys.com");
        DotCom three = new DotCom();
        one.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your purpose - sunk three 'website'.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try sunk them in minimal amount moves");

        for (DotCom dotComToSet : dotComsList) {

            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying(){
        while(!dotComsList.isEmpty()){

            String userGuess = helper.getUserInput("DO move");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess){

        numOfGuesses++;

        String result = "past";

        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")){
                break;
            }
            if(result.equals("Sunk")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame(){
        System.out.println("All sites go to bottom! Your action now nothing cost.");
        if (numOfGuesses <= 18){
            System.out.println("It`s take all" + numOfGuesses + "attempt.");
        }else{
            System.out.println("It`s take your more time. " + numOfGuesses + "attempt.");
        }
    }
        public static void main (String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();

        }
    }

