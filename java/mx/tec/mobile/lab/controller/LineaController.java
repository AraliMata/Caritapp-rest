package mx.tec.mobile.lab.controller;
import mx.tec.mobile.lab.vo.Linea;
import mx.tec.mobile.lab.manager.LineManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LineaController {
	@Autowired
	LineManager manager;

	public LineaController() {
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/product/updateProduct")
	public Linea updateProduct(@RequestBody Linea producto) {
		manager.updateLine(producto);
		
		return producto;
	}
}
