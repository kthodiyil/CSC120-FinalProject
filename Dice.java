import java.util.Random;
public class Dice {

    public int rand;

    public int roll(){
        Random randomNum = new Random();
        int rand = randomNum.nextInt(6);
        if(rand != 0){
            //System.out.println(rand);
            return rand;
        }
        else{
            //System.out.println(rand + 1);
            return rand + 1;
        }
        
        
        
    }
    public static void main(String[] args) {
        Dice dice = new Dice();
        int num = dice.roll();
        System.out.println(num);
    }
}
