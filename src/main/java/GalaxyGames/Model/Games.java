package GalaxyGames.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


/**
 * LOMBOK - automating the creation of model classes
 * ALLARGS/NOARGS - annotations that auto generate constructors
 * DATA = autogenerates getters/setters
 * TOSTRING - autogenerates a tostring
 */


/*
    Instead of JDBC, ORM (Project Rational Mapping) is used

    ORM - java objects are mapped to tables in our db where
            we can interact with data in the db as if we're
            using SQL
*/

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity

public class Games {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int game_ID;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String price;

}
