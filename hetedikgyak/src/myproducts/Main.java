package myproducts;

public class Main {

	public static void main(String[] args) {
		Product a = new Product("toll", 200, 5);
		System.out.println(a);

		Kenyer b = new Kenyer("asd", 300, 10, 2);
		System.out.println(b);

		Product product2 = new Kenyer("kenyer2 xddd", 300, 10, 1);
		System.out.println(product2);

		Kenyer kenyer2 = new Kenyer("kenyer3", 250, 12, 1);
		System.out.println(kenyer2);

		if (Kenyer.getNagyobbEgysegAruKenyer(kenyer2, (Kenyer)(product2)))
			System.out.println(" Nagyobb egysegaru: " + kenyer2);
		else
			System.out.println(" Nagyobb egysegaru: " + product2);

	}

}
