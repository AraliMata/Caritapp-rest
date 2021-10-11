package mx.tec.mobile.lab.vo;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue	
	private int id;
	
	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idDonation", referencedColumnName = "id")
    private Temperature original;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "converted_temp_id", referencedColumnName = "id")
	private Temperature converted;*/
	
	private String upc;
	private Float cantidad_supuesta;
	private Float cantidad_recibida;
	private Float precio_unitario;
	private Float precio_total;
	private String destino;
	
	

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String upc, Float cant_sup, Float cant_rec, Float prec_un, Float prec_tot, String dest) {
		this.upc = upc;
		this.cantidad_supuesta = cant_sup;
		this.cantidad_recibida = cant_rec;
		this.precio_unitario = prec_un;
		this.precio_total = prec_tot;
		this.destino = dest;
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

	@Override
	public int hashCode() {
		return Objects.hash(upc, cantidad_supuesta, cantidad_recibida, precio_unitario, precio_total, destino);
	}
}
