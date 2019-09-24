package Interface;

public class HDFCBank implements BankInterface{

	@Override
	public void deposit() {
		System.out.println("SBI Bank Deposit Implementation");
	}

	@Override
	public void withdraw() {
		System.out.println("SBI Bank Withdraw Implementation");
		
	}

	@Override
	public void calculateInterest() {
		System.out.println("SBI Bank CalculateInterest Implementation");
		
	}
	

}
