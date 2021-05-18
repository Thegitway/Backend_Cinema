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
@Table(name = "Ville")
public class Ville implements Serializable {
    @Id@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private double longitude;
    private double latitude;
    private double altitude;
    @OneToMany(mappedBy = "ville")
    private Collection<Cinema> cinemas;
}
