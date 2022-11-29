package com.example.demo.venta.repository;

import com.example.demo.modelo.Vendedor;

public interface IVendedorRepository {

	public Vendedor buscar(Integer id);
	public void actualizar(Vendedor vendedor);
	public void insertar(Vendedor vendedor);
	public void borrar(Integer id);

}
