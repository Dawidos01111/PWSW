import java.util.Random;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj rozmiar macierzy kwadratowej ");
		int sizeArray = scan.nextInt();
		int[][] array1 = new int[sizeArray][sizeArray];
		int[][] array2 = new int[sizeArray][sizeArray];
		int [][] addArray=new int[sizeArray][sizeArray];
		int [][] subArray=new int[sizeArray][sizeArray];
		int [][] multiArray=new int[sizeArray][sizeArray];
		while(sizeArray>0)
		{
		Random rand = new Random();
		// Wstawianie liczb do tablicy
		for (int i=0; i<array1.length; i++)
	    {
	    	for(int j = 0; j<array1[i].length; j++)
		    {
	    		array1[i][j] = rand.nextInt(21)-10;
	    	}
	     }
		for (int i=0; i<array2.length; i++)
	    {
	    	for(int j = 0; j<array2[i].length; j++)
		    {
	    		array2[i][j] = rand.nextInt(21)-10;
	    	}
	     }
		sizeArray--;
		}
		//wyswietlanie 
		System.out.println("pierwsza macierz");
		for (int i = 0; i < array1.length; i++) 
		{
		    for (int j = 0; j < array1[i].length; j++) 
		    {
		        System.out.print(array1[i][j] + " ");
		    }
		    System.out.println();
		}
		System.out.println("druga macierz");
		for (int i = 0; i < array2.length; i++) 
		{
		    for (int j = 0; j < array2[i].length; j++) 
		    {
		        System.out.print(array2[i][j] + " ");
		    }
		    System.out.println();
		}
		//dodawanie macierzy
		for(int i=0; i<array1.length;i++)
			for(int j=0; j<array1.length;j++)
			{
		addArray[i][j]=(array1[i][j]+array2[i][j]);
      
			}
		// odejmowanie macierzy
		for(int i=0; i<array1.length;i++)
			for(int j=0; j<array1.length;j++)
			{
		subArray[i][j]=(array1[i][j]-array2[i][j]);
			}
		//mnozenie macierzy
		
		for(int i=0; i<array1.length;i++)
		{
			for(int j=0; j<array1[i].length;j++)
			{
				for(int k = 0; k<array1[0].length; k++)
				{
					multiArray[i][j] += array1[i][k] *array2[k][j];
				}
			}
		}
		
			{
		//multiArray[i][j]+=(array2[i][j]*array1[i][j]);
			}
		System.out.println("macierz po dodawaniu");
		for (int i = 0; i < addArray.length; i++) 
		{
		    for (int j = 0; j < addArray[i].length; j++) 
		    {
		        System.out.print(addArray[i][j] + " ");
		    }
		    System.out.println();
		}
		System.out.println("macierz po odejmowaniu");
		for (int i = 0; i < subArray.length; i++) 
		{
		    for (int j = 0; j < subArray[i].length; j++) 
		    {
		        System.out.print(subArray[i][j] + " ");
		    }
		    System.out.println();
		}
		System.out.println("macierz po mnozeniu");
		for (int i = 0; i < multiArray.length; i++) 
		{
		    for (int j = 0; j < multiArray[i].length; j++) 
		    {
		        System.out.print(multiArray[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
