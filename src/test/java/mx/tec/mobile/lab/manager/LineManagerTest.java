package mx.tec.mobile.lab.manager;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;

import mx.tec.mobile.lab.tools.PrepareLine;
import mx.tec.mobile.lab.vo.Donation;
import mx.tec.mobile.lab.vo.Linea;

public class LineManagerTest {
	LineManager manager = new LineManager();
	
	@Test
	void testAddDonationToHistory() {
		// Given
		DonationManager donationManager = new DonationManager();
		PrepareLine prepareLine = new PrepareLine();
		Linea product1 =new Linea("189087", "Indefinido", 34.5f, 34.5f, 40.0f, 5.0f);
		Linea product2 =new Linea("189089", "Indefinido", 34.5f, 34.5f, 42.0f, 5.0f);
		Donation donation = donationManager.retrieveDonation(89).get();
		List<Linea> products = List.of(product1, product2);
		List<Linea> input = prepareLine.allocateDonation(donation, products);
		
		// When
		manager.addProducts(input);
		
		// Then
		assertTrue(manager.retreiveProducts().contains(product1));
	}
	

}
