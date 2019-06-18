
public class RGB
{
	private int R_value;
	private int G_value;
	private int B_value;
	
	public RGB(int R_value, int G_value, int B_value)
	{
		this.R_value = R_value;
		this.G_value = G_value;
		this.B_value = B_value;
	}
	

	public int getR_value() {
		return R_value;
	}


	public void setR_value(int r_value) {
		R_value = r_value;
	}


	public int getG_value() {
		return G_value;
	}


	public void setG_value(int g_value) {
		G_value = g_value;
	}


	public int getB_value() {
		return B_value;
	}


	public void setB_value(int b_value) {
		B_value = b_value;
	}


	@Override
	public String toString() {
		return "[" + R_value + "," + G_value + "," + B_value + "]";
	}

	
	// G³ówna metoda main
}

