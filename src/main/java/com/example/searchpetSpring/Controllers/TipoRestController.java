package com.example.searchpetSpring.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.searchpetSpring.Entity.Tipo;
import com.example.searchpetSpring.services.ITipoService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class TipoRestController {

	@Autowired
	private ITipoService tipoService;
	
	@GetMapping("/tipos")
	public List<Tipo> index(){
		return tipoService.findAll();
	}
}
