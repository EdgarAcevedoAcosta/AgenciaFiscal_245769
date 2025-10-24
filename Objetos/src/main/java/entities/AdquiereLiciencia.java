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
@Table(name="AdquiereLicencia")
public class AdquiereLiciencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Licencia")
    private Long id_Licencia;

    @Column(name="costoTotal")
    private double costoTotal;
    
    @Column(name="vigencia")
    private int vigencia;
    
    @Column(name="fechaCompra")
    private LocalDate fechaCompra;
    
    @Column(name="fechaExpiración")
    private LocalDate fechaExpiración;
    
    @OneToMany(mappedBy= "LicenciaCostos", cascade= CascadeType.PERSIST)        
    private List<LicenciaCostos> licenciaCostos;
    
    @OneToMany(mappedBy= "Cliente", cascade= CascadeType.PERSIST)        
    private List<Cliente> cliente;

    public AdquiereLiciencia(Long id_Licencia, double costoTotal, int vigencia, LocalDate fechaCompra, LocalDate fechaExpiración) {
        this.id_Licencia = id_Licencia;
        this.costoTotal = costoTotal;
        this.vigencia = vigencia;
        this.fechaCompra = fechaCompra;
        this.fechaExpiración = fechaExpiración;
    }

    public AdquiereLiciencia(double costoTotal, int vigencia, LocalDate fechaCompra, LocalDate fechaExpiración) {
        this.costoTotal = costoTotal;
        this.vigencia = vigencia;
        this.fechaCompra = fechaCompra;
        this.fechaExpiración = fechaExpiración;
    }

    public AdquiereLiciencia() {
    }

    public Long getId_Licencia() {
        return id_Licencia;
    }

    public void setId_Licencia(Long id_Licencia) {
        this.id_Licencia = id_Licencia;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalDate getFechaExpiración() {
        return fechaExpiración;
    }

    public void setFechaExpiración(LocalDate fechaExpiración) {
        this.fechaExpiración = fechaExpiración;
    }

    public List<LicenciaCostos> getLicenciaCostos() {
        return licenciaCostos;
    }

    public void setLicenciaCostos(List<LicenciaCostos> licenciaCostos) {
        this.licenciaCostos = licenciaCostos;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id_Licencia);
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
        final AdquiereLiciencia other = (AdquiereLiciencia) obj;
        return Objects.equals(this.id_Licencia, other.id_Licencia);
    }
    
    

    @Override
    public String toString() {
        return "entities.AdquiereLiciencia{" + "id_Licencia=" + id_Licencia + ", costoTotal=" + costoTotal + ", vigencia=" + vigencia + ", fechaCompra=" + fechaCompra + ", fechaExpiraci\u00f3n=" + fechaExpiración + '}';
    }
    
    
    
}
