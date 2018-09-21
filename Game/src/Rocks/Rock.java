package Rocks;

import java.util.Scanner;

/*import java.util.Scanner; 
import java.util.Random; 


public class Rock 
{ 
private static Scanner scan;

public static void main(String[] args) 
{ 
    String personPlay; //User's play -- "R", "P", or "S" 
    String computerPlay = ""; //Computer's play -- "R", "P", or "S" 
    int computerInt; //Randomly generated number used to determine 
                     //computer's play 
   // String response; 


    scan = new Scanner(System.in); 
    Random generator = new Random(); 

    System.out.println("Hey, let's play Rock, Paper, Scissors!\n" + 
                       "Please enter a move.\n" + "Rock = R, Paper" + 
                       "= P, and Scissors = S.");

    System.out.println();

    //Generate computer's play (0,1,2) 
    computerInt = generator.nextInt(3)+1; 

    //Translate computer's randomly generated play to 
    //string using if //statements 

    if (computerInt == 1) 
       computerPlay = "R"; 
    else if (computerInt == 2) 
       computerPlay = "P"; 
    else if (computerInt == 3) 
       computerPlay = "S"; 

    //Get player's play from input-- note that this is 
    // stored as a string 
    System.out.println("Enter your play: "); 
    personPlay = scan.next();

    //Make player's play uppercase for ease of comparison 
    personPlay = personPlay.toUpperCase(); 

    //Print computer's play 
    System.out.println("Computer play is: " + computerPlay); 


    //See who won. Use nested ifs 

    if (personPlay.equals(computerPlay)) 
       System.out.println("It's a tie!"); 
    else if (personPlay.equals("R")) 
       if (computerPlay.equals("S")) 
          System.out.println("Rock crushes scissors. You win!!");
    else if (computerPlay.equals("P")) 
            System.out.println("Paper eats rock. You lose!!"); 
    else if (personPlay.equals("P")) 
       if (computerPlay.equals("S")) 
       System.out.println("Scissor cuts paper. You lose!!"); 
    else if (computerPlay.equals("R")) 
            System.out.println("Paper eats rock. You win!!"); 
    else if (personPlay.equals("S")) 
         if (computerPlay.equals("P")) 
         System.out.println("Scissor cuts paper. You win!!"); 
    else if (computerPlay.equals("R")) 
            System.out.println("Rock breaks scissors. You lose!!"); 
    else 
         System.out.println("Invalid user input."); 
}

}*/
/*import java.util.Scanner;
public class Rock
{
     private static Scanner scan;

	public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next().toLowerCase();

          if (player1.equals(player2))
          {
            System.out.print("It is a tie");
          }else{
        	  System.out.println(" send person won");
          }
    }
}*/
public class Rock{
final static int ROCK = 1, SCISSOR = 2, PAPER = 3;
private static Scanner scan;
public static void main(String[] args)
{
    scan = new Scanner(System.in);
    System.out.println("Player 1: Choose (1) - Rock, (2) - Scissors, or (3) - Paper: ");
    int player1 = scan.nextInt();
    System.out.println("Player 2: Choose (1) - Rock, (2) - Scissors, or (3) - Paper: ");
    int player2 = scan.nextInt();
 
    if (player1 == player2)
    {
        System.out.print("It is a tie");
    } else {
        switch (player1){
        case ROCK:
            if (player2 == SCISSOR)
                System.out.print("Player 1 wins!");
            else
                System.out.print("Player 2 wins!");
            break;
        case SCISSOR:
            if (player2 == PAPER)
                System.out.print("Player 1 wins!");
            else
                System.out.print("Player 2 wins!");
            break;
        case PAPER:
            if (player2 == ROCK)
                System.out.print("Player 1 wins!");
            else
                System.out.print("Player 2 wins!");
            break;
        }
    }
}
}