package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.demo.main.Factorial;
import com.demo.main.JunitDemo1;

public class JunitDemo1_TestCase_BeforeClass {
@BeforeClass
public static void beforecl() throws Exception{
	System.out.println("Before the class will implement");
}
@Before
public void before() throws Exception{
	System.out.println("using before class");
}

@Test 
public void max() {
	assertEquals(8,JunitDemo1.findMax(new int[] {1,3,4,2,8}));
	assertEquals(-1,JunitDemo1.findMax(new int[] {-12,-1,-3,-4,-2}));
}
@Test
public void findsquare() {
	assertEquals(4,JunitDemo1.square(2));
}
@Test
public void Reverse() {
	assertEquals("avaJevoLI ",JunitDemo1.reverseWord("ILoveJava"));
}
@After
public void after() throws Exception{
	System.out.println("using after class");
}
@AfterClass
public static void aftercl() throws Exception{
	System.out.println("After the class will implement");
}
}
