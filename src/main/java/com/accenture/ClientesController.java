package com.accenture;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientesController {
	@GetMapping("/clientes")
	public List<Clientes> getAllClientees(){
		return ClientesServiceStub.getAllClientees();
	}
	
	@GetMapping("clientes/{clientesId}")
	public Clientes getClientesDetalle(@PathVariable Long clientesId) {
		return ClientesServiceStub.getClientesDetalle(clientesId);
	}
	
	@PostMapping("/addClientes")
	public Clientes addClientes(@RequestBody Clientes clientes) {
		return ClientesServiceStub.addClientes(clientes);
	}
	
	@PutMapping("updateClientes/{clientesId}")
	public Clientes updateClientes(@PathVariable Long clientesId, @RequestBody Clientes clientes) {
		return ClientesServiceStub.updateClientes(clientesId, clientes);
	}
	
	@DeleteMapping("/deleteClientes/{clientesId}")
	public Clientes deleteClientes(@PathVariable Long clientesId) {
		return ClientesServiceStub.deleteClientes(clientesId);
	}

}
