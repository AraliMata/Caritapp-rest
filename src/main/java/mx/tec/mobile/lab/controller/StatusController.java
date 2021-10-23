package mx.tec.mobile.lab.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import mx.tec.mobile.lab.manager.StatusManager;
import mx.tec.mobile.lab.vo.Status;

@RestController
public class StatusController {
	@Autowired
	StatusManager manager;
	
	
	public StatusController() {
		// TODO Auto-generated constructor stub
	}
	
	// Get a status object by id
		@GetMapping("/status/{id}")
		public Status getStatus(@PathVariable(value = "id") long id) {
			// Query the database
			Optional<Status> retrievedStatus = manager.retrieveStatus(id);
			// Check if the query found something, and return http status code and content accordingly
			if (!retrievedStatus.isPresent()) {
				throw new ResponseStatusException(HttpStatus.NO_CONTENT);
			}
			else {
				return retrievedStatus.get();
			}
		}
		
		
		@GetMapping("/status/getStatus")
		public List<Status> getStatuses(){
			return manager.retrieveStatuses();
		}

}
