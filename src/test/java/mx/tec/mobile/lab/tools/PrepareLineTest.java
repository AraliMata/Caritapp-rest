package mx.tec.mobile.lab.tools;
import mx.tec.mobile.lab.manager.DonationManager;
import mx.tec.mobile.lab.vo.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class PrepareLineTest {
	PrepareLine prepareLine = new PrepareLine();
	
	@Test
	void allocateDonationTest() {
		//Given
		DonationManager manager = new DonationManager();
		
		Linea product1 =new Linea("189087", "Indefinido", 34.5f, 34.5f, 40.0f, 5.0f);
		Linea product2 =new Linea("189089", "Indefinido", 34.5f, 34.5f, 42.0f, 5.0f);
		Donation donation = manager.retrieveDonation(89).get();
		List<Linea> input = List.of(product1, product2);
		
		//When
		List<Linea> result = prepareLine.allocateDonation(donation, input);
		
		//Then
		Donation expected = donation;
		assertEquals(expected, result.get(0).getDonation());
		
	}

}

