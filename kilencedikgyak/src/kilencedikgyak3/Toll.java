package kilencedikgyak3;

import java.awt.Color;

import kilencedikgyak.Szinezheto;

public class Toll extends Aru implements Szinezheto {
    private Color szín;
    private String márkanév;

    public Toll(String márka, Color szín, int ár) {
        super("toll", ár, 27);
        this.márkanév = márka;
        this.szín = szín;
    }

    @Override
    public String toString() {
        return márkanév + " toll, szín: " + szín.toString() + ", " + super.toString();
    }

    public void színez(Color szín) {
        this.szín = szín;
    }

	@Override
	public Color getSzin() {
		return this.szín;
	}

	@Override
	public void setSzin(Color szin) {
		this.szín = szin;
	}
}
