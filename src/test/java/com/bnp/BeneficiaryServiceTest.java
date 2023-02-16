package com.bnp.service;

import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.bnp.domain.BeneficiaryDTO;
import com.bnp.repository.BeneficiaryRepository;

@RunWith(MockitoJUnitRunner.class)
public class BeneficiaryServiceTest {

	@InjectMocks
	private BeneficiaryServiceImpl beneficiaryService;
	
	@Mock
	private BeneficiaryRepository beneficiaryRepository;

	BeneficiaryDTO beneficiaryDTO;

	@Before
	public void setup() {
		beneficiaryDTO = new BeneficiaryDTO();
		beneficiaryDTO.setBeneAccountId(123456L);
		beneficiaryDTO.setBeneIfscCode("SBIN001");
		beneficiaryDTO.setBeneName("Litu");
	}

	@Test
	public void saveBeneficiaryTest() {
		BeneficiaryDTO response = beneficiaryService.saveBeneficiary(beneficiaryDTO);
		assertNull(response);
	}

	@Test
	public void updateBeneficiaryTest() {
	//	when(beneficiaryRepository.updateBeneficiary(1L)).thenReturn(beneficiaryDTO);
		beneficiaryDTO.setStatus("Active");
		BeneficiaryDTO response = beneficiaryService.updateBeneficiary(beneficiaryDTO);
		assertNull(response);
	}
	
	@Test
	public void deleteBeneficiaryTest() {
		beneficiaryDTO.setStatus("Deactive");
		BeneficiaryDTO response = beneficiaryService.updateBeneficiary(beneficiaryDTO);
		assertNull(response);
	}
}
