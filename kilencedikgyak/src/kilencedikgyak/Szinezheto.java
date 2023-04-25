package kilencedikgyak;

import java.awt.Color;

public interface Szinezheto {
    Color alapertelmezettSzín = Color.RED;

    Color getSzin();

    void setSzin(Color szin);

    static void setDefaultColor(Szinezheto obj) {
        obj.setSzin(alapertelmezettSzín);
    }
}
