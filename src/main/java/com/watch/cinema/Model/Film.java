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
@Table(name = "Film")
public class Film implements Serializable {
    @Id@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titre;
    private double duree;
    private String realisateur;
    private String description;
    private String photo;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date dateSortie;
    @OneToMany(mappedBy = "film")
    private Collection<Categorie> categories;

}
