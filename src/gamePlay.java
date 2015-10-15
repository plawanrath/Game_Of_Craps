
public class gamePlay {

	private int game1EndingBal = 0; 
	private int game2EndingBal = 0; 
	private int game3EndingBal = 0;
	private int game1Nog = 0; 
	private int game2Nog = 0;
	private int game3Nog = 0;
	
	public int getGame1EndBal()
	{
		return this.game1EndingBal;
	}
	public int getGame2EndBal()
	{
		return this.game2EndingBal;
	}
	public int getGame3EndBal()
	{
		return this.game3EndingBal;
	}
	public int getGame1Nog()
	{
		return this.game1Nog;
	}
	public int getGame2Nog()
	{
		return this.game2Nog;
	}
	public int getGame3Nog()
	{
		return this.game3Nog;
	}

	public void Game1() {
		int bet = 1000;
		int wager = 100;
		String res = null;
//		System.out.println("Balance Wager Result");
		for(int i=0;i<10;i++)
		{
//			System.out.print(bet + " ");
//			System.out.print(wager + " ");			
			bet = bet - wager;
			gameBoard board = new gameBoard();
			gameOfCraps goc = new gameOfCraps();
			goc.gameResultRollOnce(board);
			goc.gamePlayRolls(board);
			String results = goc.getResult();
			if(results.equals("Win"))
				bet = bet + (2*wager);
//			System.out.println(results);
			res = results;
		}
		if(res.equals("Win"))
			this.game1EndingBal = bet + (2*wager);
		else
			this.game1EndingBal = bet - wager;
		this.game1Nog = 10;
	}
	
	public void Game2(String s1, String s2) {
		int bet = 1000;
		int wager = 100;
		int i = 0;
		String res = null;
//		System.out.println("Balance Wager Result");
		while(i<10 && bet > 0)
		{
//			System.out.print(bet + " ");
//			System.out.print(wager + " ");			
			bet = bet - wager;
			gameBoard board = new gameBoard();
			gameOfCraps goc = new gameOfCraps();
			goc.gameResultRollOnce(board);
			goc.gamePlayRolls(board);
			String results = goc.getResult();
			if(results.equals(s1))
			{
				bet = bet + (2*wager);
				wager = 100;
			}
			if(results.equals(s2))
			{
				wager = wager*2;
			}
			if(wager > bet)
				wager = bet;
//			System.out.println(results);
			res = results;
			i++;
		}
		if(s1.equals("Win"))
		{
			if(res.equals("Win"))
				this.game2EndingBal = bet + (2*wager);
			else
				this.game2EndingBal = bet - wager;
			this.game2Nog = i;
		}
		else
		{
			if(res.equals("Win"))
				this.game3EndingBal = bet + (2*wager);
			else
				this.game3EndingBal = bet - wager;
			this.game3Nog = i;			
		}
	}
	
	public void Game3(String s1, String s2)
	{
		this.Game2(s2, s1);
	}

}
