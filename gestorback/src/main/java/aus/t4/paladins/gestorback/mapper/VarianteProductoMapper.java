package aus.t4.paladins.gestorback.mapper;

import aus.t4.paladins.gestorback.dto.VarianteProductoResponseDTO;
import aus.t4.paladins.gestorback.model.VarianteProducto;

import java.util.Collections;
import java.util.stream.Collectors;

public class VarianteProductoMapper {

  private VarianteProductoMapper() {
  }

  public static VarianteProductoResponseDTO toDTO(VarianteProducto entity) {
    VarianteProductoResponseDTO dto = new VarianteProductoResponseDTO();
    dto.setId(entity.getId());
    dto.setSku(entity.getSku());
    dto.setPrecioExtra(entity.getPrecioExtra());
    dto.setStock(entity.getStock());
    dto.setProductoId(entity.getProducto().getId());
    dto.setProductoNombre(entity.getProducto().getNombre());

    if (entity.getValoresAtributo() != null) {
      /* A completar (to do) */
    } else {
      dto.setValoresAtributo(Collections.emptyList());
    }

    return dto;
  }
}
