package mx.unam.aragon.ico.is.productos.servicios;


import mx.unam.aragon.ico.is.productos.entidades.Producto;
import mx.unam.aragon.ico.is.productos.repositorios.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }
}