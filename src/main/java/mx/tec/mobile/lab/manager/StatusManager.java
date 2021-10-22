package mx.tec.mobile.lab.manager;

import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.repository.StatusRepository;
import mx.tec.mobile.lab.vo.Status;

@Service
public class StatusManager {
	
	@Resource 
	public StatusRepository repository;
	public StatusManager() {
		// TODO Auto-generated constructor stub
	}
	
	public Status addStatusToHistory(Status status) {
		return repository.save(status);
	}
	
	// Find Donation by id
		public Optional<Status> retrieveStatus(long id) {
			return repository.findById(id); 
		}
		
		public List<Status> retrieveStatus(){
			return repository.findAll();
		}
	

}
