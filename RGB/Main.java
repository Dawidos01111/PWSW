
public class Main
{

	public static void main(String[] args)
	{
		RGB c1 = new RGB(255,255,0);
		System.out.println("First colour");
		System.out.println(c1);
		RGB c2 = new RGB(140,55,100);
		System.out.println("Second colour");
		System.out.println(c2);
		ColourController cc = new ColourController();	
		System.out.println("Mixed colour");
		System.out.println(cc.mixColour(c1,c2));
	}

}
