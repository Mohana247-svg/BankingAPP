package com.example.Banking.service;

import java.util.List;

import com.example.Banking.dto.AccountDto;

public interface AccountService {

	AccountDto createAccount(AccountDto accountDto);

	AccountDto getAccountById(Long id);

	AccountDto deposit(Long id, double amount);

	AccountDto withdraw(Long id, double amount);

	void deleteAccountById(Long id);

	List<AccountDto> getAllAccounts();
}
