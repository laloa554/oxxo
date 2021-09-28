package com.webHook.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metadata{
    @JsonProperty("NoPedido") 
    private int noPedido;
    @JsonProperty("Monto") 
    private double monto;
    @JsonProperty("Notarjeta") 
    private String notarjeta;
    @JsonProperty("FolioInterbancario") 
    private String folioInterbancario;
    @JsonProperty("NoAutorizacion") 
    private String noAutorizacion;
    @JsonProperty("FechaPago") 
    private int fechaPago;
    @JsonProperty("HoraPago") 
    private int horaPago;
    @JsonProperty("TitularCuenta") 
    private String titularCuenta;
    
	public Metadata() {
		super();
	}

	public Metadata(int noPedido, double monto, String notarjeta, String folioInterbancario, String noAutorizacion,
			int fechaPago, int horaPago, String titularCuenta) {
		super();
		this.noPedido = noPedido;
		this.monto = monto;
		this.notarjeta = notarjeta;
		this.folioInterbancario = folioInterbancario;
		this.noAutorizacion = noAutorizacion;
		this.fechaPago = fechaPago;
		this.horaPago = horaPago;
		this.titularCuenta = titularCuenta;
	}

	public int getNoPedido() {
		return noPedido;
	}

	public void setNoPedido(int noPedido) {
		this.noPedido = noPedido;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getNotarjeta() {
		return notarjeta;
	}

	public void setNotarjeta(String notarjeta) {
		this.notarjeta = notarjeta;
	}

	public String getFolioInterbancario() {
		return folioInterbancario;
	}

	public void setFolioInterbancario(String folioInterbancario) {
		this.folioInterbancario = folioInterbancario;
	}

	public String getNoAutorizacion() {
		return noAutorizacion;
	}

	public void setNoAutorizacion(String noAutorizacion) {
		this.noAutorizacion = noAutorizacion;
	}

	public int getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(int fechaPago) {
		this.fechaPago = fechaPago;
	}

	public int getHoraPago() {
		return horaPago;
	}

	public void setHoraPago(int horaPago) {
		this.horaPago = horaPago;
	}

	public String getTitularCuenta() {
		return titularCuenta;
	}

	public void setTitularCuenta(String titularCuenta) {
		this.titularCuenta = titularCuenta;
	}
    
	
    
}