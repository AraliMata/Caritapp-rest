package mx.tec.mobile.lab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mx.tec.mobile.lab.manager.DonorManager;
import mx.tec.mobile.lab.manager.StoreManager;
import mx.tec.mobile.lab.tools.Prepare;
import mx.tec.mobile.lab.vo.Donador;
import mx.tec.mobile.lab.vo.Tienda;

@RestController
public class DonorController {
	@Autowired
	DonorManager donorManager;
	
	@Autowired
	StoreManager storeManager;
	
	@Autowired
	Prepare prepareStores;
	
	public DonorController() {
		
	}
	
	@PostMapping("/donor/addDonors/")
	public List<Donador> createNewDonation(@RequestBody List<Donador> donors) {
		donorManager.addDonors(donors);
		return donors;
	}
	
	@PostMapping("/donor/addStores/{id}")
	public List<Tienda> importProducts(@RequestBody List<Tienda> tiendas, @PathVariable(value = "id") long id) {
		Donador donor_created = donorManager.retrieveDonor(id);
		List<Tienda> prepared_stores = prepareStores.allocateDonor(donor_created, tiendas);
		storeManager.addStores(prepared_stores);
		
		return prepared_stores;
		//return prepared_products;
	}
	
	@GetMapping("/donor/getDonors")
	public List<Donador> getDonors() { 
		return donorManager.retrieveDonors();
	}
	
	@GetMapping("/donor/getStores/{id}")
	public List<String> getDonation(@PathVariable(value = "id") long id) {
		List<Tienda> stores = storeManager.getStores(id);
		return prepareStores.getStoresName(stores);
	}
	
	

}
