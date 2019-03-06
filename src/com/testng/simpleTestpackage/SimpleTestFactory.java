package com.testng.simpleTestpackage;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

class SimpleTest {
	
	int param;
	
	public SimpleTest() {
		this.param = 0;
	}
	public SimpleTest(int param) {
		this.param = param;
	}
	
	@Test
	public void Test1() {
	
		System.out.println("Test1("+ param +") is called.");
	}
	
	@Test (enabled = true)
	public void Test2() {
		System.out.println("Test2("+ param +") is called.");
	}
}

public class SimpleTestFactory {
	
	@Factory						// Factory method should return array of Object class.
	public Object[] factoryMethod() {
        return new Object[] {new SimpleTest(1), new SimpleTest(2), new SimpleTest()};
	}

}
