import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		System.out.println("Wählen Sie zwichen SS, SC und CC");
		Scanner Eingabe = new Scanner(System.in);
		String Wahl = Eingabe.nextLine();
		if (Wahl.equalsIgnoreCase("SS")) 
		{
			Mensch Eins = new Mensch();
			Mensch Zwei = new Mensch();
			System.out.println("Name Spieler 1 eingeben!");
			String Name = Eingabe.nextLine();
			Eins.Name = Name;
			System.out.println("der Name von Spieler 1 lautet "+Name);
			System.out.println("Name Spieler 2 eingeben!");
			String Name2 = Eingabe.nextLine();
			Zwei.Name = Name2;
			System.out.println("der Name von Spieler 2 lautet "+Name2);
			Board.printBoard();
			

		}
		else if (Wahl.equalsIgnoreCase("SC")) 
		{
			Mensch Eins = new Mensch();
			System.out.println("Name Spieler 1 eingeben!");
			String Name = Eingabe.nextLine();
			Eins.Name = Name;
			System.out.println("der Name von Spieler 1 lautet "+Name);
			Computer cEins = new Computer();
			cEins.Name = "Computer1";
			System.out.println("der Name vom Computer lautet "+cEins.Name);
			Board.initialisiereBoard();
			Board.printBoard();
		}
		else 
		{
			Computer cEins = new Computer();
			cEins.Name = "Computer1";
			System.out.println("der Name von Computer1 lautet "+cEins.Name);
			Computer cZwei = new Computer();
			cZwei.Name = "Computer2";
			System.out.println("der Name von Computer1 lautet "+cZwei.Name);
			Board.printBoard();
			
		}
	}

}
