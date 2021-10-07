package mx.tec.mobile.lab.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  

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
	public List<Donation> getHistory(@RequestBody Calendar date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
		String strDate = dateFormat.format(date);  
		return manager.getHistory(strDate);
	}
	

}