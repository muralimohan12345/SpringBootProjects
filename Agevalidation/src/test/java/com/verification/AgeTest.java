package com.verification;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeTest {

	@Test
	public void test1() {
		Ageverification ageverify=new Ageverification();
		//expected output     ,actual output
		assertEquals("right to vote",ageverify.ageValid(25));
	} 
	@Test
	public void test2() {
		Ageverification ageverify=new Ageverification();
		//expected output     ,actual output
		assertEquals("check the age to vote",ageverify.ageValid(10));
}
}
