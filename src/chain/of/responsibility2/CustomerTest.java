package chain.of.responsibility2;

import java.util.Random;

public class CustomerTest {

	private PriceHandler priceHandler;

	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}

	public void requestDiscount(float discount) {
		priceHandler.processDiscount(discount);
	}

	public static void main(String[] args) {
		CustomerTest customer = new CustomerTest();
		customer.setPriceHandler(PriceHandlerFactory.createPirceHandler());
		Random random = new Random();
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + ":");
			customer.requestDiscount(random.nextFloat());
		}
	}
}
