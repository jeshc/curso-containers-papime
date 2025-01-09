package mx.unam.aragon.ico.is.productos.repositorios;


import mx.unam.aragon.ico.is.productos.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
