import java.util.Scanner;

//This is the JellyBean player class and it holds the methods which control the use of special powers as well as player advancement and termination throughout the game.

public class JellyBeanPlayer extends Player{
    public JellyBeanPlayer(Boolean specialMoveUsed){
        super(specialMoveUsed);
    }
    public void moveThree(){
        super.specialMoveUsed = true;
    }

    public void OrdinaryRollOrQuitJelly(JellyBeanPlayer bean, Scanner scan, String playerType){
        System.out.println("You have already used your special move.");
            System.out.println("Type 'Continue' to continue or 'Quit' to end the game.");
            String nextMove = scan.nextLine();
        
            if(nextMove.equals("Quit")){
                System.out.println("The game has ended because you decided to quit.");
                System.exit(0);
        }
        }
        
    }


