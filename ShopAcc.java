package framework;

public abstract class ShopAcc {

	//declaring accno
private int accNo;

//getting accno
public int getaccno() {
	return accNo;
}

private String accname;
public String getaccname() {
	return accname;
}

public void getaccname(String accname) {
	this.accname=accname;
}
private float charges;
public float getcharges() {
	return charges;
}
private static float deliveryCharges=0;

public static float getDeliverycharges() {
	return deliveryCharges;
}

public ShopAcc(int accno, String accname, float charges,float deliveryCharges) {
	super();
	this.accNo = accNo;
	this.accname = accname;
	this.charges = charges;
	this.deliveryCharges=deliveryCharges;
}
//defining abstract bookproduct
public void bookproduct(float f) {
	
}
//defining iteam method
public void iteam (float y) {
	System.out.println("tops:100\n");
	System.out.println("bottom:800\n");
	System.out.println("Tshirt:500\n");
	System.out.println("Shirt:100\n");
	System.out.println("shoes:100\n");
	
}

@Override
public String toString() {
	return accname ;
}

public void bookProduct(float f) {
	// TODO Auto-generated method stub
	
}

}
