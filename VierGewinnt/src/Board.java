
public class Board 
{
	public static int [][] Board = new int [7][6];
	public boolean checkBoard()
	{
		return true;
	}
	public static void initialisiereBoard() {
		for(int i=0;i<7;i++) 
		{
			for(int j=0;j<6;j++) 
			{
				Board[i][j]='-';
			}
			System.out.println();
		}
	}
	public static void printBoard() 
	{
		for(int i=0;i<7;i++) 
		{
			for(int j=0;j<6;j++) 
			{
				System.out.print("["+Board[i][j]+"]");
			}
			System.out.println();
		}
		
	}
	public void checkBelegt(int Spalte)
	{
		
	}
}
