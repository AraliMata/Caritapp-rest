package mx.tec.mobile.lab.manager;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.tec.mobile.lab.repository.ImportLineaRepository;
import mx.tec.mobile.lab.vo.Linea;

@Service
public class LineManager {
	@Resource
	@Autowired
	ImportLineaRepository repository;
	
	public void addProducts(List<Linea> products) {
		repository.saveAll(products);
	}
	
	public List<Linea> retreiveProducts(){
		return repository.findAll(); 
	}

}
