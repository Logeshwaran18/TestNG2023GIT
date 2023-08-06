import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	

	@BeforeClass
	public static void Tc11() {
		System.out.println("Before Class");

	}

	@AfterClass
	public static void Tc112() {
		System.out.println("After Class");

	}

	@BeforeMethod
	private void Tc123() {
		System.out.println("Before Method ");

	}

	@AfterMethod
	private void Tc1233() {
		System.out.println("After Method ");
		
	}

	@Test (enabled = false)
	private static void Tc01() {
		System.out.println("TC01");

	}

	@Test (priority = 1)
	private void Tc02() {
		System.out.println("TC02");

	}

	@Test(invocationCount = 4)
	private void Tc03() {
		System.out.println("TC03");

	}
}