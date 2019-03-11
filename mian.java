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
		System.out.println("Ile chcesz wprowadziæ liczb do zbioru A?");
		int ileLiczbZbiorA = scan.nextInt();
		while(ileLiczbZbiorA > 0)
		{
			System.out.println("Wprowadz zbiór A");
			int zbiorA = scan.nextInt();
			zbiorPierwszy.add(zbiorA);
			ileLiczbZbiorA--;
		}
		System.out.println("Zbior A "+zbiorPierwszy);
		System.out.println("Ile liczb chcesz wprowadziæ do zbioru B?");
		int ileLiczbZbiorB = scan.nextInt();
		while(ileLiczbZbiorB > 0)
		{
			System.out.println("Wprowadz zbiór B");
			int zbiorB = scan.nextInt();
			zbiorDrugi.add(zbiorB);
			ileLiczbZbiorB--;
		}
		System.out.println("Zbór B "+zbiorDrugi);
		System.out.println("Jak¹ operacje chcesz wykonaæ? \n"
				+          "1. Suma zbiorów \n"
				+ 		   "2. Ró¿nica zbiorów \n"
				+          "3. Czêœæ wspólna \n"
				+          "4. Ró¿nica symetryczna \n");
			int wybor = scan.nextInt();
			switch(wybor)
			{
				case 1:
				{
					zbiorPierwszy.addAll(zbiorDrugi);
					System.out.println("Suma zbiorów "+zbiorPierwszy);
					break;
				}
				case 2:
				{
					zbiorPierwszy.removeAll(zbiorDrugi);
					System.out.println("Wynik ró¿nicy zbiorów "+zbiorPierwszy);
					break;
				}
				case 3:
				{
					zbiorPierwszy.retainAll(zbiorDrugi);
					System.out.println("Czêœæ wspólna zbiorów "+zbiorPierwszy);
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
				System.out.println("Wynik ró¿nicy symetrycznej "+roznicaSymetryczna);
						
					break;
				}
				default: 
				System.out.println("Bl¹d!");
			}
	}
}
