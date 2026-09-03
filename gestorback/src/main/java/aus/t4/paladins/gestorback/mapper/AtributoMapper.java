package aus.t4.paladins.gestorback.mapper;

import aus.t4.paladins.gestorback.dto.AtributoResponseDTO;
import aus.t4.paladins.gestorback.model.Atributo;

public class AtributoMapper {

    private AtributoMapper() {
    }

    public static AtributoResponseDTO toDTO(Atributo entity) {
        AtributoResponseDTO dto = new AtributoResponseDTO();

        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());

        return dto;
    }
}