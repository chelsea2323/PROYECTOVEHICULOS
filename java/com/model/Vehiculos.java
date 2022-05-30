package com.model;
import java.util.Scanner;
import java.util.regex.Pattern; 
import java.util.regex.Matcher; 
public class Vehiculos {

	private String codigovehiculo;
	   private String matricula;
	   private String  modelo;
	   private String marca;
	   private String color ;
	   private String precio;
	   private  String  foto ;
	   private String codigocliente;
	public Vehiculos(String codigovehiculo, String matricula, String modelo, String marca, String color, String precio,
			String foto, String codigocliente) {
		super();
		this.codigovehiculo = codigovehiculo;
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		this.foto = foto;
		this.codigocliente = codigocliente;
	}
	public String getCodigovehiculo() {
		return codigovehiculo;
	}
	public void setCodigovehiculo(String codigovehiculo) {
		this.codigovehiculo = codigovehiculo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getCodigocliente() {
		return codigocliente;
	}
	public void setCodigocliente(String codigocliente) {
		this.codigocliente = codigocliente;
	}
	public String toString() {
		StringBuffer sbAux = new StringBuffer();
		sbAux.append("codCli=");
		sbAux.append(this.codigovehiculo);
		
		sbAux.append("matricula=");
		sbAux.append(this.matricula);
		
		sbAux.append("modelo=");
		sbAux.append(this.modelo);
		
		sbAux.append("marca=");
		sbAux.append(this.marca);
		
		sbAux.append("color=");
		sbAux.append(this.color);
		
		sbAux.append("precio=");
		sbAux.append(this.precio);
		
		sbAux.append("foto=");
		sbAux.append(this.foto);
		
		sbAux.append("codcl=");
		sbAux.append(this.codigocliente);
		
	
		return sbAux.toString();
	}
}
