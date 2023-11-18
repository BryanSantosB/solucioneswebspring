package bsantos.proyecto.Model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bsantos.proyecto.Model.dao.IProductoDAO;
import bsantos.proyecto.Model.entidad.Producto;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoDAO productoDAO;

    @Override
    public String guardarProducto(Producto producto) {
        String rpta = "";
        try {
            productoDAO.save(producto);
            rpta = "Se guardó el producto correctamente";
        }
        catch (Exception e){
            rpta = e.toString();
        }

        return rpta;
    }
    
}
