package mx.tec.mobile.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mx.tec.mobile.lab.manager.DonationManager;
import mx.tec.mobile.lab.tools.CreateDonation;
import mx.tec.mobile.lab.vo.Donation;

@RestController
public class createDonationController {		
	@Autowired
	CreateDonation createDonation;
		
	@Autowired
	DonationManager manager;
		
	@PostMapping("/donation/createDonation/create")
	public Donation createNewDonation(@RequestBody Donation donation) {
		Donation donationCreated = createDonation.create(donation);
		manager.addDonationToHistory(donationCreated);
		return donationCreated;
	}
	

}


