package Abstract;

public class Test {
	public static void main(String[] args) {
		Bank hdfc = new HdfcBank();
		hdfc.deposit();
		hdfc.withdraw();
		hdfc.calculateInterest();
		Bank sbi=new SbiBank();
		sbi.deposit();
		sbi.withdraw();
		sbi.calculateInterest();
	}
}
/*	OUTPUT
	Common Deposit Method implementation for all banks
	Common Withdraw Method implementation for all banks
	HDFC Bank Calculate Interest Implementation
	Common Deposit Method implementation for all banks
	Common Withdraw Method implementation for all banks
	SBI Bank Calculate Interest Implementation*/