package template.method2;

public class Coffee extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("�÷�ˮ���ݿ���");
	}

	@Override
	protected void addCondiments() {
		System.out.println("�������м���ţ��");
	}

    
}
