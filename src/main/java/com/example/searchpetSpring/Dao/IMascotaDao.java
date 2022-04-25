package com.example.searchpetSpring.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.searchpetSpring.Entity.Mascota;

public interface IMascotaDao extends CrudRepository<Mascota, Long> {

}
