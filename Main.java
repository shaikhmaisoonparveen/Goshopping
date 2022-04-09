package application;


//import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShopFactory shop=new GSShopFactory();
		
		PrimeAcc prime= new GSPrimeAcc(1, "maisoon", 500, true);
		GSNormalAcc normal=new GSNormalAcc(2, "neha", 1000, 100);
		
		prime.bookProduct(500);
		normal.bookProduct(1000);
		
		System.out.println(prime.toString());
		System.out.println();
		System.out.println(normal.toString());
	
	}

}
