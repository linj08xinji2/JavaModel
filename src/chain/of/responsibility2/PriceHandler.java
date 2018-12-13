package chain.of.responsibility2;


/**
 * 
 * �۸��� �ˣ�����ͻ��۸�����
 */
public abstract class PriceHandler {
	/**
	 * ֱ�Ӻ�̣����ڴ�������
	 */
	protected PriceHandler successor;

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}

	public abstract void processDiscount(float discount);

}
