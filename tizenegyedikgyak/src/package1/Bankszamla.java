package package1;

import package2.InsufficientFundsException;

public class Bankszamla {
	private int szamlaSzam;
	private int szamlaEgyenleg;

	public Bankszamla(int szamlaSzam) {
		this.szamlaSzam = szamlaSzam;
		szamlaEgyenleg = 0;
	}

	public int getSzamlaSzam() {
		return szamlaSzam;
	}

	public int getSzamlaEgyenleg() {
		return szamlaEgyenleg;
	}

	public void penzbetet(int penzEgyenleg) {
		this.szamlaEgyenleg += penzEgyenleg;
	}

	public void penzkivet(int penzEgyenleg) throws InsufficientFundsException {
		if (penzEgyenleg > szamlaEgyenleg) {
			throw new InsufficientFundsException(penzEgyenleg - szamlaEgyenleg);
		} else {
			szamlaEgyenleg -= penzEgyenleg;
		}

	}

	@Override
	public String toString() {
		return "Bankszamla [szamlaSzam=" + szamlaSzam + ", szamlaEgyenleg=" + szamlaEgyenleg + "]";
	}

}
