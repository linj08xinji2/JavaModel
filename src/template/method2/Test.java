package template.method2;

public class Test {

	public static void main(String[] args) {
      RefreshBeverage coffee=new Coffee();
      coffee.prepareBeverageTemplate();
      
      System.out.println("==================");
      RefreshBeverage tea=new Tea();
      tea.prepareBeverageTemplate();
	}

}
