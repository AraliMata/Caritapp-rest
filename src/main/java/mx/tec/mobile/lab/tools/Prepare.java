package mx.tec.mobile.lab.tools;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.vo.Donador;
import mx.tec.mobile.lab.vo.Donation;
import mx.tec.mobile.lab.vo.Linea;
import mx.tec.mobile.lab.vo.Tienda;

@Service
public class Prepare {

	public Prepare() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Linea> allocateDonation(Donation donacion, List<Linea> productos) {
		List<Linea> productos_actualizados = new ArrayList<Linea>();
		
		for (Linea producto : productos) 
		{ 
		    producto.setDonation(donacion);
		    System.out.print(donacion.getId());
		    productos_actualizados.add(producto);
		}
		
		return productos_actualizados;
	}
	
	public List<Tienda> allocateDonor(Donador donador, List<Tienda> tiendas) {
		List<Tienda> tiendas_actualizadas = new ArrayList<Tienda>();
		
		for (Tienda tienda : tiendas) 
		{ 
		    tienda.setDonador(donador);
		    tiendas_actualizadas.add(tienda);
		}
		
		return tiendas_actualizadas;
	}
	
	public List<String> getStoresName(List<Tienda> tiendas){
		List<String> nombres = new ArrayList<String>();
		
		for(Tienda tienda: tiendas) {
			nombres.add(tienda.getNombre());
		}
		
		return nombres;
		
	}
	
	public List<String> getDonationsId(List<Donation> donations){
		List<String> ids = new ArrayList<String>();
		
		for(Donation donation: donations) {
			ids.add(String.valueOf(donation.getId()));
		}
		
		return ids;
	}
	

}
