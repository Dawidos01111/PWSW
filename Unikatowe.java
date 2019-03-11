import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class main {

	public static void main(String[] args)
	{
		System.out.println("Podaj liczby, aby zakoñczyæ wprowadzanie liczb naciœnij x");
		Scanner scanner = new Scanner(System.in);
		
		
		char word = scanner.next().charAt(0);
		Set<Integer> tab = new HashSet<Integer>();
		try {
		do
		{
			
			int number = scanner.nextInt();
			tab.add(number);
			
		}while(word != 'x');
		System.out.println(tab);
		} catch(InputMismatchException e) {
			System.out.println("WYJŒCIE");
		}	
		
		//
		System.out.println(tab);
		System.out.println("Ilosc licz "+ tab.size());
	}

}
