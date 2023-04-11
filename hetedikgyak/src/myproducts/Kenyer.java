package myproducts;

public class Kenyer extends Product {
	private double mennyiseg;

	public Kenyer(String nev, int ar, int afakulcs, double mennyiseg) {
		super(nev, ar, afakulcs);
		this.mennyiseg = mennyiseg;
	}

	public String toString() {
		return super.toString() + " Egysegar: " + super.getBruttoAr() / this.mennyiseg;
	}

	public double getMennyiseg() {
		return this.mennyiseg;
	}

	public static boolean getNagyobbEgysegAruKenyer(Kenyer a, Kenyer b) {
		if ((a.getBruttoAr() / a.mennyiseg) > (b.getBruttoAr() / b.mennyiseg)) {
			return true;
		}
		return false;
	}
}
