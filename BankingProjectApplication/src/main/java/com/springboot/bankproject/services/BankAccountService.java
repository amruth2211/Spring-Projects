package com.springboot.bankproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bankproject.model.BankAccount;
import com.springboot.bankproject.repository.BankAccountRepository;

@Service
public class BankAccountService {
	
  @Autowired
  BankAccountRepository bankAccountRepo;
  
	public Integer create(BankAccount bankAccount) {
	try {
		return bankAccountRepo.create(bankAccount);
	}
	catch(Exception e) {
		System.out.println(e);
		return null;
	}
	}

	 public Integer update(Integer accountNo,Integer branchCode) {
		try {
			return bankAccountRepo.update(accountNo,branchCode);
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
    }

	public BankAccount viewDetails(Integer accountNo)
    {
		try {
			return bankAccountRepo.viewDetails(accountNo);
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public Integer delete(Integer customerId) {
	try {
		return bankAccountRepo.delete(customerId);
	}
	catch(Exception e) {
		System.out.println(e);
		return null;
	}
	}
  

  
}
