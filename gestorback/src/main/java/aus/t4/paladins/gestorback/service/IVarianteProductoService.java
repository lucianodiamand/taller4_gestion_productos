package aus.t4.paladins.gestorback.service;

import aus.t4.paladins.gestorback.dto.VarianteProductoRequestDTO;
import aus.t4.paladins.gestorback.dto.VarianteProductoResponseDTO;

import java.util.List;
import java.util.Optional;

public interface IVarianteProductoService {
  // VarianteProductoResponseDTO create(VarianteProductoRequestDTO dto);

  Optional<VarianteProductoResponseDTO> findById(Long id);

  List<VarianteProductoResponseDTO> findAll();

  // VarianteProductoResponseDTO findBySku(String sku);
  // List<VarianteProductoResponseDTO> findByProducto(Long productoId);

  // VarianteProductoResponseDTO update(Long id, VarianteProductoRequestDTO dto);
  // void delete(Long id);
}
