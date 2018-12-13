package adapter2;

public class TwoPlugAdapter implements ThreePlugIF {

	private GBTwoPlug plug;
	
	public TwoPlugAdapter(GBTwoPlug plug) {
		this.plug = plug;
	}

	@Override
	public void powerWithThree() {
		System.out.println("Í¨¹ý×ª»»");
		plug.powerWithTwo();
	}

}
