package com.example.Banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
