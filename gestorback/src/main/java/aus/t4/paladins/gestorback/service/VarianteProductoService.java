package aus.t4.paladins.gestorback.service;

import aus.t4.paladins.gestorback.dto.VarianteProductoResponseDTO;
import aus.t4.paladins.gestorback.mapper.VarianteProductoMapper;
import aus.t4.paladins.gestorback.model.VarianteProducto;
import aus.t4.paladins.gestorback.repository.VarianteProductoRepository;
import aus.t4.paladins.gestorback.service.IVarianteProductoService;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class VarianteProductoService implements IVarianteProductoService {

  // private final VarianteProductoRepository repository;
  @Autowired
  private VarianteProductoRepository varianteRepository;

  /*
   * public VarianteProductoService(VarianteProductoRepository varianteRepository)
   * {
   * this.varianteRepository = varianteRepository;
   * }
   */
  /*
   * Comento el constructor.
   * Java genera automáticamente un constructor vacío.
   * Spring invoca ese constructor y completa el campo marcado con `@Autowired`."
   */

  @Transactional
  public List<VarianteProductoResponseDTO> findAll() {
    return varianteRepository.findAll().stream()
        .map(VarianteProductoMapper::toDTO)
        .collect(Collectors.toList());
  }

  @Transactional
  public Optional<VarianteProductoResponseDTO> findById(Long id) {
    return varianteRepository.findById(id)
        .map(VarianteProductoMapper::toDTO);
  }
}
