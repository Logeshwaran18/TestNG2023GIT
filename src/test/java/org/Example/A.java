package org.Example;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A {

	@Parameters({ "Username", "Password" })
	@Test 
	private static void Tc01(@Optional("Kayal") String name, @Optional("9876") String pass) {
//		Assert.assertEquals(name, "Kayasl", "Enter Correct name");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(name, "Kasyal", "Enter Correct name");
		System.out.println(name);
		System.out.println(pass);
		softAssert.assertAll();
	}

	@Test(dataProviderClass = TestData.class, dataProvider = "login")
	private void Tc02(String name, String pass, String aplha) {

		System.out.println(name);
		System.out.println(pass);
		System.out.println(aplha);
	}

	@Test(groups = "Sanity")
	private void Tc03() {
		System.out.println("A TC03");

	}

}
