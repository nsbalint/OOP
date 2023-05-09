package package2;

public class InsufficientFundsException extends Exception {
	private int hianyzoOsszeg;

	public InsufficientFundsException(int hianyzoOsszeg) {
		this.hianyzoOsszeg = hianyzoOsszeg;
	}

	public int getHianyzoOsszeg() {
		return hianyzoOsszeg;
	}

	@Override
	public String toString() {
		return "InsufficientFundsException [hianyzoOsszeg=" + hianyzoOsszeg + "]";
	}

}
