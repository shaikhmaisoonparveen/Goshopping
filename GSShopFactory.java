package application;
import framework.*;

public class GSShopFactory  extends ShopFactory{
	
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accName, float charges, boolean isPrime) {
		
		
		GSPrimeAcc GsPrime = new GSPrimeAcc(accNo, accName, charges, isPrime);
		System.out.println(GsPrime.toString());
	     return GsPrime;
		
	}

	public GSNormalAcc getNewNormalAccount(int accNo, String accName, float charges,float deliveryCharges) {
		
		
		GSNormalAcc GsNormal = new GSNormalAcc(accNo, accName, charges, deliveryCharges);
		System.out.println(GsNormal.toString());
		return GsNormal;
		
	}

//	@Override
	//public NormalAcc getNewNormalAccount(int accNo, String accName, float charges, boolean isPrime) {
		//return null;
	//}
	
	
	
}
