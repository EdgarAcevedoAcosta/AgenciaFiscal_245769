/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author edgar
 */
@Entity
@Table(name="Empaca")
public class Empaca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Placa")
    private Long id_Placa;

    @Column(name="estado")
    private String estado;
    
    @Column(name="nombrePlaca")
    private String nombrePlaca;
    
    @Column(name="costoTotal")
    private double costoTotal;
    
    @Column(name="fechaEmision")
    private LocalDate fechaEmision;
    
    @Column(name="fechaRecepcion")
    private LocalDate fechaRecepcion;
    
    @OneToMany(mappedBy= "empacaCosto", cascade= CascadeType.PERSIST)        
    private List<PlacasCosto> placasCosto;

    @OneToMany(mappedBy= "empaca", cascade= CascadeType.PERSIST)        
    private List<Automovil> automovil;
    
    public Empaca(Long id_Placa, String estado, String nombrePlaca, double costoTotal, LocalDate fechaEmision, LocalDate fechaRecepcion) {
        this.id_Placa = id_Placa;
        this.estado = estado;
        this.nombrePlaca = nombrePlaca;
        this.costoTotal = costoTotal;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
    }

    public Empaca(String estado, String nombrePlaca, double costoTotal, LocalDate fechaEmision, LocalDate fechaRecepcion) {
        this.estado = estado;
        this.nombrePlaca = nombrePlaca;
        this.costoTotal = costoTotal;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
    }

    public Empaca() {
    }

    public Long getId_Placa() {
        return id_Placa;
    }

    public void setId_Placa(Long id_Placa) {
        this.id_Placa = id_Placa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombrePlaca() {
        return nombrePlaca;
    }

    public void setNombrePlaca(String nombrePlaca) {
        this.nombrePlaca = nombrePlaca;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(LocalDate fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public List<PlacasCosto> getPlacasCosto() {
        return placasCosto;
    }

    public void setPlacasCosto(List<PlacasCosto> placasCosto) {
        this.placasCosto = placasCosto;
    }

    public List<Automovil> getAutomovil() {
        return automovil;
    }

    public void setAutomovil(List<Automovil> automovil) {
        this.automovil = automovil;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id_Placa);
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
        final Empaca other = (Empaca) obj;
        return Objects.equals(this.id_Placa, other.id_Placa);
    }
    
    

    @Override
    public String toString() {
        return "entities.Empaca{" + "id_Placa=" + id_Placa + ", estado=" + estado + ", nombrePlaca=" + nombrePlaca + ", costoTotal=" + costoTotal + ", fechaEmision=" + fechaEmision + ", fechaRecepcion=" + fechaRecepcion + '}';
    }

    
    
}
