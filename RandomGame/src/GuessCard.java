/**
 * 
 */

/**
 * @author Neha
 *
 */

import java.util.Random;
import java.util.Scanner;

public class GuessCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RandomGame myCard = new RandomGame();
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		int bet = 5;
		int cardPosition;
		
		
		while(myCard.getUserChoice().equalsIgnoreCase("Y"))
		{
			System.out.println("How much do you wanna bet?");
			bet = keyboard.nextInt();
			checkBetAmount:
			if (bet < 5){
				System.out.println("Bet minimum of 5 dollars. Bet again");
				System.out.println("How much do you wanna bet?");
				bet = keyboard.nextInt();
				break checkBetAmount;
			}
			if (myCard.getTotalMoney() <5 ){
				System.out.println("You lost all your money. You cant bet anymore. Bye Bye");
				break;
			} else if (myCard.getTotalMoney()>500){
				System.out.println("You won a lot of money. GO HOME!!");
				break;
			}
			myCard.setBetMoney(bet);
			System.out.println("Which one is the ace? ");
			System.out.println("\t## \t## \t##");
			System.out.println();
			System.out.println("\t## \t## \t##");
			System.out.println("\t 1 \t 2 \t 3");
			
			cardPosition= 1 + rand.nextInt(3);
			myCard.setRandomNumber(cardPosition);
			myCard.setUserGuess(keyboard.nextInt());
			
			if (myCard.isGuessCorrect(myCard.getRandomNumber())){				
				System.out.println("You nailed it! Fast Eddie  reluctantly hands over your winnings, scowling.");
			} else
				System.out.println("Ha! Fast Eddie wins again! The ace was card number " + cardPosition+ ".");
			if (cardPosition == 1){
				System.out.println("\tAA \t## \t##");
				System.out.println("\tAA \t## \t##");
				System.out.println("\t 1 \t 2 \t 3");
			} else if (cardPosition == 2){
				System.out.println("\t## \tAA \t##");
				System.out.println("\t## \tAA \t##");
				System.out.println("\t 1 \t 2 \t 3");
			}else if (cardPosition == 3){
				System.out.println("\t## \t## \tAA");
				System.out.println("\t## \t## \tAA");
				System.out.println("\t 1 \t 2 \t 3");
			}
			System.out.println("Total money left with you is: " + myCard.getTotalMoney());
			System.out.println("Do you wanna play again? (Y or N): ");
			myCard.setUserChoice(keyboard.next());
			
			if (!myCard.getUserChoice().equalsIgnoreCase("n") && !myCard.getUserChoice().equalsIgnoreCase("y")){
				System.out.println("Incorrect input. Ending the game.");
			}
		}
		System.out.println("Good Bye :)");
		
		keyboard.close();
	}

}
