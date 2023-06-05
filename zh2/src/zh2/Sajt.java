package zh2;

import java.time.LocalDate;

enum Type {
	DARABOLT, SZELETELT, OMLESZTETT;
}

public class Sajt extends Tejtermék {
	private double tomeg;
	private Type tipus;
	private double zsirtartalom;
	private int eladasiar;

	public Sajt(int egysegar, String marka, LocalDate gyartas, double tomeg, Type tipus, double zsirtartalom) {
		super(egysegar, marka, gyartas);
		this.tomeg = tomeg;
		this.tipus = tipus;
		this.zsirtartalom = zsirtartalom;
	}

	public void eladasiArCalculator(Type type, int egysegar) {
		switch (type) {
		case DARABOLT:
			eladasiar = (int) (egysegar*tomeg*zsirtartalom/21*1);
			break;
		case SZELETELT:
			eladasiar = (int) (egysegar*tomeg*zsirtartalom/21*1.2);
			break;
		case OMLESZTETT:
			eladasiar = (int) (egysegar*tomeg*zsirtartalom/21*1.4);
			break;
		default:
			System.out.println("fasz");
			break;
		}
	}

	public Sajt(int egysegar, String marka, double tomeg, Type tipus) {
		super(egysegar, marka, null);
		this.tomeg = tomeg;
		this.tipus = tipus;
		setGyartas(LocalDate.now());
		this.zsirtartalom = 21;
		
	}

	@Override
	public String toString() {
		return "Sajt [tomeg=" + tomeg + ", tipus=" + tipus + ", zsirtartalom=" + zsirtartalom + ", eladasiar="
				+ eladasiar + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
