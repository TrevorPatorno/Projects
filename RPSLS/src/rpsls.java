
// Trevor Patorno W0714742 10-14-2020 Assignment 4

//Scissors cuts paper. Paper covers rock. Rock crushes lizard. Lizard poisons Spock. Spock smashes scissors. Scissors decapitates lizard. 
//Lizard eats paper. Paper disproves Spock. Spock vaporizes rock. Rock crushes scissors.

//The program will ask the user to enter an integer value. 1-5 for a gesture, 0 to end. The application will have to generate a random gesture
//and determine if the generated gesture beats the user's gesture. The program also counts the wins, losses, 
//and ties to be displayed after the program is ended by the user.

import java.util.Scanner;

public class rpsls {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		int gesture = 1;
		int tie = 0;
		int win = 0;
		int lose = 0;
		
		while ( gesture != 0 ) {
			
		System.out.println("------------------------------------");
		System.out.println("Rock, Paper, Scissors, Lizard, Spock \r\n");
		System.out.println("Here are the rules: Scissors cuts paper. Paper covers rock. Rock crushes lizard. Lizard poisons Spock. Spock smashes scissors. Scissors decapitates lizard. \r\n" + 
				"Lizard eats paper. Paper disproves Spock. Spock vaporizes rock. Rock crushes scissors. \r\n");

		System.out.println("Choose Your Gesture:");
		System.out.println("1: Rock");
		System.out.println("2: Paper");
		System.out.println("3: Scissors");
		System.out.println("4: Lizard");
		System.out.println("5: Spock");
		System.out.println("O: End Game");
		gesture = input.nextInt();

			//This is the user's input.
			if ( gesture == 1 ) {
				System.out.println("You Chose Rock");
			}
			else if ( gesture == 2 ) {
				System.out.println("You Chose Paper");		
			}
			else if ( gesture == 3 ) {
				System.out.println("You Chose Scissors");	
			}
			else if ( gesture == 4 ) {
				System.out.println("You Chose Lizard");		
			}
			else if ( gesture == 5 ) {
				System.out.println("You Chose Spock");	
			}
			else if ( gesture == 0 ) {
				System.out.println("GAME OVER");
				break;
			}
			else {
				System.out.println("Are you okay?");
				System.exit(0);			
			}

			//This is for Computer's Response.
			int gesture2 = (int)( Math.random()*5 ) + 1;

			if ( gesture2 == 1 ) {
				System.out.println("Computer Chose Rock");			
			}
			else if ( gesture2 == 2 ) {
				System.out.println("Computer Chose Paper");		
			}
			else if ( gesture2 == 3 ) {
				System.out.println("Computer Chose Scissors");		
			}
			else if ( gesture2 == 4 ) {
				System.out.println("Computer Chose Lizard");			
			}
			else if ( gesture2 == 5 ) {
				System.out.println("Computer Chose Spock");		
			}

			//This is for outcomes!
			if ( gesture == 1 && gesture2 == 1 ) {
				System.out.println("Rock vs. Rock");
				System.out.println("Rock ties Rock");
				System.out.println("Outcome: Tie \r\n");	
				tie++;
			}
			else if ( gesture == 1 && gesture2 == 2 ) {
				System.out.println("Rock vs. Paper");
				System.out.println("Paper covers Rock");
				System.out.println("Outcome: You Lose \r\n");	
				lose++;
			}
			else if ( gesture == 1 && gesture2 == 3 ) {
				System.out.println("Rock vs. Scissors");
				System.out.println("Rock smashes Scissors");
				System.out.println("Outcome: YOU WIN \r\n");	
				win++;
			}
			else if ( gesture == 1 && gesture2 == 4 ) {
				System.out.println("Rock vs. Lizard");
				System.out.println("Rock crushes Lizard");
				System.out.println("Outcome: YOU WIN \r\n");	
				win++;
			}
			else if ( gesture == 1 && gesture2 == 5 ) {
				System.out.println("Rock vs. Spock");
				System.out.println("Spock vaporizes Rock");
				System.out.println("Outcome: You Lose \r\n");	
				lose++;
			}
			else if ( gesture == 2 && gesture2 == 1 ) {
				System.out.println("Paper vs. Rock");
				System.out.println("Paper covers Rock");
				System.out.println("Outcome: YOU WIN! \r\n");
				win++;
			}
			else if ( gesture == 2 && gesture2 == 2 ) {
				System.out.println("Paper vs. Paper");
				System.out.println("Paper ties Paper");
				System.out.println("Outcome: Tie \r\n");	
				tie++;
			}
			else if ( gesture == 2 && gesture2 == 3 ) {
				System.out.println("Paper vs. Scissors");
				System.out.println("Scissors cuts Paper");
				System.out.println("Outcome: You Lose \r\n");	
				lose++;
			}
			else if ( gesture == 2 && gesture2 == 4 ) {
				System.out.println("Paper vs. Lizard");
				System.out.println("Lizard eats Paper");
				System.out.println("Outcome: You Lose \r\n");
				lose++;
			}
			else if ( gesture == 2 && gesture2 == 5 ) {
				System.out.println("Paper vs. Spock");
				System.out.println("Paper disproves Spock");
				System.out.println("Outcome: YOU WIN \r\n");	
				win++;
			}
			else if ( gesture == 3 && gesture2 == 1 ) {
				System.out.println("Scissors vs. Rock");
				System.out.println("Rock smashes Scissors");
				System.out.println("Outcome: You Lose \r\n");
				lose++;
			}
			else if ( gesture == 3 && gesture2 == 2 ) {
				System.out.println("Scissors vs. Paper");
				System.out.println("Scissors cuts Paper");
				System.out.println("Outcome: YOU WIN \r\n");
				win++;
			}
			else if ( gesture == 3 && gesture2 == 3 ) {
				System.out.println("Scissors vs. Scissors");
				System.out.println("Scissors ties Scissors");
				System.out.println("Outcome: Tie \r\n");
				tie++;
			}
			else if ( gesture == 3 && gesture2 == 4 ) {
				System.out.println("Scissors vs. Lizard");
				System.out.println("Scissors decapitates Lizard");
				System.out.println("Outcome: YOU WIN \r\n");
				win++;
			}
			else if ( gesture == 3 && gesture2 == 5 ) {
				System.out.println("Scissors vs. Spock");
				System.out.println("Spock smashes Scissors");
				System.out.println("Outcome: You Lose \r\n");
				lose++;
			}
			else if ( gesture == 4 && gesture2 == 1 ) {
				System.out.println("Lizard vs. Rock");
				System.out.println("Rock crushes Lizard");
				System.out.println("Outcome: You Lose \r\n");
				lose++;
			}
			else if ( gesture == 4 && gesture2 == 2 ) {
				System.out.println("Lizard vs. Paper");
				System.out.println("Paper disproves Lizard");
				System.out.println("Outcome: You Lose \r\n");
				lose++;
			}
			else if ( gesture == 4 && gesture2 == 3 ) {
				System.out.println("Lizard vs. Scissors");
				System.out.println("Scissors decapitates Lizard");
				System.out.println("Outcome: You Lose \r\n");
				lose++;
			}
			else if ( gesture == 4 && gesture2 == 4 ) {
				System.out.println("Lizard vs. Lizard");
				System.out.println("Lizard ties Lizard");
				System.out.println("Outcome: Tie \r\n");
				tie++;
			}
			else if ( gesture == 4 && gesture2 == 5 ) {
				System.out.println("Lizard vs. Spock");
				System.out.println("Lizard poisons Spock");
				System.out.println("Outcome: YOU WIN \r\n");
				win++;
			}
			else if ( gesture == 5 && gesture2 == 1 ) {
				System.out.println("Spock vs. Rock");
				System.out.println("Spock vaporizes Rock");
				System.out.println("Outcome: YOU WIN \r\n");		
				win++;
			}
			else if ( gesture == 5 && gesture2 == 2 ) {
				System.out.println("Spock vs. Paper");
				System.out.println("Paper disproves Spock");
				System.out.println("Outcome: You Lose \r\n");
				lose++;
			}
			else if ( gesture == 5 && gesture2 == 3 ) {
				System.out.println("Spock vs. Scissors");
				System.out.println("Spock smashes Scissors");
				System.out.println("Outcome: YOU WIN \r\n");	
				win++;
			}
			else if ( gesture == 5 && gesture2 == 4 ) {
				System.out.println("Spock vs. Lizard");
				System.out.println("Lizard poisons Spock");
				System.out.println("Outcome: You Lose \r\n");	
				lose++;
			}
			else if ( gesture == 5 && gesture2 == 5 ) {
				System.out.println("Spock vs. Spock");
				System.out.println("Spock ties Spock");
				System.out.println("Outcome: Tie \r\n");		
				tie++;
			}

		}
		System.out.println("You have won " + win + " games, lost " + lose + " games, and tied " + tie +" games.");
		input.close();
	}
}



    