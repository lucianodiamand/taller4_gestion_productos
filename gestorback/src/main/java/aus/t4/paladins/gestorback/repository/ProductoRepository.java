package aus.t4.paladins.gestorback.repository;

import aus.t4.paladins.gestorback.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}