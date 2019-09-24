package Interface;

public class Test {

	public static void main(String[] args) {
		BankInterface hdfc=new HDFCBank();
		hdfc.deposit();
		hdfc.withdraw();
		hdfc.calculateInterest();
		BankInterface sbi=new SBIBank();
		sbi.deposit();
		sbi.withdraw();
		sbi.calculateInterest();
	}

}
/*OUTPUT
SBI Bank Deposit Implementation
SBI Bank Withdraw Implementation
SBI Bank CalculateInterest Implementation
HDFC Bank Deposit Implementation
HDFC Bank Withdraw Implementation
HDFC Bank CalculateInterest Implementation*/