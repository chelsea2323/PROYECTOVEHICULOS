package com.model;

public class clientes {
	 private String codigocliente;	
	   private String nombrecliente ;	
	   private String apellidocliente  ;
	   private String telefono; 
	   private String direccion;	
	   private String localidad ;
	   private String provincia;
	   private String codigopostal ;
	   private String email;
	public clientes(String codigocliente, String nombrecliente, String apellidocliente, String telefono,
			String direccion, String localidad, String provincia, String codigopostal, String email) {
		this.codigocliente = codigocliente;
		this.nombrecliente = nombrecliente;
		this.apellidocliente = apellidocliente;
		this.telefono = telefono;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.codigopostal = codigopostal;
		this.email = email;
	}
	public String getCodigocliente() {
		return codigocliente;
	}
	public void setCodigocliente(String codigocliente) {
		this.codigocliente = codigocliente;
	}
	public String getNombrecliente() {
		return nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
	public String getApellidocliente() {
		return apellidocliente;
	}
	public void setApellidocliente(String apellidocliente) {
		this.apellidocliente = apellidocliente;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCodigopostal() {
		return codigopostal;
	}
	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		StringBuffer sbAux = new StringBuffer();
		sbAux.append("codCli=");
		sbAux.append(this.codigocliente);
		sbAux.append("Nombrecliente=");
		sbAux.append(this.nombrecliente);
		sbAux.append("apellidocliente=");
		sbAux.append(this.apellidocliente);
		sbAux.append("telefono=");
		sbAux.append(this.telefono);
		
		sbAux.append("direccion=");
		sbAux.append(this.direccion);
		
		sbAux.append("localidad=");
		sbAux.append(this.localidad);
		
		sbAux.append("Provincia=");
		sbAux.append(this.provincia);
		
		sbAux.append("codigopostal=");
		sbAux.append(this.codigopostal);
		
		sbAux.append("codigopostal=");
		sbAux.append(this.email);
		return sbAux.toString();
	}

}
