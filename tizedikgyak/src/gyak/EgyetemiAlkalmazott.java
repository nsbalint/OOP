package gyak;

public class EgyetemiAlkalmazott extends Alkalmazott {
	private Beosztas beosztas;
	private int alapber = 500000;

	public EgyetemiAlkalmazott(String nev, int kor, String munkahely, Beosztas beosztas) {
		super(nev, kor, munkahely, 0);
		this.beosztas = beosztas;
		switch (beosztas) {
		case PROF:
			setFizetes(alapber);
			break;
		case OKTATO:
			setFizetes(alapber * 50 / 100);
			break;
		case ADMIN:
			setFizetes(alapber * 30 / 100);
			break;
		}
	}

	public Beosztas getBeosztas() {
		return beosztas;
	}

	public void setBeosztas(Beosztas beosztas) {
		this.beosztas = beosztas;
	}

	public int getAlapber() {
		return alapber;
	}

	@Override
	public String toString() {
		return "EgyetemiAlkalmazott [beosztas=" + beosztas + "]";
	}

}
