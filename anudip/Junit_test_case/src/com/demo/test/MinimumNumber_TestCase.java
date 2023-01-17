package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.MinimumNumber;

public class MinimumNumber_TestCase {
@Test
public void test() {
	assertEquals(3,MinimumNumber.findMinimum(new int[] {5,7,9,3,6,4,8}));
//	assertEquals(4,MinimumNumber.findMinimum(new int[] {5,7,9,3,6,4,8}));
}
}
