package zh;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		LocalDate datum = null;
		ArrayList<ICJegy> jegylista = new ArrayList<>();
		
		ICJegy jegy1 = beolvas();
		jegylista.add(jegy1);
		ICJegy jegy2 = beolvas();
		jegylista.add(jegy1);
		ICJegy jegy3 = beolvas();
		jegylista.add(jegy1);
		ICJegy jegy4 = beolvas();
		jegylista.add(jegy1);

		
		kiir(jegylista);
		
		do {
			try {
				System.out.println("Kerem adjon megy egy datumot ebben a form·tumban(…………-HH-NN):");
				while(!scanner.hasNextLine()){
					System.out.println("Nem datumot adott meg!");
					scanner.next();
				}
				datum = LocalDate.parse(scanner.nextLine());
			} catch (DateTimeParseException e) {
				System.out.println("Nem jol adta meg a datumot" + e.getMessage());
			}

		} while (datum == null);
		System.out.println(megadottDatumtolKesobbi(jegylista, datum));

	}
	
	private static ArrayList<ICJegy> megadottDatumtolKesobbi(ArrayList<ICJegy> lista, LocalDate datum){
		ArrayList<ICJegy> listatomb = new ArrayList<ICJegy>();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getDatum().isAfter(datum)) {
				listatomb.add(lista.get(i));
			}
		}
		return listatomb;
		
	}

	private static void kiir(ArrayList<ICJegy> jegylista) {
		for (ICJegy icJegy : jegylista) {
			System.out.println(icJegy);
		}
		
	}

	private static ICJegy beolvas() {
		int kocsiosztaly = 0;
		int tavolsag = 0;
		LocalDate datum = null;
		Kedvezmeny kedvezmeny = null;
		String nev = null;
		
		do {
			try {
				System.out.println("Kerem adjon megy egy datumot ebben a form·tumban(…………-HH-NN):");
				while(!scanner.hasNextLine()){
					System.out.println("Nem datumot adott meg!");
					scanner.next();
				}
				datum = LocalDate.parse(scanner.nextLine());
			} catch (DateTimeParseException e) {
				System.out.println("Nem jol adta meg a datumot" + e.getMessage());
			}

		} while (datum == null);
		
		do {
			try {
				System.out.println("Adja meg az igenyelt kedvezmeny szamat(DIAK - 1, NYUGDIJAS - 2, TELJESARU -3):");
				while(!scanner.hasNextInt()){
					System.out.println("Nem jol adott meg!");
					scanner.next();
				}
				int value = scanner.nextInt();
				switch (value) {
				case 1:
					kedvezmeny = Kedvezmeny.DIAK;
					break;
				case 2:
					kedvezmeny = Kedvezmeny.NYUGDIJAS;
					break;
				case 3:
					kedvezmeny = Kedvezmeny.TELJESARU;
					break;

				default:
					kedvezmeny = Kedvezmeny.TELJESARU;
					break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Rossz argumentumot adott meg" + e.getMessage());
			}

			
		} while (kedvezmeny == null);
		
		do {
			System.out.println("Kerem adja meg a nevet:");
			while(!scanner.hasNext()){
				System.out.println("Nem jo!!");
				scanner.next();
			}
			nev = scanner.nextLine();
		} while (nev == null);
		
		do {
			try {
				System.out.println("Kerem adja meg a kocsiosztalyt (1 vagy 2)");
				while(!scanner.hasNextInt()){
					System.out.println("Nem szamot adott meg!");
					scanner.next();
				}
				kocsiosztaly = scanner.nextInt();
			} catch (IllegalArgumentException e) {
				System.out.println("Nem jol adta meg a szamot" + e.getMessage());
			}

		} while (kocsiosztaly == 0 || kocsiosztaly > 3 || kocsiosztaly < 1);
		
		do {
			try {
				System.out.println("Kerem adja meg a tavolsagot");
				while(!scanner.hasNextInt()){
					System.out.println("Nem szamot adott meg!");
					scanner.next();
				}
				tavolsag = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Nem jol adta meg a szamot" + e.getMessage());
			}

		} while (tavolsag == 0 || tavolsag < 10 || tavolsag > 1000);

		scanner.close();
		
		ICJegy jegy = new ICJegy(datum, kedvezmeny, nev, kocsiosztaly, tavolsag);
		return jegy;
	}

}
