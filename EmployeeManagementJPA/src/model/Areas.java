package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Areas {
	
	@Id
	Integer idAreas;
	String nombre;
	
	public Areas(){
		
	}
	
	public Areas(Integer idAreas, String nombre) {
		super();
		this.idAreas = idAreas;
		this.nombre = nombre;
	}
	public Integer getIdAreas() {
		return idAreas;
	}
	public void setIdAreas(Integer idAreas) {
		this.idAreas = idAreas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
