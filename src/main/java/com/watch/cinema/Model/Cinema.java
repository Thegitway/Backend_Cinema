package com.watch.cinema.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
@AllArgsConstructor
@ToString
@Table(name = "Cinema")
public class Cinema implements Serializable {
    @Id@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private double longitude;
    private double latitude;
    private double altitude;
    private int nombreSalles;
    @ManyToOne
    private Ville ville;

    @OneToMany(mappedBy = "cinema")
    private Collection<Salle> salles;

}
