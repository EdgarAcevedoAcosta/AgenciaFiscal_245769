/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author edgar
 */
@Entity
@Table(name="Automovil")
public class Automovil extends Vehiculo {

    private static final long serialVersionUID = 1L;
    //@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numeroSerie")
    private String numeroSerie;

    @Column(name="color")
    private String color;
    
    @ManyToOne
    @JoinColumn(name="id_Placa")
    private Empaca empaca;

    public Automovil(String numeroSerie, String color) {
        this.numeroSerie = numeroSerie;
        this.color = color;
    }

    public Automovil() {
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.numeroSerie);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Automovil other = (Automovil) obj;
        return Objects.equals(this.numeroSerie, other.numeroSerie);
    }
    
    

    @Override
    public String toString() {
        return "entities.Automovil{" + "numeroSerie=" + numeroSerie + ", color=" + color + '}';
    }
    
    

    
    
}
