package mx.tec.mobile.lab.manager;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.repository.DonorRepository;
import mx.tec.mobile.lab.vo.Donador;

@Service
public class DonorManager {
	@Resource
	@Autowired
	public DonorRepository repository;
	
	public List<Donador> addDonors(List<Donador> donadores) {
		return repository.saveAll(donadores);
	}
	
	public Donador retrieveDonor(long id) {
		return repository.findById(id).get();
	}
	
	public List<Donador> retrieveDonors() {
		return repository.findAll();
	}

}
