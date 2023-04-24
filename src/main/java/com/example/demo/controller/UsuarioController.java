package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Usuario;
import com.example.demo.repository.IUsuarioRepository;

@Controller
public class UsuarioController {
	@Autowired
	private IUsuarioRepository repo;
	
	@GetMapping("/cargar")
	public String cargarPag(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "CrudUsuarios";
	}
	
	@PostMapping("/guardar")
	public String grabarPag(@ModelAttribute Usuario usuario ) {
		repo.save(usuario);
		return "registrado";
	}
}
