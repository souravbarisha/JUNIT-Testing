package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Average;

public class Average_TestCase {
@Test
public void test() {
	assertEquals(6,Average.findAverage(new int[] {7,8,6,5,4}));
	//assertEquals(5,Average.findAverage(new int[] {7,8,6,5,4}));
}
}
