package framework;

public abstract class PrimeAcc extends ShopAcc {
	float charges;
	
	private boolean isPrime=true;
	public boolean isPrime() {
		return isPrime;
	}
	
	private static final float deliveryCharges=0;

	public static float getDeliverycharges() {
		return deliveryCharges;
	}
	
	
     //	 Constructor for PrimeAcc:
	

	public PrimeAcc(int accNo, String accName, float charges,boolean isPrime) {
		super(accNo, accName, charges, charges);
		this.charges = charges;
		this.isPrime=isPrime;
	}
	
	//  method for bookProduct:
	@Override
	public void bookProduct( float x) {
		System.out.println();
		
	}


	@Override
	public String toString() {
		return "Dear Prime user, Your Product charges are: " +charges;
	}
	
}
