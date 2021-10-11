package mx.tec.mobile.lab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mx.tec.mobile.lab.manager.DonationManager;
import mx.tec.mobile.lab.manager.ProductManager;
import mx.tec.mobile.lab.tools.CreateDonation;
import mx.tec.mobile.lab.vo.Donation;
import mx.tec.mobile.lab.vo.Product;

@RestController
public class createDonationController {

	public createDonationController() {
		
	}
		
	@Autowired
	CreateDonation createDonation;
		
	@Autowired
	DonationManager manager;
	ProductManager productManager;
		
	@PostMapping("/donation/createDonation/create")
	public long createNewDonation(@RequestBody Donation donation) {
		Donation donationCreated = createDonation.create(donation);
		manager.addDonationToHistory(donationCreated);
		return donationCreated.getId();
	}
	
	@PostMapping("/donation/createDonation/importProducts/{id}")
	public String importProducts(@RequestBody List<Product> products, @PathVariable(value = "id") long id) {
		productManager.addProducts(products, id);
		return "200";
	}
	
	

}


