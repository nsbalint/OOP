package zh;

import java.time.LocalDate;
import java.util.ArrayList;

enum Style {
	IRODAI, JATEK, MEDIA;
}

public class Szoftver {
	private String nev;
	private static int ar;
	private Style style;
	private ArrayList<String> tamogatottOS;
	private LocalDate datum;

	public Szoftver(String nev, int ar, Style style, ArrayList<String> tamogatottOS, LocalDate datum) {
		this.nev = nev;
		this.ar = ar;
		this.style = style;
		this.tamogatottOS = tamogatottOS;
		this.datum = datum;
	}

	public Szoftver(String nev, ArrayList<String> tamogatottOS) {
		this(nev, (int) Math.random() * (20000 - 10000) + 10000, Style.IRODAI, tamogatottOS, LocalDate.now());
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public static int getAr() {
		return ar;
	}

	public static void setAr(int ar) {
		Szoftver.ar = ar;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	public ArrayList<String> getTamogatottOS() {
		return tamogatottOS;
	}

	public void setTamogatottOS(ArrayList<String> tamogatottOS) {
		this.tamogatottOS = tamogatottOS;
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	@Override
	public String toString() {
		return "Szoftver [nev=" + nev + ", style=" + style + ", tamogatottOS=" + tamogatottOS + ", datum=" + datum
				+ "]";
	}

	public Szoftver hasonlit(Szoftver sz1, Szoftver sz2) {
		if (sz1.getAr() < sz2.getAr()) {
			return sz2;
		} else
			return sz1;
	}

}
