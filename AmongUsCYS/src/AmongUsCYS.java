/* You are the character and are playing a game with friends. You are able to dictate the difficulty of the game and the plays that you make. The more plays you make the more Stamina you use (Stamina is exclusive for Impostor). Trust is the variable for trust between the crewmates. If Trust reaches 100, then the Impostor loses.
 * Everytime the impostor kills someone they lose 10 stamina if they sabotage with it. If they didn't sabotage with it, then the Impostor has no stamina reduction.
 * Trust increases or stays the same based off how sure the Crewmates are that someone is the impostor. For instance, if the impostor is caught in the act of killing someone, they lose due to 100 Trust of Crewmates. However, if someone dies and the Crewmates have no leads, then the trust goes down.
 * Easy Difficulty: 75 Trust, 40 Stamina
 * Medium Difficulty: 50 Trust, 50 Stamina
 * Hard Difficulty: 50 Trust, 75 Stamina 
 *
 */
import java.util.Scanner;

public class AmongUsCYS {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );

		System.out.println( "It was a normal Friday evening. You just finished all of your college assignments, and it was time to relax and play a game with friends. You have been playing this game called 'The Impostors Among Us' a lot recently and have really proven to your friends that you are a force to be reckoned with. You load up the game, enter the code, and received the 'Crewmate' role." );
		System.out.println( "As a crewmate, your job is to figure out who is taking out your friends one-by-one. The goal is to ensure that the Crewmates will win with as little casualities as possible...\r\n" );
		System.out.println( "Choose Your Difficulty: " );
		System.out.println( "1: Easy... Only Suitable For Noobs" );
		System.out.println( "2: Medium... 'Medi'ocre" );
		System.out.println( "3: Hard... Only the Strongest Survive" );

		System.out.println( "Your Choice:" );

		int x = input.nextInt();
		int stamina, stamina1, stamina2;
		int trust, trust1, trust2;
		int health= 100;	

		if ( x == 1 ) {
			stamina = 40;
			trust = 75;

			System.out.println( "You chose Easy... You must not be too good. You have been granted " + trust + " trust, and the Impostor has " + stamina +  " stamina." );
			System.out.println( "As you begin the game, you have to decide what to do to ensure your success...\r\n");

		}		
		else if ( x == 2 ) {
			stamina1 = 50;
			trust1 = 50;

			System.out.println( "You chose the Medium setting... for mediocre players... You have been granted " + trust1 + " trust, and the Impostor has " + stamina1 + " stamina." );
			System.out.println( "As you begin the game, you have to decide what to do to ensure your success...\r\n");

		}		
		else if ( x == 3 ) {
			stamina2 = 75;
			trust2 = 50;

			System.out.println( "You chose Hard... You think too highly of yourself. You have been granted " + trust2 + " trust, and the Impostor has " + stamina2 + " stamina." );
			System.out.println( "As you begin the game, you have to decide what to do to ensure your success...\r\n");

		}

		System.out.println( "Choose Your Strategy:" );
		System.out.println( "1: Go work on tasks as quickly as possible in hopes to get as much done before too many Crewmates die." );
		System.out.println( "2: Do some tasks while on your way to Security and check cams and see if any suspicious activity occurs." );
		System.out.println( "3: Be Third Impostor in an attempt to throw the game...\r\n" );

		System.out.println( "You Decide:" );

		int y = input.nextInt();

		int f = (int)( Math.random()*6 ) + 1;
		stamina = 40;
		trust = 75;
		health = 100;

		if ( x == 1 && y == 1 ) {
			stamina = 40;
			trust = 75;

			System.out.println( "You go to work on tasks as fast as possible, run for your life, and trust no one. Smart... but lonely..." );
			System.out.println( "Current Standings: Crewmates have " + trust + " trust, and the Impostor has " + stamina + " stamina.\r\n" );		

		}
		else if ( x == 1 && y == 2 ) {
			stamina = 40;
			trust = 75;

			System.out.println( "You do some tasks while going to Security to check if any suspicious activity is occuring." );
			System.out.println( "Current Standings: Crewmates have " + trust + " trust, and the Impostor has " + stamina + " stamina.\r\n" );

		}
		else if ( x == 1 && y == 3 ) {
			stamina = 40;
			trust = 75;

			System.out.println( "You decide to be Third Impostor and throw the game, to make the game more interesting.. You're that guy..." );
			System.out.println( "Current Standings: Crewmates have " + trust + " trust, and the Impostor has " + stamina + " stamina.\r\n" );

		}

		int g = (int)( Math.random()*6 ) + 1;
		trust1 = 50;
		stamina1 = 50;
		health = 100;

		if ( x == 2 && y == 1 ) {
			trust1 = 50;
			stamina1 = 50;

			System.out.println( "You go to work on tasks as fast as possible, run for your life, and trust no one. Smart... but lonely..." );
			System.out.println( "Current Standings: Crewmates have " + trust1 + " trust, and the Impostor has " + stamina1 + " stamina.\r\n" );		

		}
		else if ( x == 2 && y == 2 ) {
			stamina1 = 50;
			trust1 = 50;

			System.out.println( "You do some tasks while going to Security to check if any suspicious activity is occuring." );
			System.out.println( "Current Standings: Crewmates have " + trust1 + " trust, and the Impostor has " + stamina1 + " stamina.\r\n" );

		}
		else if ( x == 2 && y == 3 ) {
			stamina1 = 50;
			trust1= 50;

			System.out.println( "You decide to be Third Impostor and throw the game, to make the game more interesting.. You're that guy..." );
			System.out.println( "Current Standings: Crewmates have " + trust1 + " trust, and the Impostor has " + stamina1 + " stamina.\r\n" );

		}

		int h = (int)( Math.random()*6 ) + 1;
		trust2 = 50;
		stamina2 = 75;
		health = 100;

		if ( x == 3 && y == 1 ) {
			trust2 = 50;
			stamina2 = 75;

			System.out.println( "You go to work on tasks as fast as possible, run for your life, and trust no one. Smart... but lonely..." );
			System.out.println( "Current Standings: Crewmates have " + trust2 + " trust, and the Impostor has " + stamina2 + " stamina.\r\n" );		

		}				
		else if ( x == 3 && y == 2 ) {
			trust2 = 50;
			stamina2 = 75;

			System.out.println( "You do some tasks while going to Security to check if any suspicious activity is occuring." );
			System.out.println( "Current Standings: Crewmates have " + trust2 + " trust, and the Impostor has " + stamina2 + " stamina.\r\n" );

		}
		else if ( x == 3 && y == 3 ) {
			trust2 = 50;
			stamina2 = 75;

			System.out.println( "You decide to be Third Impostor and throw the game, to make the game more interesting.. You're that guy..." );
			System.out.println( "Current Standings: Crewmates have " + trust2 + " trust, and the Impostor has " + stamina2 + " stamina.\r\n" );

		}
		if ( x == 1 ) {

			while ( trust > 0 && trust < 100 && health > 0 && f <= 7 ) {

				switch (f) {

				case 1: 
					trust = trust - 10;
					System.out.println( "While you are minding your own business and doing what you are doing, someone found a body and has no clue who did it. No sabotages occurred and everyone has a solid alibi, so the Impostor could be anyone..." );	
					System.out.println( "Current Standings: Crewmates have " + trust + " trust, and the Impostor has " + stamina + " stamina.\r\n" );

				case 2: 
					trust = trust + 10;
					System.out.println( "You witnessed 3 people go into a room with one exit, and only 1 came out. One of those people must be the Impostor... right?" );
					System.out.println( "Current Standings: Crewmates have " + trust + " trust, and the Impostor has " + stamina + " stamina.\r\n" );

				case 3:
					trust = 100;
					System.out.println( "While you are minding your own business and watching out for yourself, your teammates are pretty sure they saw Green right next to body when it hit the floor. They decide to vote off Green, and he floats out into the black abyss of space." );
					System.out.println( "Current Standings: Crewmates have " + trust + " trust, and the Impostor has " + stamina + " stamina.\r\n" );

					break;

				case 4:
					trust = trust + 10;
					System.out.println( "A body was found and someone saw Green leave the room that the body was in... Strange..." );
					System.out.println( "Current Standings: Crewmates have " + trust + " trust, and the Impostor has " + stamina + " stamina.\r\n" );

				case 5:
					trust = trust - 10;
					System.out.println( "While working on tasks, the Reactor alarm then goes off. Right after you and Purple fixed it, a body is found. It doesn't seem like Purple did it... but then again..." );
					System.out.println( "Current Standings: Crewmates have " + trust + " trust, and the Impostor has " + stamina + " stamina.\r\n" );

				case 6:
					health = 0;
					System.out.println( "You're so-called 'strategy' did not go too well... you are the first one dead." );
					System.out.println( "Current Standings: Crewmates have " + trust + " trust, and the Impostor has " + stamina + " stamina. You have no more health.\r\n" );

					break;

				case 7:
					System.out.println( "RESTART?" );

					break;

				}
				if ( trust >= 100 ) {
					System.out.println( "After losing your friends one-by-one, you found out who the Impostor was. You and the other Crewmates voted them out. You watch them float away in space without a purpose, without hope... Eh. They were Impostor. They deserved it." );
					System.out.println( "Trust at 100." );
					System.out.println( "YOU WIN \r\n" );

					break;

				}
				else if ( health == 0 ) {
					System.out.println( "You died." );
					System.out.println( "GAME OVER \r\n" );

					f = 7;
				}
			}
		}
		else if ( x == 2 ) {

			while ( trust1 > 0 && trust1 < 100 && health > 0 && g <= 7 ) {

				switch (g) {

				case 1: 
					trust1 = trust1 - 10;
					System.out.println( "While you are minding your own business and doing what you are doing, someone found a body and has no clue who did it. No sabotages occurred and everyone has a solid alibi, so the Impostor could be anyone..." );	
					System.out.println( "Current Standings: Crewmates have " + trust1 + " trust, and the Impostor has " + stamina1 + " stamina.\r\n" );

				case 2: 
					trust1 = trust1 + 10;
					System.out.println( "You witnessed 3 people go into a room with one exit, and only 1 came out. One of those people must be the Impostor... right?" );
					System.out.println( "Current Standings: Crewmates have " + trust1 + " trust, and the Impostor has " + stamina1 + " stamina.\r\n" );

				case 3:
					trust1 = 100;
					System.out.println( "While you are minding your own business and watching out for yourself, your teammates are pretty sure they saw Green right next to body when it hit the floor. They decide to vote off Green, and he floats out into the black abyss of space." );
					System.out.println( "Current Standings: Crewmates have " + trust1 + " trust, and the Impostor has " + stamina1 + " stamina.\r\n" );

					break;

				case 4:
					trust1 = trust1 + 10;
					System.out.println( "A body was found and someone saw Green leave the room that the body was in... Strange..." );
					System.out.println( "Current Standings: Crewmates have " + trust1 + " trust, and the Impostor has " + stamina1 + " stamina.\r\n" );

				case 5:
					trust1 = trust1 - 10;
					System.out.println( "While working on tasks, the Reactor alarm then goes off. Right after you and Purple fixed it, a body is found. It doesn't seem like Purple did it... but then again..." );
					System.out.println( "Current Standings: Crewmates have " + trust1 + " trust, and the Impostor has " + stamina1 + " stamina.\r\n" );

				case 6:
					health = 0;
					System.out.println( "You're so-called 'strategy' did not go too well... you are the first one dead." );
					System.out.println( "Current Standings: Crewmates have " + trust1 + " trust, and the Impostor has " + stamina1 + " stamina. You have no more health.\r\n" );

					break;

				case 7:
					trust1 = 0;
					System.out.println( "RESTART?\r\n" );

					break;

				}
				if ( trust1 == 100 ) {
					System.out.println( "After losing your friends one-by-one, you found out who the Impostor was. You and the other Crewmates voted them out. You watch them float away in space without a purpose, without hope... Eh. They were Impostor. They deserved it." );
					System.out.println( "Trust at 100." );
					System.out.println( "YOU WIN \r\n" );

					break;

				}
				else if ( health == 0 ) {
					System.out.println( "You died." );
					System.out.println( "GAME OVER \r\n" );

					g = 7;
				}	
			}
		}
		else if ( x == 3 ) {

			while ( trust2 > 0 && trust2 < 100 && health > 0 && h <= 7 ) {

				switch (h) {

				case 1: 
					trust2 = trust2 - 10;
					System.out.println( "While you are minding your own business and doing what you are doing, someone found a body and has no clue who did it. No sabotages occurred and everyone has a solid alibi, so the Impostor could be anyone..." );	
					System.out.println( "Current Standings: Crewmates have " + trust2 + " trust, and the Impostor has " + stamina2 + " stamina.\r\n" );

				case 2: 
					trust2 = trust2 + 10;
					System.out.println( "You witnessed 3 people go into a room with one exit, and only 1 came out. One of those people must be the Impostor... right?" );
					System.out.println( "Current Standings: Crewmates have " + trust2 + " trust, and the Impostor has " + stamina2 + " stamina.\r\n" );

				case 3:
					trust2 = 100;
					System.out.println( "While you are minding your own business and watching out for yourself, your teammates are pretty sure they saw Green right next to body when it hit the floor. They decide to vote off Green, and he floats out into the black abyss of space." );
					System.out.println( "Current Standings: Crewmates have " + trust2 + " trust, and the Impostor has " + stamina2 + " stamina.\r\n" );

					break;

				case 4:
					trust2 = trust2 + 10;
					System.out.println( "A body was found and someone saw Green leave the room that the body was in... Strange..." );
					System.out.println( "Current Standings: Crewmates have " + trust2 + " trust, and the Impostor has " + stamina2 + " stamina.\r\n" );

				case 5:
					trust2 = trust2 - 10;
					System.out.println( "While working on tasks, the Reactor alarm then goes off. Right after you and Purple fixed it, a body is found. It doesn't seem like Purple did it... but then again..." );
					System.out.println( "Current Standings: Crewmates have " + trust2 + " trust, and the Impostor has " + stamina2 + " stamina.\r\n" );

				case 6:
					health = 0;
					System.out.println( "You're so-called 'strategy' did not go too well... you are the first one dead." );
					System.out.println( "Current Standings: Crewmates have " + trust2 + " trust, and the Impostor has " + stamina2 + " stamina. You have no more health.\r\n" );

					break;

				case 7:
					System.out.println( "RESTART?\r\n" );

					break;

				}
				if ( trust2 >= 100 ) {
					System.out.println( "After losing your friends one-by-one, you found out who the Impostor was. You and the other Crewmates voted them out. You watch them float away in space without a purpose, without hope... Eh. They were Impostor. They deserved it." );
					System.out.println( "Trust at 100." );
					System.out.println( "YOU WIN \r\n" );

					break;

				}
				else if ( health == 0 ) {
					System.out.println( "You died." );
					System.out.println( "GAME OVER \r\n" );

					h = 7;
				}

			}
		}	
		input.close();

	}

}	





