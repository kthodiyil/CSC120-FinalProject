import java.util.Random;
//This is the dice class and it is in control of randomizing the dice roll throughout the game.

public class Dice {

    public int rand;

    public int roll(){
        Random randomNum = new Random();
        int rand = randomNum.nextInt(6);
        if(rand != 0){
            return rand;
        }
        else{
            return rand + 1;
        }
        
        
        
    }
    public static void main(String[] args) {
        Dice dice = new Dice();
        int num = dice.roll();
        System.out.println(num);
    }
}
