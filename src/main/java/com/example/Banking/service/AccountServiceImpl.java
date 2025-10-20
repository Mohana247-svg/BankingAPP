package com.example.Banking.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Banking.dto.AccountDto;
import com.example.Banking.entity.Account;
import com.example.Banking.mapper.AccountMapper;
import com.example.Banking.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.maptoAccount(accountDto);
		Account savedAccount = accountRepository.save(account);

		return AccountMapper.maptoAccountDto(savedAccount);
	}

	@Override
	public AccountDto getAccountById(Long id) {
		Account account = accountRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Account does not exists"));
		return AccountMapper.maptoAccountDto(account);
	}

	@Override
	public AccountDto deposit(Long id, double amount) {
		Account account = accountRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Account doesn't exists"));
		double total = account.getBalence() + amount;
		account.setBalence(total);
		Account savedAccount = accountRepository.save(account);

		return AccountMapper.maptoAccountDto(savedAccount);

	}

	@Override
	public AccountDto withdraw(Long id, double amount) {
		Account account = accountRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Account does not exists"));
		if (account.getBalence() < amount) {
			throw new RuntimeException("Insufficient amount");

		}
		double total = account.getBalence() - amount;
		account.setBalence(total);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.maptoAccountDto(savedAccount);
	}

	@Override
	public void deleteAccountById(Long id) {
		Account account = accountRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Account does not exists"));
		accountRepository.deleteById(id);
	}

	@Override
	public List<AccountDto> getAllAccounts() {
		List<Account> accounts = accountRepository.findAll();
		return accounts.stream().map((account) -> AccountMapper.maptoAccountDto(account)).collect(Collectors.toList());

	}

}
