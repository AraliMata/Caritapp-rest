package mx.tec.mobile.lab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mx.tec.mobile.lab.manager.DonationManager;
import mx.tec.mobile.lab.manager.LineManager;
import mx.tec.mobile.lab.vo.Donation;
import mx.tec.mobile.lab.vo.Linea;
import mx.tec.mobile.lab.tools.PrepareLine;

@RestController
public class CreateDonationController {

	public CreateDonationController() {
		
	}
		
	@Autowired
	DonationManager manager;
	@Autowired
	LineManager productManager;
	@Autowired
	PrepareLine prepareLine;
	
		
	@PostMapping("/donation/createDonation/create")
	public long createNewDonation(@RequestBody Donation donation) {
		Donation prepared_donation = new Donation(donation.getDonador(), donation.getTienda(), donation.getKilosDonados(), donation.getKilosRecibidos(), donation.getFecha());
		Donation added_donation = manager.addDonationToHistory(prepared_donation);
		
		return added_donation.getId();
	}
	
	@PostMapping("/donation/createDonation/importProducts/{id}")
	public List<Linea> importProducts(@RequestBody List<Linea> products, @PathVariable(value = "id") long id) {
		Donation donation_created = manager.retrieveDonation(id).get();
		List<Linea> prepared_products = prepareLine.allocateDonation(donation_created, products);
		List<Linea> added_products = productManager.addProducts(prepared_products);
		
		return added_products;
	}
	
	

}


