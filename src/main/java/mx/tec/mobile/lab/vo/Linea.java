package mx.tec.mobile.lab.vo;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


//Crear función para asignar donación a cada una de las lineas que reciba, para luego 
// pasarlas a la bdd O(n)
//El id de donación lo voy a recibir por el url, voy a hacer un get de esa donación por id y luego la voy a pasar a cada producto con un set


@Entity 
public class Linea {
	@JsonIgnore
	@Id
	@GeneratedValue	
	private long id;	
	
	private String upc;
	private Float cantidad_recibida;
	private Float cantidad_supuesta;
	private String destino;
	private Float precio_total;
	private Float precio_unitario;
	
	
	@JsonIgnore
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	private Donation donacion;
	

	public Linea() {
		// TODO Auto-generated constructor stub
	}
	
	public Linea(String upc, String dest,  Float cant_rec, Float cant_sup,  Float prec_tot,  Float prec_un) {
		this.cantidad_recibida = cant_rec;
		this.cantidad_supuesta = cant_sup;
		this.destino = dest;
		this.precio_total = prec_tot;
		this.precio_unitario = prec_un;
		this.upc = upc;		
	}
	
	public String getUpc() {
		return this.upc;
	}
	
	public Float getCantidadSupuesta() {
		return this.cantidad_supuesta;
	}
	
	public Float getCantidadRecibida() {
		return this.cantidad_recibida;
	}
	
	public Float getPrecioUnitario() {
		return this.precio_unitario;
	}
	 
	public Float getPrecioTotal() {
		return this.precio_total;
	}
	
	public String getDestino() {
		return this.destino;
	}
	
	public void setDonation(Donation donation) {
		this.donacion =  donation;
	}
	
	public Donation getDonation() {
		return donacion;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(upc, cantidad_supuesta, cantidad_recibida, precio_unitario, precio_total, destino);
	}
	
}
