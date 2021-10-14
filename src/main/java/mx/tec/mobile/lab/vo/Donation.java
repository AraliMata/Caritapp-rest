package mx.tec.mobile.lab.vo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Donation {
	@JsonIgnore
	@Id
	@GeneratedValue	
	private long id;
	
	@JsonProperty
	private String donador;
	@JsonProperty
	private String tienda;
	@JsonProperty
	private float kilos_donados;
	@JsonProperty
	private float kilos_recibidos;
	
	@JsonProperty
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT-6")
	private Calendar fecha;

	public Donation() {
		
	}
	
	public Donation(String donador, String tienda, float kilos_donados, float kilos_recibidos, Calendar fecha){
		this.donador = donador;
		this.tienda = tienda;
		this.kilos_donados = kilos_donados;
		this.kilos_recibidos = kilos_recibidos;
		this.fecha = fecha;
	}
	
	public void setDonador(String donador){
		this.donador = donador;
	}
	
	public String getDonador(){
		return this.donador;
	}
	
	public void setTienda(String tienda){
		this.tienda = tienda;
	}
	
	public String getTienda(){
		return this.tienda;
	}
	
	public void setKilosDonados(float kilos){
		this.kilos_donados = kilos;
	}
	
	public float getKilosDonados(){
		return this.kilos_donados;
	}
	
	public void setKilosRecibidos(float kilos){
		this.kilos_recibidos = kilos;
	}
	
	public float getKilosRecibidos(){
		return this.kilos_recibidos;
	}
	
	public void setFecha(Calendar fecha){
		this.fecha = fecha;
	}
	
	public Calendar getFecha(){
		return this.fecha;
	}
	
	public long getId() {
		return this.id;
	}
}

