package aus.t4.paladins.gestorback.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.ArrayList;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor // requerido por JPA y Builder
@Builder
@Table(name = "departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // mejor que .AUTO
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @OneToMany(mappedBy = "departamento", 
        cascade = CascadeType.ALL, // actuar s/padre entero repica en el hijo
        orphanRemoval = true,       // al desconectar un hijo no queda huérfano
        fetch = FetchType.LAZY)
    @Builder.Default // con el `new` evitamos NullPointerException
    private List<Categoria> categorias = new ArrayList<>();

}
