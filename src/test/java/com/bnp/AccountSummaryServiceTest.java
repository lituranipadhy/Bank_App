package com.bnp.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.bnp.constant.CommonConstant;
import com.bnp.domain.AccountBalance;
import com.bnp.domain.TransactionsDTO;
import com.bnp.repository.AccountSummaryRepository;
import com.bnp.repository.AmountBalanceRepository;

@RunWith(MockitoJUnitRunner.class)
public class AccountSummaryServiceTest {

	@InjectMocks
	private AccountSummaryServiceImpl accountSummaryService;

	@Mock
	private AmountBalanceRepository amountBalanceRepository;

	@Mock
	private AccountSummaryRepository accountSummaryRepository;

	TransactionsDTO transactionsDTO;

	@Before
	public void setup() {
		transactionsDTO = new TransactionsDTO();
		transactionsDTO.setAccountId(1L);
		transactionsDTO.setAmount(1000L);
		transactionsDTO.setDate("20-02-22");
		transactionsDTO.setType(CommonConstant.CREDIT);
		transactionsDTO.setRemark("salary credited");
	}

	@Test
	public void withdrawalOrDepositeRequestTest() {
		String status = accountSummaryService.withdrawalOrDepositeRequest(transactionsDTO);
		assertNotNull(status);
	}

}
