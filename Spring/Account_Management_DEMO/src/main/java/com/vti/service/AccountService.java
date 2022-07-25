package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.form.AccountFormForCreating;
import com.vti.form.AccountFormForUpdating;
import com.vti.repository.IAccountRepository;
import com.vti.repository.IDepartmentRepository;
import com.vti.repository.IPossitionRepository;

@Service
public class AccountService implements IAccountService {
	
	@Autowired
	private IAccountRepository accountRepository;
	@Autowired
	private IDepartmentRepository departmentRepository;
	@Autowired
	private IPossitionRepository possitionRepository;

	@Override
	public List<Account> getAllAccount() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
	}

	@Override
	public Account getAccountById(short id) {
		// TODO Auto-generated method stub
		return accountRepository.getById(id);
	}

	@Override
	public void deleteAccount(short id) {
		accountRepository.deleteById(id);

	}

	@Override
	public void createAccount(AccountFormForCreating form) {
		Account account = new Account();
		Department department = departmentRepository.getById(form.getDepartmentId());
		Position position = possitionRepository.getById(form.getPositionId());
		account.setEmail(form.getEmail());
		account.setUsername(form.getUsername());
		account.setFullname(form.getFullname());
		account.setDepartment(department);
		account.setPosition(position);
		accountRepository.save(account);
	}

	@Override
	public void updateAccount(short id, AccountFormForUpdating form) {
		Account account = accountRepository.getById(id);
		Department department = departmentRepository.getById(form.getDepartmentId());
		Position position = possitionRepository.getById(form.getPositionId());
		account.setFullname(form.getFullname());
		account.setDepartment(department);
		account.setPosition(position);
		accountRepository.save(account);
	}

}
