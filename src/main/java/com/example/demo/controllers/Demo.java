package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.Usuario;



@Controller
public class Demo {
	@GetMapping("/")
	public String index(Model modelo) {
		
		List<Usuario> Usuarios=new ArrayList<Usuario>();
		Usuarios.add(new Usuario(1,"jose felipe","escobar ballesta"));
		Usuarios.add(new Usuario(2,"maria jose","bello ballesta"));
		Usuarios.add(new Usuario(3,"karen","vasquez ballesta"));
		Usuarios.add(new Usuario(4,"luis","berrio"));
		
		modelo.addAttribute("tamano",Usuarios.size());
		modelo.addAttribute("Usuarios",Usuarios);
		
		
		return "indexView";
	}

}
