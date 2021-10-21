package mx.tec.mobile.lab.manager;

import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.repository.EntregaRepository;
import mx.tec.mobile.lab.vo.Entrega;

@Service
public class EntregaManager {
	
	@Resource
	public EntregaRepository repository;
		
	public EntregaManager() {
		
	}

	public Entrega addEntregaToHistory(Entrega entrega) {
		return repository.save(entrega);
	}
	
	// Find Donation by id
	public Optional<Entrega> retrieveEntrega(long id) {
		return repository.findById(id); 
	}
	
	public List<Entrega> retrieveEntregas(){
		return repository.findAll();
	}

	// Find all products (Linea objects) by Donation id


}