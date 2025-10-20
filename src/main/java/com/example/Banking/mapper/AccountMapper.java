package com.example.Banking.mapper;

import com.example.Banking.dto.AccountDto;
import com.example.Banking.entity.Account;

public class AccountMapper {
public static Account maptoAccount(AccountDto accountDto) {
	Account account=new Account(
	accountDto.getId(),
	accountDto.getAccountHolderName(),accountDto.getBalance()
	);
	return account;
}
public static AccountDto maptoAccountDto(Account account) {
	AccountDto accountdto=new AccountDto(
			account.getId(),
			account.getAccountHolderName(),
			account.getBalence()
			);
	return accountdto;
}
}
