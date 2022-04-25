package com.example.searchpetSpring.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.searchpetSpring.Dao.ITipoDao;
import com.example.searchpetSpring.Entity.Tipo;

@Service
public class TipoService implements ITipoService{

	@Autowired
	private ITipoDao tipoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Tipo> findAll(){
		return (List<Tipo>)tipoDao.findAll();
	}
}
