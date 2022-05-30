package com.model;

public class Revision {

	private String codigorevision ;
	   private String cod_vehiculo ;
	   private String cambio_filtro; 
	   private String cambio_aceite ;
	  private String cambio_frenos ;
	public Revision(String codigorevision, String cod_vehiculo, String cambio_filtro, String cambio_aceite,
			String cambio_frenos) {
		super();
		this.codigorevision = codigorevision;
		this.cod_vehiculo = cod_vehiculo;
		this.cambio_filtro = cambio_filtro;
		this.cambio_aceite = cambio_aceite;
		this.cambio_frenos = cambio_frenos;
	}
	public String getCodigorevision() {
		return codigorevision;
	}
	public void setCodigorevision(String codigorevision) {
		this.codigorevision = codigorevision;
	}
	public String getCod_vehiculo() {
		return cod_vehiculo;
	}
	public void setCod_vehiculo(String cod_vehiculo) {
		this.cod_vehiculo = cod_vehiculo;
	}
	public String getCambio_filtro() {
		return cambio_filtro;
	}
	public void setCambio_filtro(String cambio_filtro) {
		this.cambio_filtro = cambio_filtro;
	}
	public String getCambio_aceite() {
		return cambio_aceite;
	}
	public void setCambio_aceite(String cambio_aceite) {
		this.cambio_aceite = cambio_aceite;
	}
	public String getCambio_frenos() {
		return cambio_frenos;
	}
	public void setCambio_frenos(String cambio_frenos) {
		this.cambio_frenos = cambio_frenos;
	}
	public String toString() {
		StringBuffer sbAux = new StringBuffer();
		sbAux.append("codCli=");
		sbAux.append(this.codigorevision);
		
		sbAux.append("matricula=");
		sbAux.append(this.cod_vehiculo);
		
		sbAux.append("modelo=");
		sbAux.append(this.cambio_filtro);
		
		sbAux.append("marca=");
		sbAux.append(this.cambio_aceite);
		
		sbAux.append("color=");
		sbAux.append(this.cambio_frenos);
		
	
		
	
		return sbAux.toString();
	}
}
