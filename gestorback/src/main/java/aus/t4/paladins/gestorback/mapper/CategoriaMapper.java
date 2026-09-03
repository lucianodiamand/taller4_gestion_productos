package aus.t4.paladins.gestorback.mapper;

import aus.t4.paladins.gestorback.dto.CategoriaResponseDTO;
import aus.t4.paladins.gestorback.model.Categoria;

public class CategoriaMapper {

    private CategoriaMapper() {
    }

    public static CategoriaResponseDTO toDTO(Categoria entity) {

        CategoriaResponseDTO dto = new CategoriaResponseDTO();

        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());

        if (entity.getDepartamento() != null) {
            dto.setDepartamentoId(entity.getDepartamento().getId());
            dto.setDepartamentoNombre(entity.getDepartamento().getNombre());
        }

        return dto;
    }
}