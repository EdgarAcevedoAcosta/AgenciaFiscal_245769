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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author edgar
 */
@Entity
@Table(name="CatalogoMarcaLinea")
public class CatalogoMarcaLinea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_CatalogoMarcaLinea")
    private Long id_CatalogoMarcaLinea;
    
    @Column(name="modelo")
    private String modelo;
    
    @Column(name="linea")
    private String linea;
    
    @Column(name="marca")
    private String marca;
    
    
    @OneToMany(mappedBy= "catalogoMarcaLinea", cascade= CascadeType.PERSIST)        
    private List<Vehiculo> vehiculo;

    public CatalogoMarcaLinea(Long id_CatalogoMarcaLinea, String modelo, String linea, String marca) {
        this.id_CatalogoMarcaLinea = id_CatalogoMarcaLinea;
        this.modelo = modelo;
        this.linea = linea;
        this.marca = marca;
    }

    public CatalogoMarcaLinea(String modelo, String linea, String marca) {
        this.modelo = modelo;
        this.linea = linea;
        this.marca = marca;
    }

    public CatalogoMarcaLinea() {
    }

    public Long getId_CatalogoMarcaLinea() {
        return id_CatalogoMarcaLinea;
    }

    public void setId_CatalogoMarcaLinea(Long id_CatalogoMarcaLinea) {
        this.id_CatalogoMarcaLinea = id_CatalogoMarcaLinea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculo;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculo = vehiculos;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id_CatalogoMarcaLinea);
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
        final CatalogoMarcaLinea other = (CatalogoMarcaLinea) obj;
        return Objects.equals(this.id_CatalogoMarcaLinea, other.id_CatalogoMarcaLinea);
    }

    @Override
    public String toString() {
        return "CatalogoMarcaLinea{" + "id_CatalogoMarcaLinea=" + id_CatalogoMarcaLinea + ", modelo=" + modelo + ", linea=" + linea + ", marca=" + marca + ", vehiculo=" + vehiculo + '}';
    }

    

   

    
    
}
