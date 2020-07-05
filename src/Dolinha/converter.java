package Dolinha;

public class converter {

	public double dol = 0;
	public double com = 0;
	
	public double converte() {
		return  dol*com;
	}
	
	public double taxa() {
		double tax = converte();
		tax*=0.06;
		
		return tax;
	}
}
