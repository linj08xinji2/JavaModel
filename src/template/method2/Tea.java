package template.method2;

public class Tea extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("��85����ˮ�ݲ�15����");
	}

	@Override
	protected void addCondiments() {
		System.out.println("�����м�������");
	}

	/**
	 * ����ͨ�����ǵ���ʽѡ����ع��Ӻ���
	 */
	@Override
	protected boolean isCustomerWantCondiments() {
		return false;
	}
}
