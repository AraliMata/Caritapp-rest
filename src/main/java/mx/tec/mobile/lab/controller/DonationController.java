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
import mx.tec.mobile.lab.vo.Donation;

@RestController
public class DonationController {
	@Autowired
	DonationManager manager;
	
	@GetMapping("/donation/{id}")
	public Donation getDonation(@PathVariable(value = "id") long id) {
		//return new Donation("Walmart", "Juventud", 15.2f, Calendar.getInstance());
		//return manager.retrieveDonation(id).get();
		//throw new ResponseStatusException(HttpStatus.NO_CONTENT);
		Optional<Donation> retrievedDonation = manager.retrieveDonation(id);
		if (!retrievedDonation.isPresent()) {
			//return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			throw new ResponseStatusException(HttpStatus.NO_CONTENT);
		}
		else {
			//return new ResponseEntity<>(retrievedDonation.get(), HttpStatus.OK);
			return retrievedDonation.get();
		}
	}
	
	@GetMapping("/donation/getDonations")
	public List<Donation> getDonation(){
		return manager.retrieveDonations();
	}
}
