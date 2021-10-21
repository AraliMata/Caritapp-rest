package mx.tec.mobile.lab.manager;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import mx.tec.mobile.lab.repository.LineaRepository;
import mx.tec.mobile.lab.vo.Linea;

@Service
public class LineManager {
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

}
