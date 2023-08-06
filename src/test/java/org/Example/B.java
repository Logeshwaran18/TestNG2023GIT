package org.Example;
import org.testng.annotations.Test;

public class B {

	@Test (groups = "Smoke")
	private static void Tc012() {
		System.out.println("B TC01");

	}

	@Test(groups = "Regression")
	private void Tc022() {
		System.out.println("B TC02 test");

	}

	@Test(groups = "Smoke")
	private void Tc032() {
		System.out.println("B TC03 test 001");

	}
}
