package bsantos.proyecto.Model.dao;

import org.springframework.data.repository.CrudRepository;

import bsantos.proyecto.Model.entidad.Categoria;

public interface ICategoriaDAO extends CrudRepository<Categoria, Long>{
    
}
