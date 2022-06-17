package GalaxyGames.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity


public class Purchase {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int purchase_ID;

    @ManyToOne
    @JoinColumn(name = "customer_ID")
    @JsonIgnoreProperties(value = {"game"})
    public Customer customer;

    @ManyToOne
    @JoinColumn(name = "game_ID")
    @JsonIgnoreProperties(value = {"game"})
    public Games games;

    @Column
    private String price;

}
