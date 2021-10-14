package mx.tec.mobile.lab.manager;
import mx.tec.mobile.lab.vo.Donation;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;


class TemperatureManagerTest {
	@Test
	void testAddDonationToHistory() {
		// Given
		DonationManager manager = new DonationManager();
		
		// When
		Donation donation = new Donation("Walmart", "Juventud", 19.2f, 19.0f, Calendar.getInstance());
		long idDonation = donation.getId();
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