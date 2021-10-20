package mx.tec.mobile.lab.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import mx.tec.mobile.lab.manager.EntregaManager;
import mx.tec.mobile.lab.tools.Prepare;
import mx.tec.mobile.lab.vo.Entrega;

@RestController
public class CreateEntregaController {
	@Autowired
	EntregaManager manager;
	@Autowired
	Prepare prepare;
	
	// Get a donation object by id
	@GetMapping("/entrega/{id}")
	public Entrega getEntrega(@PathVariable(value = "id") long id) {
		// Query the database
		Optional<Entrega> retrievedEntrega = manager.retrieveEntrega(id);
		// Check if the query found something, and return http status code and content accordingly
		if (!retrievedEntrega.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT);
		}
		else {
			return retrievedEntrega.get();
		}
	}
	
	//Lista de los ids de las entregas
	/*@GetMapping("/entrega/getIdEntregas")
	public List<String> getEntregasId(){
		List<Entrega> entregas = manager.retrieveEntregas();
		return prepare.getEntregasId(entregas);
	}*/

	
	//Lista de todas las entregas realizadas
	@GetMapping("/entrega/getEntregas")
	public List<Entrega> getEntregas(){
		return manager.retrieveEntregas();
	}


}