package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Access(AccessType.FIELD)
@Table(name = "jugadores")


public class Jugadores implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jugadores")
    int jugadoresId;
    @Column(name = "nom", length = 30)
    String name;
    @Column(name = "nacionalitat", length = 12)
    String nationality;
    @Column(name = "any_naixement", length = 4)
    String birthYear;

    @ManyToOne
    @JoinColumn(name = "equipo_juegan")
    Equipos equipo_juegan;

    public Jugadores( String name, String nationality, String birthYear, String equiposjuegan) {
        super();
        this.birthYear = birthYear;
        this.name = name;
        this.nationality = nationality;

    }

    public Jugadores() {

    }

    public int getJugadoresId() {
        return jugadoresId;
    }

    public void setJugadoresId(int jugadoresId) {
        this.jugadoresId = jugadoresId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "jugadoresId=" + jugadoresId +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }
}