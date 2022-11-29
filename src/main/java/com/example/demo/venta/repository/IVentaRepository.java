package com.example.demo.venta.repository;

import com.example.demo.modelo.Venta;

public interface IVentaRepository {

	public Venta buscar(Integer id);
	public void actualizar(Venta venta);
	public void insertar(Venta venta);
	public void borrar(Integer id);

}
