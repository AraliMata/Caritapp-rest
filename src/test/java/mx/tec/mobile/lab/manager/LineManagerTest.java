/*package mx.tec.mobile.lab.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.tec.mobile.lab.repository.DonationRepository;
import mx.tec.mobile.lab.repository.LineaRepository;
import mx.tec.mobile.lab.tools.PrepareLine;
import mx.tec.mobile.lab.vo.Donation;
import mx.tec.mobile.lab.vo.Linea;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class LineManagerTest {
	@Resource  
	@Autowired
	private LineaRepository lineRepository;
	@Resource
	@Autowired
	private DonationRepository donationRepository;
	
	@Test
	void testAddProducts() {
		DonationManager donationManager = new DonationManager();
		donationManager.repository = this.donationRepository;
		
		LineManager manager = new LineManager();
		manager.repository = this.lineRepository;
		
		PrepareLine prepareLine = new PrepareLine();
		
		// Given
		Linea product1 =new Linea("189087", "Indefinido", 34.5f, 34.5f, 40.0f, 5.0f);
		Donation donation = donationManager.retrieveDonation(129).get();
		List<Linea> products = new ArrayList<Linea>();
		products.add(product1);
		List<Linea> input = prepareLine.allocateDonation(donation, products);
		
		// When
		List<Linea> output = manager.addProducts(input);
		
		// Then
		assertEquals(input, output);
	}
	

}*/