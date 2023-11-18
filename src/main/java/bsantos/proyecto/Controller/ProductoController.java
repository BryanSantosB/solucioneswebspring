package bsantos.proyecto.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bsantos.proyecto.Model.entidad.Producto;
import bsantos.proyecto.Model.service.ICategoriaService;
import bsantos.proyecto.Model.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
    
    @Autowired
    private ICategoriaService categoriaService;

    @Autowired
    private IProductoService productoService;

    @RequestMapping("/")
    public String inicio(Model model){
        Producto producto = new Producto();
        model.addAttribute("producto", producto);
        model.addAttribute("listaCategorias", categoriaService.cargarCategorias());
        return "producto/inicio";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(Producto producto){
        productoService.guardarProducto(producto);
        return "redirect:/productos/";
    }
}
