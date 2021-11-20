// Trevor Patorno		W0714742		10/13/2020
/*
 * ROCK PAPER SCISSORS!!!!
 * Enter your gesture( 1-Rock, 2-Paper, 3-Scissors ) : 2
 * You entered PAPER
 * Computer chose SCISSORS
 * You Win
 */
import java.util.Scanner;

public class rpsls {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int gesture = -1;

		while ( gesture != 0 ) {

			System.out.println("\r\n" + "Rock Paper Scissors");
			System.out.println("Choose:");
			System.out.println("1: Rock");
			System.out.println("2: Paper");
			System.out.println("3: Scissors");
			System.out.println("0: Exit");
			gesture = input.nextInt();

			if ( gesture == 1 ) {
				System.out.println("You Chose Rock");
			}
			else if ( gesture == 2 ) {
				System.out.println("You Chose Paper");		
			}
			else if ( gesture == 3 ) {
				System.out.println("You Chose Scissors");	
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
			int gesture2 = (int)( Math.random()*3 ) + 1;

			if ( gesture2 == 1 ) {
				System.out.println("Computer Chose Rock");			
			}
			else if ( gesture2 == 2 ) {
				System.out.println("Computer Chose Paper");		
			}
			else if ( gesture2 == 3 ) {
				System.out.println("Computer Chose Scissors");		
			}

			//This is for outcomes!
			if ( gesture == 1 && gesture2 == 1 ) {
				System.out.println("Rock vs. Rock");
				System.out.println("Rock ties Rock");
				System.out.println("Outcome: Tie");		
			}
			else if ( gesture == 2 && gesture2 == 1 ) {
				System.out.println("Paper vs. Rock");
				System.out.println("Paper covers Rock");
				System.out.println("Outcome: YOU WIN!");		
			}
			else if ( gesture == 3 && gesture2 == 1 ) {
				System.out.println("Scissors vs. Rock");
				System.out.println("Rock smashes Scissors");
				System.out.println("Outcome: You Lose");
				System.out.println("GAME OVER");

			}
			else if ( gesture == 1 && gesture2 == 2 ) {
				System.out.println("Rock vs. Paper");
				System.out.println("Paper covers Rock");
				System.out.println("Outcome: You Lose");
				System.out.println("GAME OVER");		
			}
			else if ( gesture == 1 && gesture2 == 3 ) {
				System.out.println("Rock vs. Scissors");
				System.out.println("Rock smashes Scissors");
				System.out.println("Outcome: YOU WIN!");		
			}
			else if ( gesture == 2 && gesture2 == 1 ) {
				System.out.println("Paper vs. Rock");
				System.out.println("Paper covers Rock");
				System.out.println("Outcome: YOU WIN!");	
			}
			else if ( gesture == 2 && gesture2 == 2 ) {
				System.out.println("Paper vs. Paper");
				System.out.println("Paper ties Paper");
				System.out.println("Outcome: Tie");	
			}
			else if ( gesture == 2 && gesture2 == 3 ) {
				System.out.println("Paper vs. Scissors");
				System.out.println("Scissors cuts Paper");
				System.out.println("Outcome: You Lose");
				System.out.println("GAME OVER");			
			}
			else if ( gesture == 3 && gesture2 == 1 ) {
				System.out.println("Scissors vs. Rock");
				System.out.println("Rock smashes Scissors");
				System.out.println("Outcome: You Lose");
				System.out.println("GAME OVER");			
			}
			else if ( gesture == 3 && gesture2 == 2 ) {
				System.out.println("Scissors vs. Paper");
				System.out.println("Scissors cuts Paper");
				System.out.println("Outcome: YOU WIN!");			
			}
			else if ( gesture == 3 && gesture2 == 3 ) {
				System.out.println("Scissors vs. Scissors");
				System.out.println("Scissors ties Scissors");
				System.out.println("Outcome: Tie");

			}

		}
		input.close();
	}
}
