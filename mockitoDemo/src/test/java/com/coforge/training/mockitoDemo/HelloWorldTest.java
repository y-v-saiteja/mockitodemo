package com.coforge.training.mockitoDemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private IDemo d;
	
	@Before
	public void setUp() throws Exception {
		d=mock(IDemo.class);//create mock object
		when(d.greet()).thenReturn(IDemo.S);
		
	}

	@Test
	public void test() {
		System.out.println("Demo Greets :"+d.greet());
	assertEquals("Hello World",d.greet());
	}

}