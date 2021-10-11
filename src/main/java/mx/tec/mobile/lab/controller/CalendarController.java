package mx.tec.mobile.lab.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


import mx.tec.mobile.lab.manager.CalendarManager;
import mx.tec.mobile.lab.tools.CreateDonation;
import mx.tec.mobile.lab.vo.Donation;

@RestController
public class CalendarController {

	public CalendarController() {
		
	}
		
	@Autowired
	CreateDonation createDonation;
		
	@Autowired
	CalendarManager manager;
		
	@GetMapping("/calendar/history")
	public List<Donation> getHistory() { 
		return manager.getHistory();
	}
	

}