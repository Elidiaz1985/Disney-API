package alkemy.disney.entity;




import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "genero")
@Getter
@Setter

public class GeneroEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)

    private long id;

    private String imagen;

    private String peliculaSerie;
}
