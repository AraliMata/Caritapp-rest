package mx.tec.mobile.lab.manager;
import mx.tec.mobile.lab.repository.DonationRepository;
import mx.tec.mobile.lab.vo.Donation;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class DonationManagerTest {
	@Resource
	private DonationRepository repository;
	
	@Test
	void testAddDonationToHistory() {
		DonationManager manager = new DonationManager();
		manager.repository = this.repository;
		
		// Given
		Donation donation = new Donation("Walmart", "Juventud", 19.2f, 19.0f, Calendar.getInstance());
		
		// When
		Donation savedDonation = manager.addDonationToHistory(donation);
		
		// Then
		assertEquals("Walmart", savedDonation.getDonador());
	}
	
	/*@Test
	void testRetrieveDonation() {
		//Given 
		DonationManager manager = new DonationManager();
		long idDonation = 89;
		
		//When
		Donation donation_retreived = manager.retrieveDonation(idDonation).get();
		
		
		//Then
		assertTrue(donation_retreived)
		
	}*/

}
