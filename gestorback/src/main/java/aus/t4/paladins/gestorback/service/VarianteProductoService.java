package aus.t4.paladins.gestorback.service;

import aus.t4.paladins.gestorback.model.VarianteProducto;
import aus.t4.paladins.gestorback.repository.VarianteProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VarianteProductoService {

    private final VarianteProductoRepository repository;

    public VarianteProductoService(VarianteProductoRepository repository) {
        this.repository = repository;
    }

    public List<VarianteProducto> findAll() {
        return repository.findAll();
    }

    public Optional<VarianteProducto> findById(Long id) {
        return repository.findById(id);
    }
}