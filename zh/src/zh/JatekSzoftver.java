package zh;

import java.time.LocalDate;
import java.util.ArrayList;

public class JatekSzoftver extends Szoftver{
	private int korhatar;

	public JatekSzoftver(String nev, int ar, ArrayList<String> tamogatottOS, int korhatar) {
		super(nev, ar, Style.JATEK, tamogatottOS, LocalDate.now().minusYears(1));
		this.korhatar = korhatar;
	}

	public int getKorhatar() {
		return korhatar;
	}

	public void setKorhatar(int korhatar) {
		this.korhatar = korhatar;
	}

	@Override
	public String toString() {
		return "JatekSzoftver [korhatar=" + korhatar + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
