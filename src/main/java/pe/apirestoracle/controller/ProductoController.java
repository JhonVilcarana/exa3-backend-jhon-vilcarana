package pe.apirestoracle.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.apirestoracle.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
@Autowired
private ProductoService productoService;
@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("/all")
public Map<String, Object> readAll(){
	return productoService.readAll();
}
}
