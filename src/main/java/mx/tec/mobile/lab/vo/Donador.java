package mx.tec.mobile.lab.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity 
public class Donador {
	@JsonProperty
	@Id
	@GeneratedValue	
	private long id;
	
	@JsonProperty
	private String nombre;

	public Donador() {
		
	}
	
	public Donador(long id, String nombre) {
		this.nombre = nombre;
		this.id = id;
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
