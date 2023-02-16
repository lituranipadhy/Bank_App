package com.bnp.service;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.bnp.domain.Accounts;
import com.bnp.domain.AccountsDTO;
import com.bnp.repository.UserAccountRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserAccountServiceTest {

	@InjectMocks
	private UserAccountServiceImpl accountService;

	@Mock(lenient=true)
	private UserAccountRepository accountRepository;

	AccountsDTO accountsDTO;

	@Before
	public void setup() {
		accountsDTO = new AccountsDTO();

		accountsDTO.setAccountName("Litu");
		accountsDTO.setEmail("litu@gmail.com");
		accountsDTO.setPhone(1234567890);
	}

	@Test
	public void updatePersonalDetailsTest() {
		AccountsDTO response = accountService.updatePersonalDetails(accountsDTO);
		assertNull(response);

	}
}
