package pl.pwr.movierental.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ClientData")
public class ClientData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientId;

    private Double accountBalance;

    @ManyToOne
    @JoinColumn(name = "addressid", referencedColumnName = "addressid")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "personaldataid", referencedColumnName = "personaldataid")
    private PersonalData personalData;
}
