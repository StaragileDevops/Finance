package com.project.Finance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestingAccountService {
	
	@Autowired
	AccountService accountService;
	
	@Test
	public void testAccountRegistraiton() {
		Account account = new Account(1010101010,"Ruchin","Savings Account",20000.0);
		assertEquals(account.getAccountNumber(),accountService.registerDummyAccount().getAccountNumber());
		assertEquals(account.getAccountName(),accountService.registerDummyAccount().getAccountName());
	}
}
