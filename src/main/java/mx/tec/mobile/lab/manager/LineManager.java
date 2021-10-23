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
	
	public List<Linea> addProducts(List<Linea> products) {
		return repository.saveAll(products);
	}
	
	public List<Linea> retrieveProducts(){
		return repository.findAll(); 
	}
	
	public void updateLine(Linea producto) {
		repository.updateLinea(producto.getId(), producto.getDestino(), producto.getStatus());
	}
	
	// Find all products (Linea objects) by Donation id
	public Optional<List<Linea>> retrieveDonationProducts(long id) {
		return repository.getProductsByDonationId(id);
	}

}

