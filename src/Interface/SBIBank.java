package Interface;

public class SBIBank implements BankInterface{

	@Override
	public void deposit() {
		System.out.println("HDFC Bank Deposit Implementation");
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC Bank Withdraw Implementation");
		
	}

	@Override
	public void calculateInterest() {
		System.out.println("HDFC Bank CalculateInterest Implementation");
		
	}
	

}
