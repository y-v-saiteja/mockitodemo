package com.coforge.training.mockitoDemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.spy;

import org.junit.Before;
import org.junit.Test;

/*
 * @Spy is used to create a spy instance. We can use it instead spy(Object) method.
 * Mockito provides option to create spy on real objects. When spy is called, then actual method of real object is called.
 */
public class EmployeeSpyTest {
	
	private Employee spyEmp;
	private Employee emp;
	private static final String FIRST_NAME = "James";
	private static final String LAST_NAME = "Gosling";
	private static final int AGE = 35;
	@Before
	public void buildSpy() {
	emp = new Employee(FIRST_NAME, LAST_NAME, AGE);
	spyEmp = spy(emp);//created a spy object of employee using static method spy()
	}
	@Test
	public void verifySpyEffectOnRealInstance() {
	spyEmp.setAge(20);
	assertFalse(emp.getAge() == spyEmp.getAge());
	}

	@Test
	public void verifySpyEffectOnRealInstance1() {
	spyEmp.setFirstName("Umang");
	assertFalse(emp.getFirstName() == spyEmp.getFirstName());
	}

	@Test
	public void verifySpyEffectOnRealInstance2() {
	spyEmp.setLastName("Sharma");
	assertFalse(emp.getLastName() == spyEmp.getLastName());
	}
	@Test
	public void verifySpyEffectOnRealInstance3()
	{
	String fName=spyEmp.getFullName();
	System.out.println("Full Name: "+fName);
	assertEquals(FIRST_NAME + " "+LAST_NAME, spyEmp.getFullName());
	}

}