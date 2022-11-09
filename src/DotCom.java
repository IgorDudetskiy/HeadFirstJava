import java.util.*;
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
    public void setName(String n){
        name = n;
    }
    public String checkYourself(String userInput) {
        String result = "Past";
        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result = "Sunk";
                System.out.println("Oh! You sunk" + name + " : ( ");
            }else{
                result="hit";
            }
        }
        return result;
    }
}
