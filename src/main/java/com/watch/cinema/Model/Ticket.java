package com.watch.cinema.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
@AllArgsConstructor
@ToString
@Table(name = "Ticket")
public class Ticket {
    @Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nomClient;
    private double prix;
    @Column(unique=true)
    private int codePayement;
    private boolean reserve;
    @ManyToOne
    private Place place;
    @ManyToOne
    private ProjectionFilm projectionFilm;
}
