package zh;

import java.time.LocalDate;

public class ICJegy extends Jegy {
	private String nev;
	private int kocsiosztaly;
	private int tavolsag;
	private int kmAr;
	private static int potjegy = 450;

	public ICJegy(LocalDate datum, Kedvezmeny kedvezmeny, String nev, int kocsiosztaly, int tavolsag) {
		super(datum, kedvezmeny);
		if (kocsiosztaly == 1) {
			this.kmAr = 30;
		} else
			this.kmAr = 25;
		this.nev = nev;
		this.tavolsag = tavolsag;
		this.kocsiosztaly = kocsiosztaly;

	}
	
	

	public ICJegy(LocalDate datum, Kedvezmeny kedvezmeny, String nev, int kocsiosztaly) {
		super(datum, kedvezmeny);
		this.tavolsag = (int) (Math.random()*(1000 - 10) - 10);
	}
	
	



	public String getNev() {
		return nev;
	}



	public void setNev(String nev) {
		this.nev = nev;
	}



	public int getKocsiosztaly() {
		return kocsiosztaly;
	}



	public void setKocsiosztaly(int kocsiosztaly) {
		this.kocsiosztaly = kocsiosztaly;
	}



	public int getTavolsag() {
		return tavolsag;
	}



	public void setTavolsag(int tavolsag) {
		this.tavolsag = tavolsag;
	}



	public int getKmAr() {
		return kmAr;
	}



	public void setKmAr(int kmAr) {
		this.kmAr = kmAr;
	}



	public static int getPotjegy() {
		return potjegy;
	}



	public static void setPotjegy(int potjegy) {
		ICJegy.potjegy = potjegy;
	}
	
	



	@Override
	public int jegyarKiszamitas(Kedvezmeny kedvezmeny) {
		double jegyar = 0;
		switch (kedvezmeny) {
		case DIAK:
			jegyar =  (tavolsag * kmAr)* 0.5 + potjegy;
			break;
		case NYUGDIJAS:
			jegyar = (tavolsag * kmAr)* 0.9 + potjegy;
			break;
		case TELJESARU:
			jegyar = (tavolsag * kmAr)* 1 + potjegy;
			break;

		default:
			jegyar = (tavolsag * kmAr)* 1 + potjegy;
			break;
		}
		
		return (int)jegyar;
	}



	@Override
	public String toString() {
		return "ICJegy [nev=" + nev + ", kocsiosztaly=" + kocsiosztaly + ", tavolsag=" + tavolsag + ", kmAr=" + kmAr
				+ ", toString()=" + super.toString() + jegyarKiszamitas(getKedvezmeny()) +"]";
	}
	
	

}
