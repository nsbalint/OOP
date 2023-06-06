package zh;

import java.time.LocalDate;

enum Kedvezmeny {
	DIAK, NYUGDIJAS, TELJESARU;
}

public abstract class Jegy {
	private LocalDate datum;
	private Kedvezmeny kedvezmeny;
	public Jegy(LocalDate datum, zh.Kedvezmeny kedvezmeny) {
		super();
		this.datum = datum;
		this.kedvezmeny = kedvezmeny;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public Kedvezmeny getKedvezmeny() {
		return kedvezmeny;
	}
	public void setKedvezmeny(Kedvezmeny kedvezmeny) {
		this.kedvezmeny = kedvezmeny;
	}
	@Override
	public String toString() {
		return "Jegy [datum=" + datum + ", kedvezmeny=" + kedvezmeny + "]";
	}
	
	public abstract int jegyarKiszamitas(Kedvezmeny kedvezmeny);
}
