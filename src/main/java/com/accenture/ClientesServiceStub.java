package com.accenture;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientesServiceStub {
	private static Map<Long, Clientes> clientees = new HashMap<>();
	private static Long index = 0L;
	
	public static List<Clientes> getAllClientees(){
		return new ArrayList<>(clientees.values());
	}
	
	public static Clientes getClientesDetalle(Long clientId ) {
		return clientees.get(clientId);
	}
	
	public static Clientes addClientes(Clientes clientes) {
		index +=1;
		clientes.setId(index);
		clientees.put(index, clientes);
		clientes.setHora(LocalDateTime.now());
		Double valor = clientes.getValor();
		if(valor>100000) {
			clientes.setDomicilio(0.0);
		}else {
			clientes.setDomicilio(10000.0);
		}
		return clientes;
	}
	
	public static Clientes updateClientes(Long clientId, Clientes clientes) {
		Clientes clientemodificar = clientees.get(clientId);
		LocalDateTime horaactual = LocalDateTime.now();
		LocalDateTime horapedido = clientemodificar.getHoraactual();
		LocalDateTime horalimite = horapedido.plusHours(5);
		
		if(horaactual.isBefore(horalimite) || horaactual.isEqual(horalimite)) {
			Double valoranterior=clientemodificar.getValor();
			if(clientes.getValor()>=valoranterior) {
				clientemodificar.SetCedula(clientes.getCedula());
				clientemodificar.Setdireccion(clientes.getdireccion());
				clientemodificar.setValor(clientes.getValor());
				if(clientes.getValor()>100000) {
					clientemodificar.setDomicilio(0.0);
					return clientemodificar;
				}
			}
		}
		return clientemodificar;
	}
	
	public static Clientes deleteClientes(Long clientId) {
		
		Clientes clienteeliminar = clientees.get(clientId);
		LocalDateTime horaactual = LocalDateTime.now();
		LocalDateTime horapedido = clienteeliminar.getHoraactual();
		LocalDateTime horalimite = horapedido.plusSeconds(20);
		
	
		if(horaactual.isBefore(horalimite) || horaactual.isEqual(horalimite)) {
			clienteeliminar.setValor(0.0);
			
			clienteeliminar.setDomicilio(0.0);
			clienteeliminar = clientees.remove(clientId);
			
			return clienteeliminar;
			
		}else{
			
			Double valorf=clienteeliminar.getValor()*0.1;
			Double valord=clienteeliminar.getDomicilio()*0.1;
			clienteeliminar.setValor(valorf);
			clienteeliminar.setDomicilio(valord);
			clienteeliminar = clientees.remove(clientId);
			
		}
		return clienteeliminar;
		
	}
}
