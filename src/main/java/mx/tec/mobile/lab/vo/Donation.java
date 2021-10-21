package mx.tec.mobile.lab.vo;

import java.util.Calendar;

import javax.persistence.Column;
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
	@Column(name = "kilos_donados")
	private float kilosDonados;
	
	@JsonProperty
	@Column(name = "kilos_recibidos")
	private float kilosRecibidos;

	
	@JsonProperty
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT-6")
	private Calendar fecha;

	public Donation() {
		
	}
	
	public Donation(String donador, String tienda, float kilos_donados, float kilos_recibidos, Calendar fecha){
		this.donador = donador;
		this.tienda = tienda;
		this.kilosDonados = kilos_donados;
		this.kilosRecibidos = kilos_recibidos;
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
		this.kilosDonados = kilos;
	}
	
	public float getKilosDonados(){
		return this.kilosDonados;
	}
	
	public void setKilosRecibidos(float kilos){
		this.kilosRecibidos = kilos;
	}
	
	public float getKilosRecibidos(){
		return this.kilosRecibidos;
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

