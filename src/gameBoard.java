import java.util.Random;

public class gameBoard {

	private int diceValue;
	
	public int rollDice(int min,int max)
	{
		Random rand = new Random();
		return(rand.nextInt((max - min + 1)  + min));
	}
	
	public void setRoll(int min,int max)
	{
		this.diceValue = this.rollDice(min, max);
	}
	
	public int getRoll()
	{
		return this.diceValue;
	}
}
