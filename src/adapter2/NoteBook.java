package adapter2;

public class NoteBook {

	private ThreePlugIF plug;

	public NoteBook(ThreePlugIF plug) {
		this.plug = plug;
	}

	// ʹ�ò������
	public void charge() {
		plug.powerWithThree();
	}

	public static void main(String[] args) {
		GBTwoPlug two = new GBTwoPlug();
		ThreePlugIF three = new TwoPlugAdapter(two);
		NoteBook nb = new NoteBook(three);
		nb.charge();
		System.out.println("================");

		three = new TwoPlugAdapterExtends();
		nb = new NoteBook(three);
		nb.charge();
	}

}
