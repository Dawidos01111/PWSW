
public class ColourController {

	public RGB mixColour(RGB c1, RGB c2)
	{
		 int rCol=(c1.getR_value() + c2.getR_value())/2;
		 int gCol=(c1.getG_value() + c2.getG_value())/2;
		 int bCol=(c1.getB_value() + c2.getB_value())/2;
		
		return new RGB(rCol, gCol, bCol);

	}

}
