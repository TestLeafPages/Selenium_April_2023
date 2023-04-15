package week3.day1;

public class HDFCBank implements RBI{

	@Override
	public boolean submitKYC() {
		System.out.println("KYC is verified");
		return false;
	}
	
	public void buyCreditCard() {
		System.out.println("Call & Make CX buy CC");
	}

}
