package aus.t4.paladins.gestorback.controller;

import aus.t4.paladins.gestorback.model.VarianteProducto;
import aus.t4.paladins.gestorback.service.VarianteProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/variantes")
public class VarianteProductoController {

    private final VarianteProductoService service;

    public VarianteProductoController(VarianteProductoService service) {
        this.service = service;
    }

    @GetMapping
    public List<VarianteProducto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VarianteProducto> findById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}