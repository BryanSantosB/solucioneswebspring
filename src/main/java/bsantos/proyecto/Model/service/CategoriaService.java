package bsantos.proyecto.Model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bsantos.proyecto.Model.dao.ICategoriaDAO;
import bsantos.proyecto.Model.entidad.Categoria;

@Service
public class CategoriaService implements ICategoriaService{

    @Autowired
    private ICategoriaDAO categoriaDao;

    @Override
    public void guardarCategoria(Categoria categoria) {
        categoriaDao.save(categoria);
    }
    

    @Override
    public List<Categoria> cargarCategorias(){
        return (List<Categoria>)categoriaDao.findAll();
    }

    @Override
    public void eliminarCategoria(Long id){
        categoriaDao.deleteById(id);
    }
}
