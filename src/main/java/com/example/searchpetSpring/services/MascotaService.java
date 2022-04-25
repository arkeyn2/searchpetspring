package com.example.searchpetSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.searchpetSpring.Dao.IMascotaDao;
import com.example.searchpetSpring.Entity.Mascota;

@Service
public class MascotaService implements IMascotaService{
	
	@Autowired
	private IMascotaDao mascotaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Mascota> findAll(){
		return (List<Mascota>)mascotaDao.findAll();
	}
	

}
