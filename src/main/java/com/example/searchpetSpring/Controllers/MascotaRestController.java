package com.example.searchpetSpring.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.searchpetSpring.Entity.Mascota;
import com.example.searchpetSpring.services.IMascotaService;
import com.example.searchpetSpring.services.MascotaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class MascotaRestController {
	
	@Autowired
	private IMascotaService mascotaService;
	
	@GetMapping("/mascotas")
	public List<Mascota> index(){
		return mascotaService.findAll();
	}

}
