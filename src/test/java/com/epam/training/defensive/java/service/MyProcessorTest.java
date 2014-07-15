package com.epam.training.defensive.java.service;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import static com.epam.training.defensive.java.service.AOPTestHelper.createAOPProxy;

public class MyProcessorTest {

	private MyProcessor underTest;
	
	@Before
	public void setUp() {
		underTest = createAOPProxy( new MyProcessor());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddNullAmount() {
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
