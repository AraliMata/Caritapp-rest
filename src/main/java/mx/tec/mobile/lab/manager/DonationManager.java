package mx.tec.mobile.lab.manager;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.repository.CreateDonationRepository;
import mx.tec.mobile.lab.vo.Donation;
import mx.tec.mobile.lab.vo.Product;

@Service
public class DonationManager {
	@Resource
	CreateDonationRepository repository;

	public void addDonationToHistory(Donation donation) {
		repository.save(donation);
	}
	
	public Optional<Donation> retrieveDonation(long id) {
		return repository.findById(id); 
	}

}
