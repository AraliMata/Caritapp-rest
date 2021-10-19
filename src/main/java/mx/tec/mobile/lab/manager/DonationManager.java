package mx.tec.mobile.lab.manager;

import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.repository.DonationRepository;
import mx.tec.mobile.lab.vo.Donation;

@Service
public class DonationManager {
	
	@Resource
	public DonationRepository repository;
	
	public DonationManager() {
		
	}

	public Donation addDonationToHistory(Donation donation) {
		return repository.save(donation);
	}
	
	public Optional<Donation> retrieveDonation(long id) {
		return repository.findById(id); 
	}
	
	public List<Donation> retrieveDonations(){
		return repository.findAll();
	}

}
