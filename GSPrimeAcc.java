package application;

import framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
    private static final float Charges=0;
	public float getCharges() {
		return Charges;
	}
//  constructor of GSPrimeAcc with member variable
	public GSPrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges, isPrime);
		
	}
	
	@Override
	public void bookProduct(float f) {
		super.bookProduct(f);
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
