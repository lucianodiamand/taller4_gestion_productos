package aus.t4.paladins.gestorback.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor // requerido por JPA y Builder
@Builder
@Table(name = "variante_producto")
public class VarianteProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_ref", nullable = false, unique = true, length = 50)
    private String sku;

    @Column(name = "precio_extra", precision = 10, scale = 2)
    private BigDecimal precioExtra;

    @Column(nullable = false)
    private Integer stock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    // Tabla intermedia: variante_valor
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "variante_valor",
        JoinColumns = @JoinColumn(name = "variante_id"),
        inverseJoinColumns = @JoinColumn(name = "valor_atibuto_id")
    ) // podría obviarse, union explicita por las id.
    @Builder.Default // con el `new` evitamos NullPointerException
    private List<ValorAtributo> valoresAtributo = new ArrayList<>();

}
