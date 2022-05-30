package com.model;

public class contrato {

	private String codigocontrato;
	 private String valor_contrato;
	private  String fecha;
	private  String cod_proveedor;
	private String cod_reserva;
	public contrato(String codigocontrato, String valor_contrato, String fecha, String cod_proveedor,
			String cod_reserva) {
		super();
		this.codigocontrato = codigocontrato;
		this.valor_contrato = valor_contrato;
		this.fecha = fecha;
		this.cod_proveedor = cod_proveedor;
		this.cod_reserva = cod_reserva;
	}
	public String getCodigocontrato() {
		return codigocontrato;
	}
	public void setCodigocontrato(String codigocontrato) {
		this.codigocontrato = codigocontrato;
	}
	public String getValor_contrato() {
		return valor_contrato;
	}
	public void setValor_contrato(String valor_contrato) {
		this.valor_contrato = valor_contrato;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getCod_proveedor() {
		return cod_proveedor;
	}
	public void setCod_proveedor(String cod_proveedor) {
		this.cod_proveedor = cod_proveedor;
	}
	public String getCod_reserva() {
		return cod_reserva;
	}
	public void setCod_reserva(String cod_reserva) {
		this.cod_reserva = cod_reserva;
	}
	public String toString() {
		StringBuffer sbAux = new StringBuffer();
		sbAux.append("codc=");
		sbAux.append(this.getCodigocontrato());
		
		sbAux.append("matricula=");
		sbAux.append(this.valor_contrato);
		
		sbAux.append("modelo=");
		sbAux.append(this.fecha);
		
		sbAux.append("marca=");
		sbAux.append(this.cod_proveedor);
		
		sbAux.append("color=");
		sbAux.append(this.cod_reserva);

	
		return sbAux.toString();
	}
}
