package aus.t4.paladins.gestorback.mapper;

import aus.t4.paladins.gestorback.dto.ValorAtributoResponseDTO;
import aus.t4.paladins.gestorback.model.ValorAtributo;

public class ValorAtributoMapper {

    private ValorAtributoMapper() {
    }

    public static ValorAtributoResponseDTO toDTO(
            ValorAtributo entity) {

        ValorAtributoResponseDTO dto =
                new ValorAtributoResponseDTO();

        dto.setId(entity.getId());
        dto.setValor(entity.getValor());
        dto.setAtributoId(entity.getAtributo().getId());
        dto.setAtributoNombre(entity.getAtributo().getNombre());

        return dto;
    }
}