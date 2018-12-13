package chain.of.responsibility2;

/**
 * �ۿ۳���55%���ܾ�����
 *
 */
public class CEO extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.55) {
			System.out.format("%s��׼���ۿۣ�%.2f%n", this.getClass().getName(),
					discount);
		} else {
			System.out.format("%s�ܾ����ۿۣ�%.2f%n", this.getClass().getName(),
					discount);
		}
	}
}
