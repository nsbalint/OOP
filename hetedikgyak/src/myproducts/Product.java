package myproducts;

public class Product {

	private String nev;
	private int ar;
	private int afakulcs;

	public Product(String nev, int ar, int afakulcs) {
		this.nev = nev;
		this.ar = ar;
		this.afakulcs = afakulcs;
	}

	public int getBruttoAr() {
		return this.ar * (afakulcs / 100) + this.ar;
	}

	public String toString() {
		return " Neve: " + nev + " Ara: " + ar;
	}

	public void nettoArNovel(int szazalek) {
		this.ar += this.ar * (szazalek / 100);
	}

	public void arHasonlitas(Product p) {
		if ((this.ar + this.ar * (this.afakulcs / 100)) > (p.ar + p.ar * (afakulcs / 100)))
			;
	}
}
