package gyak2;

import java.util.ArrayList;

import gyak.Alkalmazott;
import gyak.Beosztas;
import gyak.EgyetemiAlkalmazott;

public class Main {

	public static void main()
	{
		ArrayList<EgyetemiAlkalmazott> alkalmazottak = new ArrayList<EgyetemiAlkalmazott>();

		Személy sz1 = new EgyetemiAlkalmazott("Valaki1", 34, "IIT", Beosztas.PROF);
		Személy sz2 = new EgyetemiAlkalmazott("Valaki2", 50, "IIT", Beosztas.PROF);
		Személy sz3 = new EgyetemiAlkalmazott("Valaki3", 22, "IIT", Beosztas.PROF);
		Személy sz4 = new EgyetemiAlkalmazott("Valaki4", 40, "IIT", Beosztas.PROF);
		Személy sz5 = new EgyetemiAlkalmazott("Valaki5", 55, "IIT", Beosztas.PROF);

		alkalmazottak.add(sz1);
		alkalmazottak.add(sz2);
		alkalmazottak.add(sz3);
		alkalmazottak.add(sz4);
		alkalmazottak.add(sz5);
		
		for(Alkalmazott sz : alkalmazottak){
			System.out.println(sz);
		}
	}

}
