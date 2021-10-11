package mx.tec.mobile.lab.vo;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Donation {
	@Id
	@GeneratedValue	
	private long id;
	
	private String donador;
	private String tienda;
	private float kilos;
	
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT-6")
	private Calendar fecha;

	public Donation() {
		
	}
	
	public Donation(String donador, String tienda, float kilos, Calendar fecha){
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
	
	/*public void setFecha(String fecha){
		this.fecha = fecha;
	}
	*/
	public Calendar getFecha(){
		return this.fecha;
	}
	
	public long getId() {
		return this.id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(donador, tienda, kilos, fecha);
	}
}

