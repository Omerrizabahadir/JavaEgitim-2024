package com.example.one_to_many_example2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "teams")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long id;

    private String teamName;

    private String homeTeam;

    @OneToMany(mappedBy = "team",cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    private List<Match>matches;

}
