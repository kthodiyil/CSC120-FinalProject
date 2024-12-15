import java.util.Random;
public class Dice {

    public int rand;

    public void roll(){
        Random randomNum = new Random();
        int rand = randomNum.nextInt(6);
        if(rand != 0){
            System.out.println(rand);
        }
        else{System.out.println(rand + 1);}
        
        
        
    }
    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.roll();
    }
}
