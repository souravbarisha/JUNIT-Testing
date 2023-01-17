package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.EvenOdd;

public class EvenOdd_TestCase {
@Test
public void test() {
	assertEquals(true,EvenOdd.findEvenOdd(4));
//	assertEquals(true,EvenOdd.findEvenOdd(5));
//	assertEquals(false,EvenOdd.findEvenOdd(5));
}

}
