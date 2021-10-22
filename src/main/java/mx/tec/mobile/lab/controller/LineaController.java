package mx.tec.mobile.lab.controller;
import mx.tec.mobile.lab.vo.Linea;
import mx.tec.mobile.lab.manager.LineManager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class LineaController {
	@Autowired
	LineManager manager;

	public LineaController() {
		// TODO Auto-generated constructor stub
	}

	//Update a received product (Linea)
	@PostMapping("/product/updateProduct")
	public Linea updateProduct(@RequestBody Linea producto) {
		manager.updateLine(producto);
		
		return producto;
	}
	
	// Get a list of products (Linea objects) by Donation id
	@GetMapping("/donation/{id}/products")
	public List<Linea> getProducts(@PathVariable(value = "id") long id) {
		// Query the database
		Optional<List<Linea>> retrievedProducts = manager.retrieveDonationProducts(id);
		// Check if the query found something, and return http status code and content accordingly
		if (!retrievedProducts.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT);
		}
		else {
			return retrievedProducts.get();
		}
	}
}



