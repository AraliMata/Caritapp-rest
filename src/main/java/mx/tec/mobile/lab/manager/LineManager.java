package mx.tec.mobile.lab.manager;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import mx.tec.mobile.lab.repository.LineaRepository;
import mx.tec.mobile.lab.vo.Linea;

@Service
public class LineManager {
	// Set up repository
	@Resource
	public LineaRepository repository;
	
	public LineManager() {
		
	}
	
	//Save a received product list (List<Linea>) 
	public List<Linea> addProducts(List<Linea> products) {
		return repository.saveAll(products);
	}
	
	//Get a list of all the products (List<Linea>)
	public List<Linea> retrieveProducts(){
		return repository.findAll(); 
	}
	
	//Get a product (Linea) by id
	public Linea retrieveProductById(long id) {
		return repository.findById(id).get(); 
	}
	
	//Update a received product
	public void updateLine(Linea producto) {
		repository.updateLinea(producto.getId(), producto.getDestino(), producto.getStatus());
	}
	
	// Find all products (Linea objects) by Donation id
	public Optional<List<Linea>> retrieveDonationProducts(long id) {
		return repository.getProductsByDonationId(id);
	}

}

