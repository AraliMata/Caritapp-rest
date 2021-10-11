package mx.tec.mobile.lab.manager;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import mx.tec.mobile.lab.repository.ImportProductRepository;
import mx.tec.mobile.lab.vo.Product;

@Service
public class ProductManager {
	@Resource
	ImportProductRepository repository;
	
	public void addProducts(List<Product> products, long idDonation) {
		repository.saveAll(products);
	}

}
