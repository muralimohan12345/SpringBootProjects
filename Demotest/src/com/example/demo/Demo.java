package com.example.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo {

//	@Before
//	public void beforemethod() {
//	 System.out.println("in before method");
//	}
	@BeforeClass
	public static void beforemethod() {
	 System.out.println("in before method");
	}

	@Test
	public void test1() {
	 System.out.println("in test1 method");
	}
	@Test
	public void test2() {
	 System.out.println("in test2 method");
	}
//	@After
//	public void aftermethod() {
//	 System.out.println("in after method");
//	}
	@AfterClass
	public static void aftermethod() {
	 System.out.println("in after method");
	}
}
