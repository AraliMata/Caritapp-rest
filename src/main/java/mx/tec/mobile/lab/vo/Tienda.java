package mx.tec.mobile.lab.vo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity 
public class Tienda {
	@JsonIgnore
	@Id
	@GeneratedValue	
	private long id;	
	
	@JsonProperty
	private String nombre;
	
	@JsonProperty
	private String ubicacion;
	
	@JsonIgnore
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	private Donador donador;
	
	
	public Tienda() {
		
	}
	
	public Tienda(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	public void setDonador(Donador donador) {
		this.donador = donador;
	}
	
	public Donador getDonador() {
		return this.donador;
	}
	

}
