package mx.tec.mobile.lab.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.tec.mobile.lab.repository.DonorRepository;
import mx.tec.mobile.lab.vo.Donador;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class DonorManagerTest {
	@Resource
	private DonorRepository repository;
	
	/*@Test   //Descomentar para probar
	void addDonors() {
		DonorManager manager = new DonorManager();
		manager.repository = this.repository;
		
		//Given
		Donador donador1 = new Donador(149, "Costco");
		List<Donador> input = new ArrayList<Donador>();
		input.add(donador1);
		
		//When
		List<Donador> output = manager.addDonors(input);
		
		
		//Then
		assertEquals(input.get(0).getNombre(), output.get(0).getNombre());
		
	}*/

	@Test
	void retrieveDonorTest() {
		DonorManager manager = new DonorManager();
		manager.repository = this.repository;
		
		//Given 
		long input = 145;
		
		//When
		Donador output = manager.retrieveDonor(input);
		
		//Then
		assertEquals(input, output.getId());
	}
	
	
	@Test
	void retrieveDonors() {
		DonorManager manager = new DonorManager();
		manager.repository = this.repository;
		
		//When
		List<Donador> output = manager.retrieveDonors();
		
		//Then
		assertEquals("Alsuper", output.get(0).getNombre());
	}

}
