import java.util.Scanner;

public class AdventureGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gamer = new Scanner(System.in);
		System.out.println("Hey there what is your name? ");
		String name = gamer.nextLine();
		boolean stop = false;
		String answer = "yes";
		String answer2 = "FACE THE BEAST";
		String answer3 = "2";
		String answer4 = "Bow and Arrow";
	
		
	
		
		int option = 1;
		while (!stop) {
			switch (option) {
			case 1:
				System.out.println(name + ", " + "  Would you like to play? Enter yes or no. ");
				answer = gamer.nextLine();
				if (answer.equalsIgnoreCase("yes"))
					option = 2;
				else {
					System.out.println("GAME OVER!!!");
					stop = true;
				}

				break;
			case 2:
				System.out.println(
						"Excellent! You are walking across a field and you have encountered a fire-breathing dragon!"
								+ " What do you want to do? Please enter Run Away or  FACE THE BEAST! ");
				answer2 = gamer.nextLine();
				if (answer2.equalsIgnoreCase("FACE THE BEAST"))
					option = 3;
				else {
					System.out.println("GAME OVER!!!");
					stop = true;
				}

				break;
			case 3: 
				System.out.println("Congratulations, you have decided to face the beast!" + "How many heads do you see, please enter 1 or 2"); 
				answer3 =gamer.nextLine();
				
				if (answer3.equalsIgnoreCase("2"))
				option = 4;
				
				else {
					System.out.println("GAME OVER!!!");
					stop = true;
				}
				
				break;			
			case 4:
				System.out.println("No one has ever faced a 2 headed dragon before!" + " Please choose your weapon" + " Enter slingshot, sword or bow and arrow");
				answer4 =gamer.nextLine();
				
				if (answer4.equalsIgnoreCase("Bow and Arrow"))
				option = 5;
				else {
					System.out.println("OH BOY YOU CHOOSE WRONG WEAPON FOR THIS BEAST, GAME OVER");
					stop = true;
				}
				
			break;				
		case 5: 
				System.out.println("Armed with your bow and arrow, you approach the beast." + "What color eyes does he have? Red or Blue"); 
				String eyecolor = gamer.nextLine();				
				
				System.out.println("oh boy a " + eyecolor + " eyed monster!!! " + "Do you Still want to face the beast?? Yes or No?");				            
				answer =gamer.nextLine();
							    
				if (answer.equalsIgnoreCase("yes"))
				option = 6;
				
				else {
					System.out.println("Farewell Scaredycat");
					stop = true;
					}
		case 6: 
			System.out.println("Wow, I'm so glad you stuck with it" + "this beast is friendly! What do you want to name your new friend? "); 
			String beastName = gamer.nextLine(); 
			System.out.println(beastName + " and " + name + " You guys are sure to be besties forever! :)" );
			
			gamer.close();		
			stop =true;
			}			
			
			
		}
		
		
	}
	
}

