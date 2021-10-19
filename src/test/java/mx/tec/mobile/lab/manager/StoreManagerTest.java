/*package mx.tec.mobile.lab.manager;

import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import mx.tec.mobile.lab.repository.StoreRepository;
import mx.tec.mobile.lab.vo.Tienda;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class StoreManagerTest {
	@Resource
	StoreRepository repository;

	@Test
	void getStores() {
		StoreManager manager = new StoreManager();
		manager.repository = this.repository;
		
		//Given 
		long input = 145;
		
		//When
		List<Tienda> output = manager.getStores(input);
		
		//Then 
		assertEquals(input, output.get(0).getDonador().getId());
	}
	

}*/
