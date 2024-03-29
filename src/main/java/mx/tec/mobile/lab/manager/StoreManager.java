package mx.tec.mobile.lab.manager;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.repository.StoreRepository;
import mx.tec.mobile.lab.vo.Tienda;

@Service
public class StoreManager {
	@Resource
	StoreRepository repository;
	
	//Saves a received store list (List<Tienda>) 
	public void addStores(List<Tienda> stores) {
		repository.saveAll(stores);
	}
	
	//Get a list of all the stores by given donor id 
	public List<Tienda> getStores(long id) {
		return repository.getTiendasByDonador(id).get();	
	}
	
}
