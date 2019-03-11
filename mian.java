import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class mian
{
	public static void main(String args[])
	{
		//int wybor = 0;
		//boolean continues = true;
		Set<Integer> zbiorPierwszy = new HashSet<Integer>();
		Set<Integer> zbiorDrugi = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Ile chcesz wprowadzi� liczb do zbioru A?");
		int ileLiczbZbiorA = scan.nextInt();
		while(ileLiczbZbiorA > 0)
		{
			System.out.println("Wprowadz zbi�r A");
			int zbiorA = scan.nextInt();
			zbiorPierwszy.add(zbiorA);
			ileLiczbZbiorA--;
		}
		System.out.println("Zbior A "+zbiorPierwszy);
		System.out.println("Ile liczb chcesz wprowadzi� do zbioru B?");
		int ileLiczbZbiorB = scan.nextInt();
		while(ileLiczbZbiorB > 0)
		{
			System.out.println("Wprowadz zbi�r B");
			int zbiorB = scan.nextInt();
			zbiorDrugi.add(zbiorB);
			ileLiczbZbiorB--;
		}
		System.out.println("Zb�r B "+zbiorDrugi);
		System.out.println("Jak� operacje chcesz wykona�? \n"
				+          "1. Suma zbior�w \n"
				+ 		   "2. R�nica zbior�w \n"
				+          "3. Cz�� wsp�lna \n"
				+          "4. R�nica symetryczna \n");
			int wybor = scan.nextInt();
			switch(wybor)
			{
				case 1:
				{
					zbiorPierwszy.addAll(zbiorDrugi);
					System.out.println("Suma zbior�w "+zbiorPierwszy);
					break;
				}
				case 2:
				{
					zbiorPierwszy.removeAll(zbiorDrugi);
					System.out.println("Wynik r�nicy zbior�w "+zbiorPierwszy);
					break;
				}
				case 3:
				{
					zbiorPierwszy.retainAll(zbiorDrugi);
					System.out.println("Cz�� wsp�lna zbior�w "+zbiorPierwszy);
					break;
				}
				case 4:
				{
				Set<Integer> czescWspolna = new HashSet<>(zbiorPierwszy);
				czescWspolna.retainAll(zbiorDrugi);
				
				Set<Integer> roznicaSymetryczna = new HashSet<>();
				roznicaSymetryczna.addAll(zbiorPierwszy);
				roznicaSymetryczna.addAll(zbiorDrugi);
				roznicaSymetryczna.removeAll(czescWspolna);
				System.out.println("Wynik r�nicy symetrycznej "+roznicaSymetryczna);
						
					break;
				}
				default: 
				System.out.println("Bl�d!");
			}
	}
}
