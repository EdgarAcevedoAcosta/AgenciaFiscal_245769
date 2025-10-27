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
@Table(name="PlacasCosto")
public class PlacasCosto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_PlacaCosto")
    private Long id_PlacaCosto;

    @Column(name="costo")
    private double costo;
    
    @Column(name="tipoTramite")
    private String tipoTramite;
    
    @ManyToOne
    @JoinColumn(name="id_Placa")
    private Empaca empacaCosto;

    public PlacasCosto(Long id_PlacaCosto, double costo, String tipoTramite) {
        this.id_PlacaCosto = id_PlacaCosto;
        this.costo = costo;
        this.tipoTramite = tipoTramite;
    }

    public PlacasCosto(double costo, String tipoTramite) {
        this.costo = costo;
        this.tipoTramite = tipoTramite;
    }

    public PlacasCosto() {
    }

    public Long getId_PlacaCosto() {
        return id_PlacaCosto;
    }

    public void setId_PlacaCosto(Long id_PlacaCosto) {
        this.id_PlacaCosto = id_PlacaCosto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Empaca getEmpacaCosto() {
        return empacaCosto;
    }

    public void setEmpacaCosto(Empaca empacaCosto) {
        this.empacaCosto = empacaCosto;
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id_PlacaCosto);
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
        final PlacasCosto other = (PlacasCosto) obj;
        return Objects.equals(this.id_PlacaCosto, other.id_PlacaCosto);
    }
    
    

    @Override
    public String toString() {
        return "entities.PlacasCosto{" + "id_PlacaCosto=" + id_PlacaCosto + ", costo=" + costo + ", tipoTramite=" + tipoTramite + '}';
    }

    
}
