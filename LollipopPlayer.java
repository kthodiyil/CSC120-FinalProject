import java.util.Scanner;

public class LollipopPlayer extends Player{
    public LollipopPlayer(Boolean specialMoveUsed){
        super(specialMoveUsed);
    }

    public void breakTrap(){
        super.specialMoveUsed = true;
    }

    public void OrdinaryRollOrQuitLollipop(LollipopPlayer lollipop, Scanner scan, String playerType){
        System.out.println("You have already used your special move.");
            System.out.println("Type 'Continue' to continue or 'Quit' to end the game.");
            String nextMove = scan.nextLine();
        
            if(nextMove.equals("Quit")){
                System.out.println("The game has ended because you decided to quit.");
                System.exit(0);
        }
    }

}