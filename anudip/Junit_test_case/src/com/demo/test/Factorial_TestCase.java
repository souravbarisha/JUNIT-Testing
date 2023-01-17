package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Factorial;

public class Factorial_TestCase {
@Test
public void test() {
	assertEquals(120,Factorial.findFactorial(5));
	//assertEquals(125,Factorial.findFactorial(5));
}
}
