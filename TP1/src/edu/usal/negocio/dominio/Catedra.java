package edu.usal.negocio.dominio;

public class Catedra {

	public Catedra() {}
	
	public Catedra(int id, String nombre, String tama�o, String cantidadMesas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tama�o = tama�o;
		this.cantidadMesas = cantidadMesas;
	}
	
	private int id;
	private String nombre, tama�o, cantidadMesas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	public String getCantidadMesas() {
		return cantidadMesas;
	}
	public void setCantidadMesas(String cantidadMesas) {
		this.cantidadMesas = cantidadMesas;
	}

	
	
	
	
	
}
