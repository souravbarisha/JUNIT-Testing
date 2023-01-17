package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.JunitDemo1;

public class JunitDemo1_TestCase {
@Test
public void max() {
	assertEquals(8,JunitDemo1.findMax(new int[] {1,3,4,2,8}));
	assertEquals(-1,JunitDemo1.findMax(new int[] {-12,-1,-3,-4,-2}));
	
}
}
