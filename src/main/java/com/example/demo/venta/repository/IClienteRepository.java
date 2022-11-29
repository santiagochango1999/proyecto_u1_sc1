package com.example.demo.venta.repository;

import com.example.demo.modelo.Cliente;

public interface IClienteRepository {
	
	public Cliente buscar(Integer id);
	public void actualizar(Cliente cliente);
	public void insertar(Cliente cliente);
	public void borrar(Integer id);

}
