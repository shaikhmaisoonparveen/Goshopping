package framework;

public abstract class NormalAcc extends ShopAcc {
	
private final float deliveryCharges=100;
float charges;

public float getdeliveryCharges() {
	return deliveryCharges;
}

public NormalAcc(int accno, String accname, float charges) {
	super (accno, accname, charges, charges);
	this.charges=charges;
	
}
public void bookproduct(float f1) {
	System.out.println();
}
@Override
public String toString() {
	return "Dear normal user, Your charges are:" +charges+  "\nwith deliverycharges:"+deliveryCharges;
}

}
