package kilencedikgyak2;

import kilencedikgyak.Szinezheto;
import java.awt.Color;

public class Szinespont extends Pont implements Szinezheto {

	private Color szin;

    public Szinespont() {
        this(Color.RED, 0, 0);
    }

    public Szinespont(Color szin) {
        this(szin, 0, 0);
    }

    public Szinespont(Color szin, int x, int y) {
        super(x, y);
        this.szin = szin;
    }

    @Override
    public String toString() {
        return "Szines pont: " + super.toString() + " szin: " + szin.toString();
    }

    @Override
    public Color getSzin() {
        return szin;
    }

    @Override
    public void setSzin(Color szin) {
        this.szin = szin;
    }
}
