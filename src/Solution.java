import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Solution {

	public static void main(String[] args) {
		
		PrintStream out;
		try {
			out = new PrintStream(new FileOutputStream("output.txt"));
			System.setOut(out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for(int r=1;r<=5;r++)
		{
			System.out.println();
			System.out.println("Round " + r);
			gamePlay game = new gamePlay();
			game.Game1();
			System.out.println();
			game.Game2("Win", "Lose");
			System.out.println();
			game.Game3("Win", "Lose");
			int g1eb = game.getGame1EndBal();
			int g1nog = game.getGame1Nog();
			int g2eb = game.getGame2EndBal();
			int g2nog = game.getGame2Nog();
			int g3eb = game.getGame3EndBal();
			int g3nog = game.getGame3Nog();
			System.out.println("Strategy Number_of_Games End_Balance");
			System.out.println("1\t\t" + g1nog + "\t\t" + g1eb);
			System.out.println("2\t\t" + g2nog + "\t\t" + g2eb);
			System.out.println("3\t\t" + g3nog + "\t\t" + g3eb);
		}

	}

}
