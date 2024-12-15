import java.util.ArrayList;
public class fullBoard {
    public ArrayList<String> squaresArray;
    


public fullBoard(){
    squaresArray = new ArrayList<>();
    for(int i = 0; i < 23; i++){ //Creates an arrayList with the exact number of squares in the board game (23 squares)
        squaresArray.add(i, "Normal");
    }
    //Accounts for and updates the squares to the speciality squares
    //In Gumdrop Land
    squaresArray.set(5, "Move two");
    //In Licorice Land
    squaresArray.set(10, "Licorice Loop");
    squaresArray.set(13, "Licorice Luck");
    //In Choco County
    squaresArray.set(15, "Move three");
    squaresArray.set(20, "Tsunami");

    //testing for contents of ArrayList
    // int n = 0;
    // for(String item : squaresArray){
    //     n++;
    //     System.out.println(item + " " + n);
    // }
    //System.out.println(squaresArray); 
    

}

public static void main(String[] args){
    fullBoard board = new fullBoard();
}
}
