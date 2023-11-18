package bsantos.proyecto.Model.service;

import java.util.List;

import bsantos.proyecto.Model.entidad.Categoria;

public interface ICategoriaService {
    public void guardarCategoria(Categoria categoria);
    public List<Categoria> cargarCategorias();
    public void eliminarCategoria(Long id);
}
