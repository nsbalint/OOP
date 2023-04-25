package kilencedikgyak3;

import java.awt.Color;

import kilencedikgyak2.Szinespont;
import kilencedikgyak.Szinezheto;

public class Main {
    public static void main(String[] args) {
        Szinezheto szp = new Szinespont(Color.BLUE, 5, 10);
        System.out.println(szp.toString());
        szp.setSzin(Color.GREEN);
        System.out.println(szp.toString());

        Szinezheto toll = new Toll("Parker", Color.BLACK, 1200);
        System.out.println(toll.toString());
        toll.setSzin(Color.YELLOW);
        System.out.println(toll.toString());

        Szinezheto.setDefaultColor(szp);
        Szinezheto.setDefaultColor(toll);
        System.out.println(szp.toString());
        System.out.println(toll.toString());
    }
}
