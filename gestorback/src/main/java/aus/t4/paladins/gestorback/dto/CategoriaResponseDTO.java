package aus.t4.paladins.gestorback.dto;

import lombok.Data;

@Data
public class CategoriaResponseDTO {

    private Long id;
    private String nombre;
    private Long departamentoId;
    private String departamentoNombre;
}