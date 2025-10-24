/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name="LicenciaCostos")
public class LicenciaCostos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_LicenciaCosto" , nullable = false)
    private Long id_LicenciaCosto;
    
    @Column(name="costo")
    private double costo;
    
    @Column(name="añosVigencia")
    private int añosVigencia;
    
    @ManyToOne
    @JoinColumn(name="id_Licencia")
    private AdquiereLiciencia adquiereLiciencia;

    public LicenciaCostos(Long id_LicenciaCosto, double costo, int AñosVigencia) {
        this.id_LicenciaCosto = id_LicenciaCosto;
        this.costo = costo;
        this.añosVigencia = AñosVigencia;
    }

    public LicenciaCostos(double costo, int AñosVigencia) {
        this.costo = costo;
        this.añosVigencia = AñosVigencia;
    }

    public LicenciaCostos() {
    }

    public Long getId_LicenciaCosto() {
        return id_LicenciaCosto;
    }

    public void setId_LicenciaCosto(Long id_LicenciaCosto) {
        this.id_LicenciaCosto = id_LicenciaCosto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public AdquiereLiciencia getAdquiereLiciencia() {
        return adquiereLiciencia;
    }

    public void setAdquiereLiciencia(AdquiereLiciencia adquiereLiciencia) {
        this.adquiereLiciencia = adquiereLiciencia;
    }

    

    public int getAñosVigencia() {
        return añosVigencia;
    }

    public void setAñosVigencia(int AñosVigencia) {
        this.añosVigencia = AñosVigencia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.id_LicenciaCosto);
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
        final LicenciaCostos other = (LicenciaCostos) obj;
        return Objects.equals(this.id_LicenciaCosto, other.id_LicenciaCosto);
    }

    @Override
    public String toString() {
        return "entities.LicenciaCostos{" + "id_LicenciaCosto=" + id_LicenciaCosto + ", costo=" + costo + ", AñosVigencia=" + añosVigencia + '}';
    }
    
    
    
}
