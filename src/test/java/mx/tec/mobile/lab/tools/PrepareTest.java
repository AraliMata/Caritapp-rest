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
import mx.tec.mobile.lab.manager.DonorManager;
import mx.tec.mobile.lab.repository.DonationRepository;
import mx.tec.mobile.lab.repository.DonorRepository;
import mx.tec.mobile.lab.vo.Donador;
import mx.tec.mobile.lab.vo.Donation;
import mx.tec.mobile.lab.vo.Linea;
import mx.tec.mobile.lab.vo.Tienda;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PrepareTest {
	@Resource
	private DonationRepository donationRepository;
	@Resource
	private DonorRepository donorRepository;
	
	@Test
	void allocateDonationTest() {
		Prepare prepareLine = new Prepare();
		DonationManager manager = new DonationManager();
		
		manager.repository = this.donationRepository;
		
		//Given
		Linea product1 =new Linea("189087", "Indefinido", 34.5f, 34.5f, 40.0f, 5.0f, "no entregado");
		Donation donation = manager.retrieveDonation(129).get();
		List<Linea> input = new ArrayList<Linea>();
		input.add(product1);
		
		//When
		List<Linea> result = prepareLine.allocateDonation(donation, input);
		
		//Then
		long expected = 129;
		assertEquals(expected, result.get(0).getDonation().getId());
		
	}
	
	

	@Test
	void allocateDonorTest() {
		DonorManager manager = new DonorManager();
		Prepare prepareStores = new Prepare();
		
		manager.repository = this.donorRepository;
		
		//Given 
		Donador donador = manager.retrieveDonor(145);
		Tienda store1 = new Tienda("Juventud", "Indefinida");
		List<Tienda> input = new ArrayList<Tienda>();
		input.add(store1);
		
		//When
	
		List<Tienda> output = prepareStores.allocateDonor(donador, input);
	
		assertEquals(output.get(0).getDonador(), donador);
	}

}
