package adapter2;

/**
 * 
 *���ü̳з�ʽ�Ĳ���������
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIF {

	@Override
	public void powerWithThree() {
		this.powerWithTwo();
	}

}
