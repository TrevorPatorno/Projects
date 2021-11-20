// Trevor Patorno	W0714742	CMPS 161-04
 
 /* You are the character and are playing a game called "Amidst Us" with friends. Difficulty and Plays are able for you to decide. The more plays you use the more Stamina you use (Stamina is exclusive for Impostor). Trust is the variable for trust between the crewmates. If Trust reaches 100, then the Impostor loses.
  * Doing a Play with lights and killing someone takes 5 Stamina, Doing a Play with O-2 and killing someone takes 7 Stamina, and Doing a Play with Reactor and killing someone takes 10 Stamina. If you are to run out of Stamina, then Impostor will not able to cause a distraction when killing.
  * Trust increases or decreases based off how sure the Crewmates think you are impostor. For instance, you are caught in the act of killing someone, you lose due to 100 Trust of Crewmates (exception in Easy Difficulty - Trust jumps straight to 90).
  * Easy Difficulty: 75 Stamina, 40 Trust
  * Medium Difficulty: 50 Stamina, 50 Trust
  * Hard Difficulty: 50 Stamina, 75 Trust 
  * *
  */
import java.util.Scanner;

public class AmongUsCYS {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println( "It was a normal Friday evening. You just finished all of your college assignments, and it was time to relax and play 'Amist Us' with friends. You load up the game, enter the code, and received the 'Impostor' role." );
		System.out.println( "Your job is to take out your friends one-by-one and act innocent all the while doing it. The goal is to get your friends to turn on one another and come out victorious with no one suspecting a thing..." );
		System.out.println( "Choose Your Difficulty: " );
		System.out.println( "1: Easy... Only Suitable For Noobs" );
		System.out.println( "2: Medium... 'Medi'ocre" );
		System.out.println( "3: Hard... Only the Strongest Survive" );

		System.out.println( "Your Choice:" );
		int x = input.nextInt();
	
		if ( x == 1 ) {
			int stamina1 = 75;
			int trust1 = 40;
			
			System.out.println( "You chose Easy... You must not be too good. You have been granted " + stamina1 + " stamina, and the Crewmates have " + trust1 +  " trust." );
			System.out.println( "As you begin the game, you have to decide what needs to be done...");
		}
		else if ( x == 2 ) {
			int stamina2 = 50;
			int trust2 = 50;
			
			System.out.println( "You chose the Medium setting... for mediocre players... You have been granted " + stamina2 + " stamina, and the Crewmates have " + trust2 + " trust." );
			System.out.println( "As you begin the game, you have to decide what needs to be done...");
		}
		else if ( x == 3 ) {
			int stamina2 = 50;
			int trust3 = 75;
			
			System.out.println( "You chose Hard... You think too highly of yourself. You have been granted " + stamina2 + " stamina, and the Crewmates have " + trust3 + " trust." );
			System.out.println( "As you begin the game, you have to decide what needs to be done...");
		}
		
		System.out.println( "Choose Your First Play:" );
		System.out.println( "1: Turn off lights, kill Pink in Admin Hallway, rush to Electrical to help fix lights and lie, saying you went from Reactor to Electrical." );
		System.out.println( "2: Follow Green and fake tasks in Electrical, make O-2 alarms go off, kill Green in Electrical, vent-hop to Med-Bay and go to O-2 from Cafeteria and act like nothing happened." );
		System.out.println( "3: Go to Storage and fake the Gas Task, make Reactor alarms go off and kill Orange in Cafeteria, and run down to Storage and go to Reactor." );
		
		System.out.println( "You Decide:" );
		int y = input.nextInt();
		
		if ( x == 1 && y == 1 ) {
			int stamina1 = 70;
			int trust1 = 40;
			
			System.out.println( "You turn off lights and kill Pink in Admin Hallway." );
			System.out.println( "Current Standings: Impostor now has " + stamina1 + " stamina, and Crewmates still have " + trust1 + " trust." );
			
			int trust1b = 50;
			
			System.out.println( "Little did you know, Black was in Weapons and decided to go to Admin through Cafeteria. He saw you in the same room as the body." );
			System.out.println( "Current Standings: Impostor has " + stamina1 + " stamina, and Crewmates now have " + trust1b + " trust." );
		}
		else if ( x == 2 && y == 1 ) {
			int stamina2 = 45;
			int trust2 = 50;
			
			System.out.println( "You turn off lights and kill Pink in Admin Hallway." );
			System.out.println( "Current Standings: Impostor now has " + stamina2 + " stamina, and Crewmates have " + trust2 + " trust." );
			
			int trust2b = 60;
			
			System.out.println( "Little did you know, Black was in Weapons and decided to go to Admin through Cafeteria. He saw you in the same room as the body." );
			System.out.println( "Current Standings: Impostor has " + stamina2 + " stamina, and Crewmates now have " + trust2b + " trust." );
		}
		else if ( x == 3 && y == 1 ) {
			int stamina2 = 45;
			int trust3 = 75;
			
			System.out.println( "You turn off lights and kill Pink in Admin Hallway." );
			System.out.println( "Current Standings: Impostor now has " + stamina2 + " stamina, and Crewmates have " + trust3 + " trust." );
			
			int trust3b = 85;
			
			System.out.println( "Little did you know, Black was in Weapons and decided to go to Admin through Cafeteria. He saw you in the same room as the body." );
			System.out.println( "Current Standings: Impostor has " + stamina2 + " stamina, and Crewmates now have " + trust3b + " trust." );
		}
		
		if ( x == 1 && y == 2 ) {
			int stamina1b = 68;
			int trust1b = 40;
					
			System.out.println( "You make O-2 go off, kill Green in Electric, vent-hop to Med-Bay, go to O-2 from Cafeteria and act dumb." );
			System.out.println( "Current Standings: Impostor now has " + stamina1b + " stamina, and Crewmates have " + trust1b + " trust." );
			
			int trust1c = 40;
			
			System.out.println( "You commit the crime... and it went perfectly. No suspicion was raised." );
			System.out.println( "Current Standings: Impostor has " + stamina1b + " stamina, and Crewmates still have " + trust1c + " trust." );
		}
		else if ( x == 2 && y == 2 ) {
			int stamina2b = 43;
			int trust2b = 50;
			
			System.out.println( "You make O-2 go off, kill Green in Electric, vent-hop to Med-Bay, go to O-2 from Cafeteria and act dumb." );
			System.out.println( "Current Standings: Impostor now has " + stamina2b + " stamina, and Crewmates have " + trust2b + " trust." );
			
			int trust2c = 50;
			
			System.out.println( "You commit the crime... and it went perfectly. No suspicion was raised." );
			System.out.println( "Current Standings: Impostor has " + stamina2b + " stamina, and Crewmates still have " + trust2c + " trust." );
		}
		else if ( x == 3 && y == 2 ) {
			int stamina2b = 43;
			int trust3b = 75;
			
			System.out.println( "You make O-2 go off, kill Green in Electric, vent-hop to Med-Bay, go to O-2 from Cafeteria and act dumb." );
			System.out.println( "Current Standings: Impostor now has " + stamina2b + " stamina, and Crewmates have " + trust3b + " trust." );
			
			int trust3c = 75;
			
			System.out.println( "You commit the crime... and it went perfectly. No suspicion was raised." );
			System.out.println( "Current Standings: Impostor has " + stamina2b + " stamina, and Crewmates still have " + trust3c + " trust." );
		}
		
		if ( x == 1 && y == 3 ) {
			int stamina1b = 65;
			int trust1b = 40;
			
			System.out.println( "You go to Storage and fake the Gas Task, make Reactor alarms go off and kill Orange in Cafeteria, then re-trace your steps and go to Reactor." );
			System.out.println( "Current Standings: Impostor now has " + stamina1b + " stamina, and Crewmates still have " + trust1b + " trust." );
			
			int trust1c = 80;
			
			System.out.println( "You kill Orange in Cafeteria with no knowledge of Blue in Admin. You run past Blue, who just left admin and was going to Reactor from Cafeteria. He stumbles across the body and immediately knows it was you." );
			System.out.println( "Current Standings: Impostor has " + stamina1b + " stamina, and Crewmates now have " + trust1c + " trust." );
		}
		else if ( x == 2 && y == 3 ) {
			int stamina2b = 40;
			int trust2b = 50;
			
			System.out.println( "You go to Storage and fake the Gas Task, make Reactor alarms go off and kill Orange in Cafeteria, then re-trace your steps and go to Reactor." );
			System.out.println( "Current Standings: Impostor now has " + stamina2b + " stamina, and Crewmates still have " + trust2b + " trust." );
	
			int trust2c = 100;
			
			System.out.println( "You kill Orange in Cafeteria with no knowledge of Blue in Admin. You run past Blue, who just left admin and was going to Reactor from Cafeteria. He stumbles across the body and immediately knows it was you." );
			System.out.println( "Current Standings: Impostor has " + stamina2b + " stamina, and Crewmates now have " + trust2c + " trust." );
			System.out.println( "GAME OVER" );
		}
		else if ( x == 3 && y == 3 ) {
			int stamina2b = 40;
			int trust3b = 75;
					
			System.out.println( "You go to Storage and fake the Gas Task, make Reactor alarms go off and kill Orange in Cafeteria, then re-trace your steps and go to Reactor." );
			System.out.println( "Current Standings: Impostor now has " + stamina2b + " stamina, and Crewmates still have " + trust3b + " trust." );		
			
			int trust3c = 100;
			
			System.out.println( "You kill Orange in Cafeteria with no knowledge of Blue in Admin. You run past Blue, who just left admin and was going to Reactor from Cafeteria. He stumbles across the body and immediately knows it was you." );
			System.out.println( "Current Standings: Impostor has " + stamina2b + " stamina, and Crewmates now have " + trust3c + " trust." );
			System.out.println( "GAME OVER" );
		}
		input.close();
	}

}
