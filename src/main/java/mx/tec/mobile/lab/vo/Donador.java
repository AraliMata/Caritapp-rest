package mx.tec.mobile.lab.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity 
public class Donador {
	@JsonIgnore
	@Id
	@GeneratedValue	
	private long id;
	
	@JsonProperty
	private String nombre;

	public Donador() {
		
	}
	
	public Donador(String nombre) {
		this.nombre = nombre;
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
