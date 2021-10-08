package mx.tec.mobile.lab.manager;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import mx.tec.mobile.lab.vo.Donation;
import mx.tec.mobile.lab.repository.CalendarRepository;

@Service
public class CalendarManager {
	@Resource 
	CalendarRepository repositoryCalendar;

	public List<Donation> getHistory(String date) {
		return repositoryCalendar.findByDate(date);
	}

}