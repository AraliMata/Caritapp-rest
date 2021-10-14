package mx.tec.mobile.lab.manager;
import mx.tec.mobile.lab.vo.Donation;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class DonationManagerTest {
	@Autowired
	DonationManager manager = new DonationManager();
	
	@Test
	void testAddDonationToHistory() {
		// Given
		Donation donation = new Donation("Walmart", "Juventud", 19.2f, 19.0f, Calendar.getInstance());
		long idDonation = donation.getId();
		
		// When
		manager.addDonationToHistory(donation);
		
		// Then
		assertTrue(manager.retrieveDonation(idDonation).get().equals(donation));
	}
	
	/* @Test
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
