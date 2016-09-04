package org.kpfunda.myexperiments.junit;

import org.junit.Test;

import junit.framework.TestCase;

public class MyJUnit1 extends TestCase{

	@Test
	public void test1(){
		
		assertEquals("hello1", "hello1");
	}
	
	@Test
	public void test2(){
		
		assertEquals("world1", "world2");
	}
	
}
