package kilencedikgyak3;

public class Aru {

	private String nev;
	private int netto_ar;
	private int afa_kulcs;
	
	public Aru(String nev, int netto_ar, int afa_kulcs) {
		super();
		this.nev = nev;
		this.netto_ar = netto_ar;
		this.afa_kulcs = afa_kulcs;
	}

	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public int getNetto_ar() {
		return netto_ar;
	}
	public void setNetto_ar(int netto_ar) {
		this.netto_ar = netto_ar;
	}
	public int getAfa_kulcs() {
		return afa_kulcs;
	}
	public void setAfa_kulcs(int afa_kulcs) {
		this.afa_kulcs = afa_kulcs;
	}
	
	public int brutto_ar() {
	    double plusz = this.netto_ar * (this.afa_kulcs / 100.0);
	    int brutto = (int) (this.netto_ar + plusz);
	    return brutto;
	}

	@Override
	public String toString() {
		return "Product [nev=" + nev + ", brutto_ar()=" + brutto_ar() + "]";
	}
	
	public void setNettoArUj (int uj_netto) {
		this.netto_ar *= (uj_netto/100);
	}
	
	public int isExpensiveThan (Aru masik_product) {
		if (this.getNetto_ar() > masik_product.getNetto_ar()) {
			return 1;
		}else if (this.getNetto_ar() < masik_product.getNetto_ar()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}