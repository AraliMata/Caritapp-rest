package mx.tec.mobile.lab.manager;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.repository.StoreRepository;
import mx.tec.mobile.lab.vo.Tienda;

@Service
public class StoreManager {
	@Resource
	@Autowired
	StoreRepository repository;
	
	public void addStores(List<Tienda> stores) {
		repository.saveAll(stores);
	}
	
	public List<Tienda> getStores(long id) {
		return repository.getTiendasByDonador(id).get();	
	}
	
}
