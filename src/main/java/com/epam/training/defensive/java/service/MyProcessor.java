package com.epam.training.defensive.java.service;

import java.math.BigDecimal;
import java.util.Date;

import net.sf.oval.constraint.DateRange;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotNegative;
import net.sf.oval.constraint.NotNull;

import com.epam.training.defensive.java.interfaces.Transaction;

public class MyProcessor implements Transaction {

	/**
	 * Add the given money to the account.
	 * 
	 * @param amount
	 *            cannot be null or negative
	 * @param account
	 *            cannot be null, 10 chars length
	 * @param transactionDate
	 *            cannot be null or past date
	 * @return transactionId not null
	 */
	@Override
	public @NotNull String add(@NotNull @NotNegative BigDecimal amount,
			@NotNull @Length(min = 10, max = 10) String account,
			@NotNull @DateRange(min = "now") Date transactionDate) {
		return "";
	}

	/**
	 * Cash withdrawal from the given account.
	 * 
	 * @param amount
	 *            cannot be null or negative
	 * @param account
	 *            cannot be null, 10 chars length
	 * @param transactionDate
	 *            cannot be null or past date
	 * @return transactionId not null
	 */
	@Override
	public @NotNull String withdraw(@NotNull @NotNegative BigDecimal amount,
			@NotNull @Length(min = 10, max = 10) String account,
			@NotNull @DateRange(min = "now") Date transactionDate) {
		return null;
	}

	/**
	 * Transfer the given money from accountFrom to accountTo
	 * 
	 * @param amount
	 *            cannot be null or negative
	 * @param accountFrom
	 *            cannot be null, 10 chars length
	 * @param accountTo
	 *            cannot be null, 10 chars length
	 * @param transactionDate
	 *            cannot be null or past date
	 * @return transactionId not null
	 */
	@Override
	public @NotNull String transfer(@NotNull @NotNegative BigDecimal amount,
			@NotNull @Length(min = 10, max = 10) String accountFrom,
			@NotNull @Length(min = 10, max = 10) String accountTo,
			@NotNull @DateRange(min = "now") Date transactionDate) {
		return null;
	}

}
