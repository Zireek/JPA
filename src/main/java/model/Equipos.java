package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Access(AccessType.FIELD)
@Table(name = "equipos")

public class Equipos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipos")
    int idEquipos;
    @Column(name = "nombre_equipos", length = 30)
    String nombre_equipos;
    @Column(name = "ciudad", length = 30)
    String ciudad;
    @Column(name = "pais", length = 30)
    String pais;


    public Equipos( String nombre_equipos, String ciudad, String pais) {
        super();
        this.nombre_equipos = nombre_equipos;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public int getIdEquipos() {
        return idEquipos;
    }

    public void setIdEquipos(int idEquipos) {
        this.idEquipos = idEquipos;
    }

    public String getNombre_equipos() {
        return nombre_equipos;
    }

    public void setNombre_equipos(String nombre_equipos) {
        this.nombre_equipos = nombre_equipos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "idEquipos=" + idEquipos +
                ", nombre_equipos='" + nombre_equipos + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
