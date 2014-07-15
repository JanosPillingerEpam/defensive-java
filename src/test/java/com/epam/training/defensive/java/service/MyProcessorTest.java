package com.epam.training.defensive.java.service;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import net.sf.oval.exception.ConstraintsViolatedException;

import org.junit.Before;
import org.junit.Test;

import static com.epam.training.defensive.java.service.AOPTestHelper.createAOPProxy;

public class MyProcessorTest {

	private MyTransaction underTest;
	
	@Before
	public void setUp() {
		underTest = createAOPProxy( new MyTransaction());
	}
	
	@Test(expected =  ConstraintsViolatedException.class)
	public void testAddPastDate() {
        //given
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, -1);
		Date tooOld = new Date(calendar.getTimeInMillis());
        BigDecimal value = new BigDecimal(1);
		//when
        underTest.add(value,"0123456789", tooOld);
        //then EXCEPTION THROWN
    }
}
