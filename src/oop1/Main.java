package oop1;

public class Main {

	public static void main(String[] args) {
		// String mesaj = "Vade oranı";

		Product product1 = new Product("Delonghi Kahve Makinesi", 7500, 7, "kahveMakinesi.png", 3);
		Product product2 = new Product("Bilgisayar", 17500, 4, "bilgisayar.png", 2);
		Product product3 = new Product("Smeg Kahve Makinesi", 4500, 9, "kahveMakinesi2.png", 4);

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>");
			System.out.println(product.getName() + " : " + product.getUnitPrice() + "TL");
			System.out.println("</li>");
		}
		System.out.println("</ul>");
	}

}
