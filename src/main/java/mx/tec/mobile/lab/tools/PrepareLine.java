package mx.tec.mobile.lab.tools;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.vo.Donation;
import mx.tec.mobile.lab.vo.Linea;

@Service
public class PrepareLine {

	public PrepareLine() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Linea> allocateDonation(Donation donacion, List<Linea> productos) {
		List<Linea> productos_actualizados = new ArrayList<Linea>();
		
		for (Linea producto : productos) 
		{ 
		    producto.setDonation(donacion);
		    System.out.println("Producto: " + producto.getCantidadRecibida()+" "+producto.getCantidadSupuesta());
		    productos_actualizados.add(producto);
		}
		
		return productos_actualizados;
	}

}




