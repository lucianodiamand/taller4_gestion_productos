package aus.t4.paladins.gestorback.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class VarianteProductoRequestDTO {
  private String sku;
  private BigDecimal precioExtra;
  private Integer stock;
  private Long productoId;
  private List<Long> valoresAtributoIds;
}
