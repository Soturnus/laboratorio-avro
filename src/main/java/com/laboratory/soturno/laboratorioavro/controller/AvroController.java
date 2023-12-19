package com.laboratory.soturno.laboratorioavro.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.laboratory.soturno.laboratorioavro.avro.User;
import com.laboratory.soturno.laboratorioavro.service.AvroService;

@Controller
@RequestMapping("/avro")
public class AvroController {

	@Autowired
	private AvroService service; 
	
	@GetMapping()
	public ResponseEntity<List<User>> getUser() throws IOException{
		
		List<User> user = service.getUser();
		
		return ResponseEntity.ok(user);
	}
	
}
