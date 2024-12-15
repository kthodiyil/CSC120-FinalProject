import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there and welcome to CandyLand!");
        System.out.println("In this version of Candyland, there are three sections: Gumdrop Land, Licorice Lane, and Choco County.");
        System.out.println("You will start on the starting square and the objective of the game is to reach the magical Kingdom where you will receive a gift from the queen of Candyland herself!");
        System.out.println("You may now choose between two characters as your player for the game!");
        System.out.println("You can either be a Jelly Bean and have the power to move three squares anytime you like, but only once in the game, or you can be a Lollipop and have the power to bypass one trap in the game.");
        System.out.println("Which would you like to be? Please enter either 'Jellybean' or 'Lollipop'.");

        //Read the use input
        String playerType = scanner.nextLine();
        //Confirm playerType with
        System.out.println("You have chosen to be a " + playerType+ ". Let's begin the game!");
        
    }

}
