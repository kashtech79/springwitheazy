package com.eazybytes.controller;

import com.eazybytes.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@Autowired
	AccountsRepository accountsRepository;

	@GetMapping("/myAccount")
	public String getAccountDetails(String input) {

		return "Here are the account details from the DB";
	}

}
