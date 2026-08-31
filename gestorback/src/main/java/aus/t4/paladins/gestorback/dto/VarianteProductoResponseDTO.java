package aus.t4.paladins.gestorback.dto;

// import aus.t4.paladins.gestorback.dto.ValorAtributoResponseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class VarianteProductoResponseDTO {
  private Long id;
  private String sku;
  private BigDecimal precioExtra;
  private Integer stock;
  private Long productoId;
  private String productoNombre;
  // private List<ValorAtributoResponseDTO> valoresAtributo;
}
