package edu.usal.negocio.dominio;

public class Pabellon {
	
	
	public Pabellon(){}

	public Pabellon(int id, String tama�o, String direccion) {
		super();
		this.id = id;
		this.tama�o = tama�o;
		this.direccion = direccion;
	}


	private int id;
	private String tama�o, direccion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	
	
	
}
