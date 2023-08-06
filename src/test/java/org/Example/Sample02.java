package org.Example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Sample02 {
	
	@BeforeSuite (groups = {"Smoke","Sanity", "Regression"})
	public static void Tc1xsxs1() {
		System.out.println("Before Suite");

	}
	@AfterSuite (groups = {"Smoke","Sanity", "Regression"})
	public static void Tc1xsxdcs1() {
		System.out.println("After Suite");

	}
	
	@BeforeTest
	public static void Tc1xsxededcs1() {
		System.out.println("Before test");

	}
	@AfterTest
	public static void Tc1xsxededdcccs1() {
		System.out.println("After test");

	}
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
	
//	@Test
//	private void hai() {
//		System.out.println("Hai");
//	}
}
