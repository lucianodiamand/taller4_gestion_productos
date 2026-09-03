package aus.t4.paladins.gestorback.mapper;

import aus.t4.paladins.gestorback.dto.VarianteProductoResponseDTO;
import aus.t4.paladins.gestorback.model.VarianteProducto;

import java.util.Collections;

public class VarianteProductoMapper {

    private VarianteProductoMapper() {
    }

    public static VarianteProductoResponseDTO toDTO(
            VarianteProducto entity) {

        VarianteProductoResponseDTO dto =
                new VarianteProductoResponseDTO();

        dto.setId(entity.getId());
        dto.setSku(entity.getSku());
        dto.setPrecioExtra(entity.getPrecioExtra());
        dto.setStock(entity.getStock());

        dto.setProductoId(entity.getProducto().getId());
        dto.setProductoNombre(entity.getProducto().getNombre());

        if (entity.getValoresAtributo() != null) {
            dto.setValoresAtributoIds(
                    entity.getValoresAtributo()
                            .stream()
                            .map(valor -> valor.getId())
                            .toList()
            );
        } else {
            dto.setValoresAtributoIds(
                    Collections.emptyList()
            );
        }

        return dto;
    }
}