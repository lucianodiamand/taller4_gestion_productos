package aus.t4.paladins.gestorback.dto;

import lombok.Data;

@Data
public class ValorAtributoResponseDTO {

    private Long id;
    private String valor;

    private Long atributoId;
    private String atributoNombre;
}