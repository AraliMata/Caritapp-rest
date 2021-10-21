package mx.tec.mobile.lab.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import mx.tec.mobile.lab.manager.DonationManager;
import mx.tec.mobile.lab.tools.Prepare;
import mx.tec.mobile.lab.vo.Donation;
import mx.tec.mobile.lab.vo.Linea;

@RestController
public class DonationController {
	@Autowired
	DonationManager manager;
	@Autowired
	Prepare prepare;
	
	// Get a donation object by id
	@GetMapping("/donation/{id}")
	public Donation getDonation(@PathVariable(value = "id") long id) {
		// Query the database
		Optional<Donation> retrievedDonation = manager.retrieveDonation(id);
		// Check if the query found something, and return http status code and content accordingly
		if (!retrievedDonation.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT);
		}
		else {
			return retrievedDonation.get();
		}
	}
	
	//Get a list of ids of all the donations
	@GetMapping("/donation/getIdDonations")
	public List<String> getDonationsId(){
		List<Donation> donations = manager.retrieveDonations();
		return prepare.getDonationsId(donations);
	}

	
	//Get a list of all the donations
	@GetMapping("/donation/getDonations")
	public List<Donation> getDonations(){
		return manager.retrieveDonations();
	}

	// Get a list of products (Linea objects) by Donation id
	@GetMapping("/donation/{id}/products")
	public List<Linea> getProducts(@PathVariable(value = "id") long id) {
		// Query the database
		Optional<List<Linea>> retrievedProducts = manager.retrieveDonationProducts(id);
		// Check if the query found something, and return http status code and content accordingly
		if (!retrievedProducts.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT);
		}
		else {
			return retrievedProducts.get();
		}
	}
}
