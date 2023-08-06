package org.Example;
import org.testng.annotations.Test;

public class C {

	@Test(groups = "Regression")
	private static void Tc0122() {
		System.out.println("C TC01");

	}

	@Test (groups = "Sanity")
	private void Tc0222() {
		System.out.println("C TC02 happy to see you");

	}

	@Test(groups = "Sanity")
	private void Tc0322() {
		System.out.println("C TC03");

	}
}
