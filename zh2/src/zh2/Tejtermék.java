package zh2;

import java.time.LocalDate;

public class Tejtermék {
	private int egysegar;
	private String marka;
	private LocalDate gyartas;
	private LocalDate lejarat;

	public Tejtermék(int egysegar, String marka, LocalDate gyartas) {
		super();
		this.egysegar = egysegar;
		this.marka = marka;
		this.gyartas = gyartas;
		lejarat = gyartas.plusDays(7);
	}

	public boolean ehetoE(LocalDate aktualis, LocalDate lejarat) {
		if (aktualis.isBefore(lejarat)) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public int getEgysegar() {
		return egysegar;
	}

	public void setEgysegar(int egysegar) {
		this.egysegar = egysegar;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public LocalDate getGyartas() {
		return gyartas;
	}

	public void setGyartas(LocalDate gyartas) {
		this.gyartas = gyartas;
	}

	public LocalDate getLejarat() {
		return lejarat;
	}

	public void setLejarat(LocalDate lejarat) {
		this.lejarat = lejarat;
	}

	@Override
	public String toString() {
		return "Tejtermék [egysegar=" + egysegar + ", marka=" + marka + ", gyartas=" + gyartas + ", lejarat=" + lejarat
				+ ehetoE(gyartas, lejarat)+"]";
	}



}
