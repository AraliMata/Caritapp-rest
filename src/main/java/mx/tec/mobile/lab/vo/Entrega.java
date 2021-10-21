package mx.tec.mobile.lab.vo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Entrega {
	@JsonIgnore
	@Id
	@GeneratedValue	
	private long id;
	
	@JsonProperty
	@ManyToOne(optional = false)
	private Donador donador;
	@JsonProperty
	@ManyToOne(optional = false)
	private Tienda tienda;
	@JsonProperty
	@OneToOne()
	private Donation donacion;
	
	@JsonProperty
	@Column(name = "kilos_recibidos")
	private float kilosRecibidos;

	
	@JsonProperty
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT-6")
	private Calendar fecha;

	public Entrega() {
		
	}
	
	public Entrega(Donador donador, Tienda tienda, float kilos_recibidos, Calendar fecha){
		this.donador = donador;
		this.tienda = tienda;
		this.kilosRecibidos = kilos_recibidos;
		this.fecha = fecha;
	}
	
	public Entrega(float kilos_recibidos, Calendar fecha){
		this.kilosRecibidos = kilos_recibidos;
		this.fecha = fecha;
	}
	
	public void setDonador(Donador donador){
		this.donador = donador;
	}
	
	public Donador getDonador(){
		return this.donador;
	}
	
	public void setTienda(Tienda tienda){
		this.tienda = tienda;
	}
	
	public Tienda getTienda(){
		return this.tienda;
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