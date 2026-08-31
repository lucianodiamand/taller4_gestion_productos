package aus.t4.paladins.gestorback.controller;

// import aus.t4.paladins.gestorback.model.VarianteProducto;
import aus.t4.paladins.gestorback.dto.VarianteProductoRequestDTO;
import aus.t4.paladins.gestorback.dto.VarianteProductoResponseDTO;
import aus.t4.paladins.gestorback.service.IVarianteProductoService;
//import aus.t4.paladins.gestorback.service.VarianteProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/variantes")
public class VarianteProductoController {

  // private final VarianteProductoService service;
  @Autowired
  private IVarianteProductoService varianteService;

  public VarianteProductoController(IVarianteProductoService varianteService) {
    this.varianteService = varianteService;
  }

  @GetMapping
  public List<VarianteProductoResponseDTO> findAll() {
    return varianteService.findAll();
  } // ver ResponseEntity

  @GetMapping("/{id}")
  public ResponseEntity<VarianteProductoResponseDTO> findById(@PathVariable Long id) {
    return varianteService.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }
}
