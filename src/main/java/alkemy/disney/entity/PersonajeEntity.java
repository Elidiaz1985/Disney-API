package alkemy.disney.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "personaje")
@Getter
@Setter


public class PersonajeEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String imagen;

    private String nombre;

    private short edad;

    private short peso;

    private String historia;

    @ManyToMany(mappedBy = "personajes", cascade = CascadeType.PERSIST)
    private List<PeliculasSeriesEntity> peliculasSeries = new ArrayList<>();




}
