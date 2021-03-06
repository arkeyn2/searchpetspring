package com.example.searchpetSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.searchpetSpring.Dao.IClienteDao;
import com.example.searchpetSpring.Entity.Cliente;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly =true)
	public List<Cliente> findAll() {
		return (List<Cliente>)clienteDao.findAll();
	}

}
