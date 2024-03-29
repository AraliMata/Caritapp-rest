package mx.tec.mobile.lab.vo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Status {
	@JsonIgnore
	@Id
	@GeneratedValue	
	private long id;

	@JsonProperty
	@OneToOne()
	private Donation donacion;

	@JsonProperty
	@Column(name = "Estado")
	private String estado;

	@PrePersist
    public void prePersist() {
        if(estado.isEmpty()) {
        	estado = "En Tienda";
        }
    }

	@JsonProperty
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT-6")
	private Calendar fecha;

	public Status() {
		
	}
	
	public Status(String estado, Calendar fecha){
		this.estado = estado;
		this.fecha = fecha;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	public String getEstado(){
		return this.estado;
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

