

/**
 * @author Neha
 *
 */

public class RandomGame {

	private int randomNumber;
	private String userChoice="y";
	private int userGuess;
	private boolean game; 
	private int totalMoney;
	private int betMoney ;
	
	public RandomGame(){
		this.userChoice="y";
		this.totalMoney = 100;
		this.betMoney=5;
	}
	public boolean isGame() {
		return game;
	}
	public void setGame(boolean game) {
		this.game = game;
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	public int getBetMoney() {
		return betMoney;
	}
	public void setBetMoney(int betMoney) {
		this.betMoney = betMoney;
	}
	public int getRandomNumber() {
		return randomNumber;
	}
	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	public String getUserChoice() {
		return userChoice;
	}
	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}
	public int getUserGuess() {
		return userGuess;
	}
	public void setUserGuess(int userGuess) {
		this.userGuess = userGuess;
	}
	
	public boolean isGuessCorrect(int position){
		if (position == this.userGuess){
			this.totalMoney += (this.betMoney*2);
			return true;
		}
		else {
			this.totalMoney -= this.betMoney;
			return false;
		}
	}	
}
