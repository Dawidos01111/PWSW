package labb2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Main {

 public static void main(String[] args)
	{
	
	System.out.println("Podaj rozmiar tablicy");
	//Scaner liczb
	Scanner scan = new Scanner(System.in);
	int sizeTab = scan.nextInt();
	int helpfullySizeTab = sizeTab;
	double[] scopeNumberArray = {2.0, 3.0, 3.5, 4.0, 4.5, 5.0};
	double[] arrayRandomNumber = new double[sizeTab];
	double average = 0;
	double sum = 0;
	double min = arrayRandomNumber[0];
	double max = arrayRandomNumber[0];
    double [] helpArray = arrayRandomNumber;
    double standardDeviationSqrt = 0;
    double standardDeviationPow = 0;
	while(sizeTab>0)
		{
			// Losowanie liczb
			Random randomNumber = new Random();
			int rand = randomNumber.nextInt(5);
			for(int i = 0; i<sizeTab; i++)
			{
				arrayRandomNumber[i]= scopeNumberArray[rand];
			
			}
			sizeTab--;
		}
	for(double x :arrayRandomNumber)
	{ 
		System.out.println(x);
	}	
	int nr=0;
	while(nr<helpArray.length)
	{ 
		sum+=arrayRandomNumber[nr];
		nr++;
	}
	
    max = getMax(arrayRandomNumber);
	min = getMin(arrayRandomNumber);
	average = sum / helpfullySizeTab;
	 int nt=0;
	 
	while(nt<arrayRandomNumber.length)
	{ 
		if(arrayRandomNumber[nt] > average)
		{
			
			double[] biggerThanAverage = arrayRandomNumber;
			System.out.println("Liczby wieksze od sredniej "+biggerThanAverage[nt]);
		}
		if(arrayRandomNumber[nt] < average)
		{
			double[] lowerThanAverage = arrayRandomNumber;
			System.out.println("Liczby mniejsze od sredniej "+lowerThanAverage[nt]);
		}
			
		nt++;
	}
	for(int i = 0; i<arrayRandomNumber.length; i++)
	{
		standardDeviationPow += Math.pow((arrayRandomNumber[i]-average), 2);
	}
	
	standardDeviationSqrt = Math.sqrt(standardDeviationPow / arrayRandomNumber.length);
	System.out.println("Odchylenie standardowe wynosi "+ standardDeviationSqrt);
			
			
	
	
	System.out.println("Srednia liczb wynosi " +average);
	System.out.println("Najmniejsza liczba to "+ min);
	System.out.println("Najwiêksza liczba to " +max);
	
	
	}
	public static double getMax(double[] inputArray)
	{ 
	  double maxValue = inputArray[0]; 
	  for(int i=1;i < inputArray.length;i++){ 
	    if(inputArray[i] > maxValue){ 
	       maxValue = inputArray[i]; 
	    } 
	  } 
	  return maxValue; 
	}
	public static double getMin(double[] inputArray)
	{ 
	  double minValue = inputArray[0]; 
	  for(int i=1;i<inputArray.length;i++){ 
	    if(inputArray[i] < minValue){ 
	      minValue = inputArray[i]; 
	    } 
	  } 
	  return minValue; 
	} 
	
	
}