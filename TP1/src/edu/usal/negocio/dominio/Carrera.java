package edu.usal.negocio.dominio;

public class Carrera {

	public Carrera() {}
	
	
	public Carrera(int id, int cantidadMaterias, int catidadA�os) {
		super();
		this.id = id;
		this.cantidadMaterias = cantidadMaterias;
		this.catidadA�os = catidadA�os;
	}


	private int id, cantidadMaterias, catidadA�os;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadMaterias() {
		return cantidadMaterias;
	}

	public void setCantidadMaterias(int cantidadMaterias) {
		this.cantidadMaterias = cantidadMaterias;
	}

	public int getCatidadA�os() {
		return catidadA�os;
	}

	public void setCatidadA�os(int catidadA�os) {
		this.catidadA�os = catidadA�os;
	}
	
	
	
	
	
	
}
