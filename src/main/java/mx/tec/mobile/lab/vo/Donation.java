package mx.tec.mobile.lab.vo;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Donation {
	@Id
	@GeneratedValue	
	private long id;
	private String donador;
	private String tienda;
	private float kilos;
	private Date fecha;

	public Donation() {
		
	}
	
	public Donation(String donador, String tienda, float kilos, Date fecha){
		this.donador = donador;
		this.tienda = tienda;
		this.kilos = kilos;
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
	
	public void setKilos(float kilos){
		this.kilos = kilos;
	}
	
	public float getKilos(){
		return this.kilos;
	}
	
	public void setFecha(Date fecha){
		this.fecha = fecha;
	}
	
	public Date getFecha(){
		return this.fecha;
	}
	

}

