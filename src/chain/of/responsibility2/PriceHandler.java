package chain.of.responsibility2;


/**
 * 
 * 价格处理 人，负责客户价格申请
 */
public abstract class PriceHandler {
	/**
	 * 直接后继，用于传递请求
	 */
	protected PriceHandler successor;

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}

	public abstract void processDiscount(float discount);

}
