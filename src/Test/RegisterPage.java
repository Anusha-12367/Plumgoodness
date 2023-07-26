package Test;
import org.testng.annotations.Test;
import Baseclass.BaseClass;
import Page.HomePage;

public class RegisterPage extends BaseClass {

	
	@Test
	public void testlogin() throws InterruptedException
	{
		
		HomePage hp=new HomePage(dr);
		
		hp.register();
	}


}
