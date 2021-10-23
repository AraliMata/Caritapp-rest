package mx.tec.mobile.lab.manager;

import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.repository.DonationRepository;
import mx.tec.mobile.lab.repository.LineaRepository;
import mx.tec.mobile.lab.vo.Donation;
import mx.tec.mobile.lab.vo.Linea;

@Service
public class DonationManager {
	
	@Resource
	public DonationRepository repository;
	@Resource
	public LineaRepository repositoryLinea;
	
	public DonationManager() {
		
	}

	//Save a received donation 
	public Donation addDonationToHistory(Donation donation) {
		return repository.save(donation);
	}
	
	// Find Donation by id
	public Optional<Donation> retrieveDonation(long id) {
		return repository.findById(id); 
	}
	
	//Get a product (Linea) by id
	public Linea retrieveProductById(long id) {
		return repository.findById(id).get(); 
	}

	//Get a list of all the donations (List<Donation>)
	public List<Donation> retrieveDonations(){
		return repository.findAll();
	}

}
