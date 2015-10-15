
public class gameOfCraps {
	
	private String result = null;
	private int firstRoll = 0;
	
	public void gameResultRollOnce(gameBoard g)
	{
		String res = null;
		g.setRoll(2, 12);
		int rollVal = g.getRoll();
		if(rollVal == 7 || rollVal == 11)
		{
			res = "Win";
		}
		else if(rollVal == 2 || rollVal == 3 || rollVal == 12)
		{
			res = "Lose";
		}
		this.result = res;
		this.firstRoll = rollVal;
		//System.out.println(this.firstRoll);
	}
	
	public void gamePlayRolls(gameBoard g)
	{
		while(this.result == null)
		{
			g.setRoll(2, 12);
			int rollVals = g.getRoll();
			//System.out.println(rollVals);
			if(rollVals == 7)
			{
				this.result = "Lose";
			}
			else if(rollVals == this.firstRoll)
			{
				this.result = "Win";
			}
		}
	}
	
	public String getResult()
	{
		return this.result;
	}
}
