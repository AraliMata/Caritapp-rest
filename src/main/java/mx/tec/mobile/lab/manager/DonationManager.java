package mx.tec.mobile.lab.manager;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.repository.CreateDonationRepository;
import mx.tec.mobile.lab.vo.Donation;

@Service
public class DonationManager {
	@Resource
	CreateDonationRepository repository;

	public void addDonationToHistory(Donation donation) {
		repository.save(donation);
	}

}
