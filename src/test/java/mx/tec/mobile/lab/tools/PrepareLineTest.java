package mx.tec.mobile.lab.tools;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.tec.mobile.lab.manager.DonationManager;
import mx.tec.mobile.lab.repository.DonationRepository;
import mx.tec.mobile.lab.vo.Donation;
import mx.tec.mobile.lab.vo.Linea;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PrepareLineTest {
	@Resource
	private DonationRepository repository;
	
	@Test
	void allocateDonationTest() {
		PrepareLine prepareLine = new PrepareLine();
		DonationManager manager = new DonationManager();
		
		manager.repository = this.repository;
		
		//Given
		Linea product1 =new Linea("189087", "Indefinido", 34.5f, 34.5f, 40.0f, 5.0f);
		Donation donation = manager.retrieveDonation(129).get();
		List<Linea> input = new ArrayList<Linea>();
		input.add(product1);
		
		//When
		List<Linea> result = prepareLine.allocateDonation(donation, input);
		
		//Then
		long expected = 129;
		assertEquals(expected, result.get(0).getDonation().getId());
		
	}

}
