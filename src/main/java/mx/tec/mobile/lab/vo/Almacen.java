package mx.tec.mobile.lab.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Almacen {
	@JsonProperty
	@Id
	@GeneratedValue	
	private long id;
	
	@JsonProperty
	private String nombre;
	
	@JsonProperty
	private String ubicacion;

	public Almacen() {
		
	}

	public Almacen(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public String getUbicacion() {
		return this.ubicacion;
	}

}
