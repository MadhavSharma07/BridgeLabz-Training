package testcase_testing;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import testcase.InvalidException;
import testcase.TestCase;

public class TestCaseTesting {

	
	
	@Test
	public void test_Deposit_ValidAmount() throws InvalidException {
		TestCase test = new TestCase(100.0);
		test.depositAmount(11.0);
		assertEquals(111.0, test.balance);
	}
	
	@Test
	public void test_Deposit_NegativeAmount() throws InvalidException {
		TestCase test = new TestCase(100.0);
		assertThrows(InvalidException.class, ()-> test.depositAmount(-11));
	}
	
	@Test
	public void test_Withdraw_InsufficientFunds() throws InvalidException {
		TestCase test = new TestCase(100.0);
		test.withdrawAmount(10);
		assertEquals(90.0, test.balance);
	}
	
	@Test
	public void test_Withdraw_ValidAmount() throws InvalidException {
		TestCase test = new TestCase(100.0);
		assertThrows(InvalidException.class, ()-> test.withdrawAmount(110));
		
	}
	
}
