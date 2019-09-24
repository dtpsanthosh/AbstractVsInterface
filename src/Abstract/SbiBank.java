package Abstract;

public class SbiBank extends Bank {

	@Override
	public int calculateInterest() {
		System.out.println("SBI Bank Calculate Interest Implementation");
		return 0;
	}

}
