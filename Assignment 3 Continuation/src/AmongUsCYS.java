// Trevor Patorno	W0714742	CMPS 161-04
 
 /* You are the character and are playing a game with friends. You are able to dictate the difficulty of the game and the plays that you make. The more plays you make the more Stamina you use (Stamina is exclusive for Impostor). Trust is the variable for trust between the crewmates. If Trust reaches 100, then the Impostor loses.
  * Everytime the impostor kills someone they lose 10 stamina if they sabotage with it. If they didn't sabotage with it, then the Impostor has no stamina reduction.
  * Trust increases or stays the same based off how sure the Crewmates are that someone is the impostor. For instance, if the impostor is caught in the act of killing someone, they lose due to 100 Trust of Crewmates.
  * Easy Difficulty: 75 Trust, 40 Stamina
  * Medium Difficulty: 50 Trust, 50 Stamina
  * Hard Difficulty: 50 Trust, 75 Stamina 
  * * 
  */
import java.util.Scanner;

public class AmongUsCYS {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println( "It was a normal Friday evening. You just finished all of your college assignments, and it was time to relax and play a game with friends. You have been playing this game called 'The Impostors Among Us' a lot recently and have really proven to your friends that you are a force to be reckoned with. You load up the game, enter the code, and received the 'Crewmate' role." );
		System.out.println( "As a crewmate, your job is to figure out who is taking out your friends one-by-one. The goal is to ensure that the Crewmates will win with as little casualities as possible..." );
		System.out.println( "Choose Your Difficulty: " );
		System.out.println( "1: Easy... Only Suitable For Noobs" );
		System.out.println( "2: Medium... 'Medi'ocre" );
		System.out.println( "3: Hard... Only the Strongest Survive" );

		System.out.println( "Your Choice:" );
		
		int x = input.nextInt();
		int stamina1, stamina1b, stamina2, stamina2b, stamina2bc;
		int trust1, trust1b, trust1c, trust2, trust2b, trust3, trust3b, trust3c;
		
		if ( x == 1 ) {
			stamina1 = 40;
			trust1 = 75;
			
			System.out.println( "You chose Easy... You must not be too good. You have been granted " + trust1 + " trust, and the Impostor has " + stamina1 +  " stamina." );
			System.out.println( "As you begin the game, you have to decide what to do to ensure your success...");
			
		}		
		else if ( x == 2 ) {
			stamina2 = 50;
			trust2 = 50;
			
			System.out.println( "You chose the Medium setting... for mediocre players... You have been granted " + trust2 + " trust, and the Impostor has " + stamina2 + " stamina." );
			System.out.println( "As you begin the game, you have to decide what to do to ensure your success...");
			
		}		
		else if ( x == 3 ) {
			stamina2 = 75;
			trust3 = 50;
			
			System.out.println( "You chose Hard... You think too highly of yourself. You have been granted " + trust3 + " trust, and the Impostor has " + stamina2 + " stamina." );
			System.out.println( "As you begin the game, you have to decide what to do to ensure your success...");
			
		}
		
		System.out.println( "Choose Your Strategy:" );
		System.out.println( "1: Go work on tasks as quickly as possible in hopes to get as much done before too many Crewmates die." );
		System.out.println( "2: Do some tasks while on your way to Security and check cams and see if any suspicious activity occurs." );
		System.out.println( "3: Be Third Impostor in an attempt to throw the game..." );
		
		System.out.println( "You Decide:" );
		
		int y = input.nextInt();
		
		int a = (int)( Math.random()*3 ) + 1;
		
		if ( x == 1 && y == 1 ) {
			stamina1 = 40;
			trust1 = 75;
			
			System.out.println( "You go to work on tasks as fast as possible, run for your life, and trust no one. Smart... but lonely..." );
			System.out.println( "Current Standings: Crewmates have " + trust1 + " trust, and the Impostor has " + stamina1 + " stamina." );		
			System.out.println( a );

		}
		else if ( x == 1 && y == 2 ) {
			stamina1b = 40;
			trust1b = 75;
					
			System.out.println( "You do some tasks while going to Security to check if any suspicious activity is occuring." );
			System.out.println( "Current Standings: Crewmates have " + trust1b + " trust, and the Impostor has " + stamina1b + " stamina." );
			System.out.println( a );
			
		}
		else if ( x == 1 && y == 3 ) {
			stamina1b = 40;
			trust1b = 75;
			
			System.out.println( "You decide to be Third Impostor and throw the game, to make the game more interesting.. You're that guy..." );
			System.out.println( "Current Standings: Crewmates have " + trust1b + " trust, and the Impostor has " + stamina1b + " stamina." );
			System.out.println( a );
		
		}
		
		
		while ( trust1c > 0 && stamina1b > 0 ) {
			
			if ( x == 1 && a == 1 ) {
			trust1c = 75;
			stamina1b = 40;
			
			System.out.println( "While you are minding your own business and doing what you are doing, someone found a body and has no clue who did it. No sabotages occurred and everyone has a solid alibi, so the Impostor could be anyone..." );	
			System.out.println( "Current Standings: Crewmates still have " + trust1c + " trust, and the Impostor still has " + stamina1b + " stamina." );
				
				while ( trust1c > 0 && stamina1b > 0 ) {
					
					System.out.println( "works");
					
				}
			}
			else if ( x == 1 && a == 2 ) {
			trust1c = 85;
			stamina1b = 40;
			
			System.out.println( "You witnessed 3 people go into a room with one exit, and only 1 came out. One of those people must be the Impostor... right?" );
			System.out.println( "Current Standings: Crewmates now have " + trust1c + " trust, and the Impostor still has " + stamina1b + " stamina." );
			
			}
			else if ( x == 1 && a == 3 ) {
			trust1c = 100;
			stamina1b = 40;
			
			System.out.println( "While you are minding your own business and watching out for yourself, you're teammates are pretty sure they saw Green right next to body when it hit the floor. They decide to vote off Green, and he floats out into the black abyss of space." );
			System.out.println( "Current Standings: Crewmates now have " + trust1c + " trust, and the Impostor still has " + stamina1b + " stamina." );
			System.out.println( "YOU WIN");
			
			}
			
			trust1c--; stamina1b--;
		}
		
			int b = (int)( Math.random()*3 ) + 1;
			
		 if ( x == 2 && y == 1 ) {
			stamina2 = 50;
			trust2 = 50;
			
			System.out.println( "You go to work on tasks as fast as possible, run for your life, and trust no one. Smart... but lonely..." );
			System.out.println( "Current Standings: Crewmates have " + trust2 + " trust, and the Impostor has " + stamina2 + " stamina." );
			System.out.println( b );
			
		}
		else if ( x == 2 && y == 2 ) {
			stamina2b = 50;
			trust2b = 50;
			
			System.out.println( "You do some tasks while going to Security to check if any suspicious activity is occuring." );
			System.out.println( "Current Standings: Crewmates have " + trust2b + " trust, and the Impostor has " + stamina2b + " stamina." );
			System.out.println( b );
			
		}
		else if ( x == 2 && y == 3 ) {
			stamina2b = 50;
			trust2b = 50;
		
			System.out.println( "You decide to be Third Impostor and throw the game, to make the game more interesting... You're that guy..." );
			System.out.println( "Current Standings: Crewmates have " + trust2b + " trust, and the Impostor has " + stamina2b + " stamina." );
			System.out.println( b );
			
		}
			if ( x == 2 && b == 1 ) {
			stamina2 = 50;
			trust2b = 60;
			
			System.out.println( "A body was found and someone saw Green leave the room that the body was in... Strange..." );
			System.out.println( "Current Standings: Crewmates now have " + trust2b + " trust, and the Impostor still has " + stamina2 + " stamina." );
			
			}
			else if ( x == 2 && b == 2 ) {
			trust2b = 50;
			stamina2bc = 40;
			
			System.out.println( "While working on tasks, the Reactor alarm then goes off. Right after you and Purple fixed it, a body is found. It doesn't seem like Purple did it... but then again..." );
			System.out.println( "Current Standings: Crewmates still have " + trust2b + " trust, and the Impostor has " + stamina2bc + " stamina." );
			
			}
			else if ( x == 2 && b == 3 ) {
			trust2b = 50;
			stamina2b = 50;
			
			System.out.println( "You're so-called 'strategy' did not go too well... you are the first one dead." );
			System.out.println( "Current Standings: Crewmates still have " + trust2b + " trust, and the Impostor still has " + stamina2b + " stamina." );
			
		}
			int c = (int)(Math.random()*3 ) + 1;
			
		if ( x == 3 && y == 1 ) {
			stamina2 = 75;
			trust3 = 50;
			
			System.out.println( "You go to work on tasks as fast as possible and run for your life and trust no one. Smart... but lonely..." );
			System.out.println( "Current Standings: Crewmates have " + trust3 + " trust, and the Impostor has " + stamina2 + " stamina." );
			System.out.println( c );
			
		}				
		else if ( x == 3 && y == 2 ) {
			stamina2b = 75;
			trust3b = 50;
			
			System.out.println( "You do some tasks while going to Security to check if any suspicious activity is occuring." );
			System.out.println( "Current Standings: Crewmates have " + trust3b + " trust, and the Impostor has " + stamina2b + " stamina." );
			System.out.println( c );
			
		}
		else if ( x == 3 && y == 3 ) {
			stamina2b = 75;
			trust3b = 50;
					
			System.out.println( "You decide to be Third Impostor and throw the game, to make the game more interesting.. You're that guy..." );
			System.out.println( "Current Standings: Crewmates have " + trust3b + " trust, and the Impostor has " + stamina2b + " stamina." );	
			System.out.println( c );	
			
		}
			if ( x == 3 && c == 1 ) {
			stamina2b = 65;
			trust3 = 50;
		
			System.out.println( "While you are doing your tasks, the lights went out and are fixed within 20 seconds. When lights come on, someone has found a body... and the impostor got away with it..." );
			System.out.println( "Current Standings: Crewmates still have " + trust3 + " trust, and the Impostor now has " + stamina2b + " stamina." );	
			
			}
			else if ( x == 3 && c == 2 ) {
				trust3c = 50;
				stamina2b = 75;
				
				System.out.println( "You watched Green walk down a hallway, and you entered a room to your right. Right after you begin your task, you see Green walk into the room with you, and it seems that he is coming straight for you. Out of fear, you hop off the task you were completing, but it is too late. You are dead." );
				System.out.println( "Current Standings: Crewmates still have " + trust3c + " trust, and the Impostor still has " + stamina2b + " stamina." );
				System.out.println( "GAME OVER" );
			
			}
			else if ( x == 3 && c == 3 ) {
				trust3b = 50;
				stamina2b = 45;
				
				System.out.println( "You, Green, and Orange were the last ones still alive, and Impostor was not yet discovered. Orange was mostly skeptical of how you were playing and where you were most of the game. Because of this, you are voted off. It's a big RIP." );
				System.out.println( "Current Standings: Crewmates have " + trust3b + " trust, and the Impostor has " + stamina2b + " stamina." );
				System.out.println( "GAME OVER" );
			
			}
			
			input.close();
		}
}

