package aus.t4.paladins.gestorback.mapper;

import aus.t4.paladins.gestorback.dto.DepartamentoResponseDTO;
import aus.t4.paladins.gestorback.model.Departamento;

public class DepartamentoMapper {

    private DepartamentoMapper() {
    }

    public static DepartamentoResponseDTO toDTO(Departamento entity) {

        DepartamentoResponseDTO dto = new DepartamentoResponseDTO();

        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());

        return dto;
    }
}