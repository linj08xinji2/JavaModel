package template.method2;

/**
 * 
 * ������࣬Ϊ���������ṩһ���㷨���
 *
 * ��������
 */
public abstract class RefreshBeverage {

	/**
	 * �Ʊ����ϵ�ģ�巽�� ������������๲ͬ��ѭ���㷨���
	 */
	public final void prepareBeverageTemplate() {
		// ����1 ��ˮ���
		boilWater();
		// ����2 ��������
		brew();
		// ����3 �����ϵ��뱭��
		pourInCup();
		if(isCustomerWantCondiments()){
			// ����4 �����ζ��
			addCondiments();
		}
	}

	/**
	 * Hook,���Ӻ������ṩ һ��Ĭ�ϻ�յ�ʵ��
	 * ���������������о����Ƿ�ҹ��Լ���ιҹ�
	 * ѯ���û��Ƿ�������
	 */
	protected boolean isCustomerWantCondiments() {
		return true;
	}

	// ������������ˮ���
	private void boilWater() {
		System.out.println("��ˮ���");
	}

	// ����������� ��������
	protected abstract void brew();

	// ���������������ϵ��뱭��
	private void pourInCup() {
		System.out.println("�����ϵ��뱭��");
	}

	// ����������� �����ζ��
	protected abstract void addCondiments();
}
