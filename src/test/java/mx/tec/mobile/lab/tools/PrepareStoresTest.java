package mx.tec.mobile.lab.tools;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.tec.mobile.lab.manager.DonorManager;
import mx.tec.mobile.lab.repository.DonorRepository;
import mx.tec.mobile.lab.vo.Donador;
import mx.tec.mobile.lab.vo.Tienda;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PrepareStoresTest {
	@Resource
	private DonorRepository repository;

	@Test
	void allocateDonorTest() {
		DonorManager manager = new DonorManager();
		PrepareStores prepareStores = new PrepareStores();
		
		manager.repository = this.repository;
		
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
