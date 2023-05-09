package package3;

import package1.Bankszamla;
import package2.InsufficientFundsException;

public class Main {

	public static void main(String[] args) {
		Bankszamla szamla1 = new Bankszamla(69);

		szamla1.penzbetet(2000);
		System.out.println(szamla1);
		try {
			szamla1.penzkivet(5000);
		} catch (InsufficientFundsException e) {
			System.out.println(e.toString());
		}
		System.out.println(szamla1.getSzamlaEgyenleg());
	}

}
