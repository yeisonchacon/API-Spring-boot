package com.accenture;

import java.time.LocalDateTime;

public class Clientes {
	private Long id;
	private String cedula;
	private String direccion;
	private Double valor;
	private Double iva;
	private Double domicilio;
	private Double total;
	private LocalDateTime horaactual;

	 
	public Clientes() { }
	
	public Clientes(Long id, String cedula, String direccion, Double valor, Double iva, Double domicilio, Double total, LocalDateTime horaactual) {
		this.id = id;
		this.cedula = cedula;
		this.direccion = direccion;
		this.valor = valor;
		this.iva = iva;
		this.domicilio = domicilio;
		this.total = total;
		this.horaactual = horaactual;
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getdireccion(){
		return direccion;
	}
	
	public void Setdireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String getCedula() {
		return cedula;
	}
	
	public void SetCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public void setIva(Double iva) {
		this.iva = valor*0.19;
	}
	public Double getIva() {
		return iva = valor*0.19;
	}
	
	public void setDomicilio(Double domicilio) {
		this.domicilio=domicilio;
	}
	
	public Double getDomicilio() {
		return domicilio;
	}
	
	public void setTotal(Double total) {
		this.total = valor+iva+domicilio;
	}
	public Double getTotal() {
		return total = valor+iva+domicilio;
	}
	
	public void setHora(LocalDateTime horaactual) {
		this.horaactual=horaactual;
	}
	
	public LocalDateTime getHoraactual() {
		return horaactual;
	}
}
