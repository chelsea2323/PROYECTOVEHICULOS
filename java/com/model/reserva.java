package com.model;

public class reserva {
	public reserva(String codigoreserva, String fecha_inicio, String fecha_fin, String fecha_entrega,
			int codigovehiculo, int cod_cliente) {
		super();
		this.codigoreserva = codigoreserva;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.fecha_entrega = fecha_entrega;
		this.codigovehiculo = codigovehiculo;
		this.cod_cliente = cod_cliente;
	}
	public String getCodigoreserva() {
		return codigoreserva;
	}
	public void setCodigoreserva(String codigoreserva) {
		this.codigoreserva = codigoreserva;
	}
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public String getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public String getFecha_entrega() {
		return fecha_entrega;
	}
	public void setFecha_entrega(String fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	public int getCodigovehiculo() {
		return codigovehiculo;
	}
	public void setCodigovehiculo(int codigovehiculo) {
		this.codigovehiculo = codigovehiculo;
	}
	public int getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	private String codigoreserva; 
	private String fecha_inicio; 
	private String fecha_fin ;
	private String fecha_entrega ;
	private int codigovehiculo  ;
	private  int cod_cliente ;
}
