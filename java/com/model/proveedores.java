package com.model;

public class proveedores {
	 public proveedores(int cod_proveedor, String nombre, String direccion, int telefono, float comision,
			int num_ventas) {
		super();
		this.cod_proveedor = cod_proveedor;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.comision = comision;
		this.num_ventas = num_ventas;
	}
	public int getCod_proveedor() {
		return cod_proveedor;
	}
	public void setCod_proveedor(int cod_proveedor) {
		this.cod_proveedor = cod_proveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public float getComision() {
		return comision;
	}
	public void setComision(float comision) {
		this.comision = comision;
	}
	public int getNum_ventas() {
		return num_ventas;
	}
	public void setNum_ventas(int num_ventas) {
		this.num_ventas = num_ventas;
	}
	private int cod_proveedor ;
	 private String nombre ;
	 private String direccion ;
	 private int  telefono ;
	 private float comision ;
	 private int num_ventas;
}
