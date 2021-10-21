package mx.tec.mobile.lab.vo;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity 
public class Linea {
	@Id
	@JsonProperty
	@GeneratedValue	
	private long id;	
	
	@JsonProperty
	private String upc;
	@JsonProperty
	@Column(name = "cantidad_recibida")
	private Float cantidadRecibida;
	@JsonProperty
	@Column(name = "cantidad_supuesta")
	private Float cantidadSupuesta;
	@JsonProperty
	private String destino;
	@JsonProperty
	@Column(name = "precio_total")
	private Float precioTotal;
	@JsonProperty
	@Column(name = "precio_unitario")
	private Float precioUnitario;
	@JsonProperty
	private String status;
	
	
	@JsonIgnore
	@ManyToOne(optional = false)
	private Donation donacion;
	

	public Linea() {
		// TODO Auto-generated constructor stub
	}
	
	public Linea(String upc, String dest,  Float cant_rec, Float cant_sup,  Float prec_tot,  Float prec_un, String status) {
		this.cantidadRecibida = cant_rec;
		this.cantidadSupuesta = cant_sup;
		this.destino = dest;
		this.precioTotal = prec_tot;
		this.precioUnitario = prec_un;
		this.upc = upc;
		this.status = status;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	

	public String getUpc() {
		return this.upc;
	}
	
	public void setUpc(String upc) {
		this.upc = upc;
	}
	
	
	public Float getCantidadSupuesta() {
		return this.cantidadSupuesta;
	}
	
	public Float getCantidadRecibida() {
		return this.cantidadRecibida;
	}
	
	public Float getPrecioUnitario() {
		return this.precioUnitario;
	}
	 
	public Float getPrecioTotal() {
		return this.precioTotal;
	}
	
	public String getDestino() {
		return this.destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setDonation(Donation donation) {
		this.donacion =  donation;
	}
	
	public Donation getDonation() {
		return donacion;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(upc, cantidadSupuesta, cantidadRecibida, precioUnitario, precioTotal, destino);
	}
	
}
