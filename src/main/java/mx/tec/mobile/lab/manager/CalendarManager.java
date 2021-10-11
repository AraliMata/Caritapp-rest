package mx.tec.mobile.lab.manager;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.repository.CalendarRepository;
import mx.tec.mobile.lab.vo.Donation;

@Service
public class CalendarManager {
	@Resource
	CalendarRepository repository;
	
	public List<Donation> getHistory() {
		return repository.findAll(); 
		
	}

}