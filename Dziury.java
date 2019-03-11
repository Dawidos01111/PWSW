import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

	public static void main(String[] args)
	{
		int iloscDziur = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Wprowadz ci¹g binarny");
		
			String bin = scan.nextLine(); 	
			System.out.println("Wprowdzi³eœ ci¹g "+bin);
			Pattern wzor = Pattern.compile("(?=(10+1)).");
			Matcher dopasowanie = wzor.matcher(bin);
			while(dopasowanie.find())
			{
				iloscDziur++;
			}
			
			System.out.println("Iloœæ wyst¹pieñ dziur wynosi "+iloscDziur+".");
	}
}
