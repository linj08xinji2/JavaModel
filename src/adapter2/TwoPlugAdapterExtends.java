package adapter2;

/**
 * 
 *采用继承方式的插座适配器
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIF {

	@Override
	public void powerWithThree() {
		this.powerWithTwo();
	}

}
