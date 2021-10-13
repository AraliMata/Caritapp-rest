package mx.tec.mobile.lab.manager;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import mx.tec.mobile.lab.repository.ImportLineaRepository;
import mx.tec.mobile.lab.vo.Linea;

@Service
public class LineManager {
	@Resource
	ImportLineaRepository repository;
	
	public void addProducts(List<Linea> products) {
		repository.saveAll(products);
	}

}
