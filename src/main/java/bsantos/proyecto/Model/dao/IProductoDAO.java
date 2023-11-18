package bsantos.proyecto.Model.dao;

import org.springframework.data.repository.CrudRepository;

import bsantos.proyecto.Model.entidad.Producto;

public interface IProductoDAO extends CrudRepository<Producto, Long> {
    
}
