package com.watch.cinema.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
@AllArgsConstructor
@ToString
@Table(name = "ProjectionFilm")
public class ProjectionFilm implements Serializable {
    @Id@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateProjection;
    private double prix;
    @OneToMany(mappedBy="projectionFilm")
    private Collection<Ticket> tickets;
    @ManyToOne
    private Seance seance;

}
