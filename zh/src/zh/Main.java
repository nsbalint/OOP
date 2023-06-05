package zh;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Szoftver> szoftver = new ArrayList();
		Szoftver szoftver1 = beolvas();
		szoftver.add(szoftver1);
		Szoftver szoftver2 = beolvas();
		szoftver.add(szoftver2);
		kiir(szoftver);
		kiir(szoftver);
	}

	public static Szoftver beolvas() {
		String nev = null;
		int ar = 0;
		Style stilus;
		ArrayList<String> tamogatottOS;
		LocalDate datum;
		int korhatar = 0;

		do {
			System.out.println("Adja meg a szoftver arat: ");
			while (!scanner.hasNextInt()) {
				System.out.println("Nem jo input");
				scanner.next();
			}
			ar = scanner.nextInt();
		} while (ar > 10000 && ar < 100000);

		do {
			System.out.println("Adja meg a szoftver nevet: ");
			while (!scanner.hasNext()) {
				System.out.println("Nem jo input");
				scanner.next();
			}
			nev = scanner.nextLine();
		} while (nev.isEmpty());

		do {
			System.out.println("Adja meg a szoftver stilusat!");
			while (!scanner.hasNextInt()) {
				System.out.println("Rossz input gecosz");
				scanner.next();
			}
			int value = scanner.nextInt();

			switch (value) {
			case 1:
				stilus = Style.IRODAI;
				break;

			case 2:
				stilus = Style.JATEK;
				break;

			case 3:
				stilus = Style.MEDIA;
				break;

			default:
				stilus = Style.IRODAI;
				break;
			}
		} while (stilus == null);

		if (stilus == Style.JATEK) {

			do {
				System.out.println("Kerem adjon meg egy korhatart");
				while (!scanner.hasNextInt()) {
					System.out.println("Nem jo input");
					scanner.next();
				}
				korhatar = scanner.nextInt();
			} while (korhatar > 6 && korhatar < 18);
		}

		System.out.println("Adja meg a tamogatott operacios rendszerek listajat (vesszovel elvalasztva)!");
		String tamogatottOSString = scanner.nextLine();
		tamogatottOS = new ArrayList<>();
		if (!tamogatottOSString.isEmpty()) {
			String[] osArray = tamogatottOSString.split(",");
			for (String os : osArray) {
				tamogatottOS.add(os.trim());
			}
		}

		datum = LocalDate.now();

		if (stilus == Style.JATEK) {
			JatekSzoftver jatekSzoftver = new JatekSzoftver(nev, ar, tamogatottOS, korhatar);
			return jatekSzoftver;
		} else {
			Szoftver szoftver = new Szoftver(nev, ar, stilus, tamogatottOS, datum);
			return szoftver;

		}
	}
	
	public static void kiir(ArrayList<Szoftver> tomb) {
		for (Szoftver szoftver : tomb) {
			System.out.println(szoftver);
		}
	}
}
