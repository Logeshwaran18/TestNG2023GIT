package org.Example;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "login")
	private Object[][] data() {

		return new Object[][] { 
			{ "logii", "123", "add" }, 
			{ "pretthi", "465", "sub" }, 
			{ "Niran", "5556", "Multi" }
			};
	}
}
