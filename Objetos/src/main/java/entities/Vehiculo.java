/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author edgar
 */
@Entity
@Table(name="Vehiculo")
@Inheritance (strategy = InheritanceType.JOINED)
public abstract class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Vehiculo", nullable=false)
    private Long id_Vehiculo;
    
    @OneToMany(mappedBy= "CatalogoMarcaLinea", cascade= CascadeType.PERSIST)        
    private List<CatalogoMarcaLinea> catalogoMarcaLinea;
    
    @ManyToOne
    @JoinColumn(name="id_Cliente")
    private Cliente cliente;

    public Vehiculo() {
    }

    public Vehiculo(Long id_Vehiculo) {
        this.id_Vehiculo = id_Vehiculo;
    }
    

    public Long getId_Vehiculo() {
        return id_Vehiculo;
    }

    public void setId_Vehiculo(Long id_Vehiculo) {
        this.id_Vehiculo = id_Vehiculo;
    }

    public List<CatalogoMarcaLinea> getCatalogoMarcaLinea() {
        return catalogoMarcaLinea;
    }

    public void setCatalogoMarcaLinea(List<CatalogoMarcaLinea> catalogoMarcaLinea) {
        this.catalogoMarcaLinea = catalogoMarcaLinea;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id_Vehiculo);
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
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.id_Vehiculo, other.id_Vehiculo);
    }

    @Override
    public String toString() {
        return "entities.Vehiculos[ id_Vehiculo=" + id_Vehiculo + " ]";
    }
    
}
