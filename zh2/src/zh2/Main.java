package zh2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Sajt> sajtoktomb = new ArrayList<>();

		Sajt s1 = beolvas();
		sajtoktomb.add(s1);
		Sajt s2 = beolvas();
		sajtoktomb.add(s2);

		kiir(sajtoktomb);
		hanySajtEheto(sajtoktomb);

	}

	private static void kiir(ArrayList<Sajt> sajtoktomb) {
		for (Sajt sajt : sajtoktomb) {
			System.out.println(sajtoktomb);
		}
	}
	
	private static int hanySajtEheto(ArrayList<Sajt> sajtoktomb) {
		int count = 0;
		
		for (int i = 0; i < sajtoktomb.size(); i++) {
			if(sajtoktomb.get(i).ehetoE(LocalDate.now(), sajtoktomb.get(i).getGyartas().plusDays(7))){
				continue;
			}
			else 
				count++;
		}
		return count;
		
	}

	private static Sajt beolvas() {
		int egysegar = 0;
		String marka = null;
		LocalDate gyartas = null;
		double tomeg = Math.random() * (100 - 10) - 10;
		Type tipus = null;
		double zsirtartalom = 0;
		int value = 0;

		do {
			System.out.println("add meg az egysegarat!");
			while (!scanner.hasNextInt()) {
				System.out.println("Rossz input");
				scanner.next();
			}
			try {
				egysegar = scanner.nextInt();
			} catch (IllegalArgumentException e) {
				System.out.println("problema van: " + e.getMessage());
			}

		} while (egysegar < 2000 || egysegar > 8000);

		do {
			System.out.println("add meg a markat!");
			while (!scanner.hasNext()) {
				System.out.println("Rossz input");
				scanner.next();
			}
			try {
				marka = scanner.nextLine();
			} catch (Exception e) {
				System.out.println("problema van: " + e.getMessage());
			}

		} while (marka == null);

		do {
			System.out.println("add meg a gyartas idejet!");
			while (!scanner.hasNext()) {
				System.out.println("Rossz input");
				scanner.next();
			}
			try {
				gyartas = LocalDate.parse(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("problema van: " + e.getMessage());
			}

		} while (gyartas == null);

		do {
			System.out.println("add meg a tipusat! 1 vagy 2 vagy 3");
			while (!scanner.hasNextInt()) {
				System.out.println("Rossz input");
				scanner.next();
			}
			try {
				value = scanner.nextInt();
				switch (value) {
				case 1:
					tipus = Type.DARABOLT;
					break;
				case 2:
					tipus = Type.SZELETELT;
					break;
				case 3:
					tipus = Type.OMLESZTETT;
					break;

				default:
					tipus = Type.DARABOLT;
					break;
				}
			} catch (Exception e) {
				System.out.println("problema van: " + e.getMessage());
			}

		} while (gyartas == null || value > 3 || value < 0);

		do {
			System.out.println("add meg a zsirtartalmat!");
			while (!scanner.hasNextDouble()) {
				System.out.println("Rossz input");
				scanner.next();
			}
			try {
				zsirtartalom = scanner.nextDouble();
			} catch (Exception e) {
				System.out.println("problema van: " + e.getMessage());
			}

		} while (zsirtartalom == 0);

		Sajt sajt = new Sajt(egysegar, marka, gyartas, tomeg, tipus, zsirtartalom);
		return sajt;

	}

}
