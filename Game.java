import java.util.Scanner;
import javax.swing.JFrame;

//This class executes the game and uses internal class functions as well as functions from other classes.

public class Game {

    public void EndRollOrQuit(Scanner scan){
        System.out.println("You need to roll again because the previous number you rolled is too great a number to reach the end HAHAHA.");
        System.out.println("Type 'Roll' to roll again or 'Quit' to end the game.");
                String nextMove = scan.nextLine();
                if(nextMove.equals("Quit")){
                    System.out.println("The game has ended because you decided to quit.");
                    System.exit(0);;
                }
    }

    public void endRoll(int squareCount, int numMove, Scanner scan, Dice dice){
        if((squareCount + numMove) > 22){
                System.out.println("You need to roll again because the previous number you rolled is too great a number to reach the end.");
                System.out.println("Type 'Roll' to roll again or 'Quit' to end the game.");
                String nextMove = scan.nextLine();
                if(nextMove.equals("Roll") || nextMove.equals("roll")){
                    numMove = dice.roll();

                    while((squareCount + numMove) != 22){
                        if((squareCount + numMove) == 22){
                            break;
                        }
                        else{
                            System.out.println("You need to roll again because the previous number you rolled is too great a number to reach the end HAHAHA.");
                            System.out.println("Type 'Roll' to roll again or 'Quit' to end the game.");
                            nextMove = scan.nextLine();
                            //this.EndRollOrQuit(scan);
                            numMove = dice.roll();}
                            System.out.println("You rolled " + numMove);
                            System.out.println("Current square = " + squareCount);
                    }
                    squareCount += numMove; //Updates the square counter
                    System.out.println("You rolled " + numMove);
                    System.out.println("Hello there, young traveler. I see you have ventured through Candyland successfully! This is no small feat and you shall be rewarded for your trek! Here is a present from me, the queen of Candyland.");
                    System.out.println("You have been moved to square " + squareCount);
                    System.out.println("_______________________");
                    // Code to show Magical fairy dust
                    DisplayFairy fairy = new DisplayFairy();
                    JFrame f = new JFrame();
                    f.add(fairy);
                    f.setSize(165, 211);
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the window on exit
                    f.setVisible(true);
                    System.exit(0);
                }
                else if(nextMove.equals("Quit")){
                    System.out.println("The game has ended because you decided to quit.");
                    System.exit(0);
                }

        }
    }
    public static void main(String[] args) {
        FullBoard board = new FullBoard();
        Game game = new Game();
        
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there and welcome to CandyLand!");
        System.out.println("In this version of Candyland, there are three sections: Gumdrop Land, Licorice Lane, and Choco County.");
        System.out.println("You will start on the starting square and the objective of the game is to reach the magical Kingdom where you will receive a gift from the queen of Candyland herself!");
        System.out.println("You may now choose between two characters as your player for the game!");
        System.out.println("You can either be a Jelly Bean and have the power to move three squares anytime you like, but only once in the game, or you can be a Lollipop and have the power to bypass one trap in the game.");
        System.out.println("Which would you like to be? Please enter either 'Jelly Bean' or 'Lollipop'.");

        //Read the use input
        String playerType = scanner.nextLine();

        //Create player objects
        JellyBeanPlayer bean = new JellyBeanPlayer(false);
        LollipopPlayer lollipop = new LollipopPlayer(false);
        //State player type
        System.out.println("You have chosen to be a " + playerType + ".");
        
        System.out.println("Before you begin, take a look at this map to understand what you're getting into!");

        //Code to show map
        DisplayMap map = new DisplayMap();
        JFrame f = new JFrame();
        f.add(map);
        f.setSize(1025, 750);
        f.setVisible(true);

        System.out.println("You are now on the starting square 0! Let's go!");
        System.out.println("_______________________");

        //Dice roll and first roll
        Dice dice = new Dice();
        int numMoves = dice.roll();
        board.squareCounter += numMoves; //Updates the square counter
        if(board.squareCounter == 5){
                System.out.println("Type 'Roll' to roll.");
                String nextMove = scanner.nextLine();
                System.out.println("You rolled " + numMoves);
                System.out.println("Hooray! You have landed on the 'Move Two' square of Gumdrop Land. Advance two places!");
                board.squareCounter = 7;
                System.out.println("You have been moved to square " + board.squareCounter);
                System.out.println("_______________________");
            }
            else{
                System.out.println("Type 'Roll' to roll and make your first move!");
                String nextMove = scanner.nextLine();
                System.out.println("You rolled " + numMoves);
                System.out.println("You have been moved to square " + board.squareCounter);
                System.out.println("_______________________");
            }
        
        while(board.squareCounter < 23){
            if(board.squareCounter > 22){
                // either have the present here or create a condition where you cannot enter the kingdom unless you have the exact number of squares needed
                break;
            }
            else{
                if(board.squareCounter == 5){
                    System.out.println("Hooray! You have landed on the 'Move Two' square of Gumdrop Land. Advance two more places!");
                    board.squareCounter = 7;
                    System.out.println("You have been moved to square " + board.squareCounter);
                    System.out.println("_______________________");
                }
                else if(board.squareCounter == 10){
                    if(playerType.equals("Lollipop") && lollipop.specialMoveUsed == false){
                        System.out.println("Hello Lollipop, you are on a trap square and have not used your power yet. Would you like to use your power now to break the trap? Enter 'Yes' to break the trap or 'No' to be set back.");
                        String breakTrap = scanner.nextLine();
                        if(breakTrap.equals("Yes")){
                            lollipop.breakTrap();
                            board.squareCounter += 1;
                            System.out.println("You have used your special power and are now on square " + board.squareCounter);
                        }
                    }
                    else{
                        System.out.println("You rolled " + numMoves);
                        System.out.println("Uh oh! You have landed on Licorice Loop (square 10). You will be sent down the slide back to Gumdrop Land.");
                        board.squareCounter = 6;
                        System.out.println("You have been moved to square " + board.squareCounter);
                        System.out.println("_______________________");
                    }
                }
                else if(board.squareCounter == 13){
                    System.out.println("You rolled " + numMoves);
                    System.out.println("You got lucky and landed on Licorice Luck (square 13)! Advance to the beginning of Choco County!");
                    board.squareCounter = 15;
                    System.out.println("Licorice Lane is full of good luck and the Licorice Luck square has brought you even more luck! Advance three more squares.");
                    board.squareCounter = 18;
                    System.out.println("You have been moved to square " + board.squareCounter);
                    System.out.println("_______________________");
                }
                else if(board.squareCounter == 15){
                    System.out.println("You rolled " + numMoves);
                    System.out.println("Wow! You landed on the 'Move Three' square of Choco County (square 15). Advance three more places");
                    board.squareCounter = 18;
                    System.out.println("You have been moved to square " + board.squareCounter);
                    System.out.println("_______________________");
                }
                else if(board.squareCounter == 20){
                    if(playerType.equals("Lollipop") && lollipop.specialMoveUsed == false){
                        System.out.println("Hello Lollipop, you are on a trap square and have not used your power yet. Would you like to use your power now to break the trap? Enter 'Yes' to break the trap or 'No' to be set back.");
                        String breakTrap = scanner.nextLine();
                        if(breakTrap.equals("Yes")){
                            lollipop.breakTrap();
                            board.squareCounter += 1;
                            System.out.println("You have used your special power and are now on square " + board.squareCounter);
                        }
                    }
                    else{
                        System.out.println("You rolled " + numMoves);
                        System.out.println("Poor you! You have been caught in a chocolate tsunami and will be sent back down to Licorice Lane.");
                        board.squareCounter = 9;
                        System.out.println("You have been moved to square " + board.squareCounter);
                    }
                }
                else if(board.squareCounter == 22){
                    System.out.println("You rolled " + numMoves);
                    System.out.println("Hello there, young traveler. I see you have ventured through Candyland successfully! This is no small feat and you shall be rewarded for your trek! Here is a present from me, the queen of Candyland.");
                    System.out.println("You have been moved to square " + board.squareCounter);
                    // Code to show Magical fairy dust
                    DisplayFairy fairy = new DisplayFairy();
                    JFrame g = new JFrame();
                    g.add(fairy);
                    g.setSize(165, 211);
                    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the window on exit
                    g.setVisible(true);
                    break;
                }
                else{ 
                    // JELLY BEAN
                    if(playerType.equals("Jelly Bean")){
                        System.out.println("Type 'Roll' to roll again or 'Quit' to end the game. If you would like to use your special power, type 'Power'");
                        String nextMove = scanner.nextLine();
                        if(nextMove.equals("Quit")){
                            System.out.println("The game has ended because you decided to quit.");
                            System.exit(0);
                        }
                        if(nextMove.equals("Power") && bean.specialMoveUsed == false){
                            bean.moveThree();
                            board.squareCounter += 3;
                            System.out.println("You have used your special power and are now on square " + board.squareCounter);
                        }
                        else if(nextMove.equals("Power") && bean.specialMoveUsed == true){
                            bean.OrdinaryRollOrQuitJelly(bean, scanner, playerType);
                        }
                        else if (nextMove.equals("Roll") || nextMove.equals("roll")){
                            numMoves = dice.roll();
                            //board.squareCounter += numMoves; //Updates the square counter
                            if(board.squareCounter + numMoves > 22){
                                game.endRoll(board.squareCounter, numMoves, scanner, dice);
                                break;
                            }
                            board.squareCounter += numMoves; //Updates the square counter
                            System.out.println("You rolled " + numMoves);
                            System.out.println("You have been moved to square " + board.squareCounter);
                            System.out.println("_______________________");

                        }
                    }
                        // LOLLIPOP
                        if(playerType.equals("Lollipop")){
                            System.out.println("Type 'Roll' to roll again or 'Quit' to end the game. If you would like to use your special power, type 'Power'");
                            String nextMove = scanner.nextLine();
                            if(nextMove.equals("Quit")){
                                System.out.println("The game has ended because you decided to quit.");
                                System.exit(0);
                            }
                            if(nextMove.equals("Power") && lollipop.specialMoveUsed == false){
                                lollipop.breakTrap();
                                board.squareCounter = board.squareCounter;
                                System.out.println("You have used your special power and are now on square " + board.squareCounter);
                            }
                            else if(nextMove.equals("Power") && lollipop.specialMoveUsed == true){
                                lollipop.OrdinaryRollOrQuitLollipop(lollipop, scanner, playerType);
                            }
                            else if (nextMove.equals("Roll") || nextMove.equals("roll")){
                                numMoves = dice.roll();
                                if(board.squareCounter + numMoves > 22){
                                    game.endRoll(board.squareCounter, numMoves, scanner, dice);
                                    break;
                                }
                                board.squareCounter += numMoves; //Updates the square counter
                                System.out.println("You rolled " + numMoves);
                                System.out.println("You have been moved to square " + board.squareCounter);
                                System.out.println("_______________________");
    
                            }
                        }
                }
            }
        }
        // Close the scanner
        scanner.close();
    }
}