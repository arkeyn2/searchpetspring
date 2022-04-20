package com.example.searchpetSpring.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.searchpetSpring.Entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
