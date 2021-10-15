package mx.tec.mobile.lab.tools;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.vo.Donador;
import mx.tec.mobile.lab.vo.Tienda;

@Service
public class PrepareStores {

	public PrepareStores() {
		
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

}
