/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
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
@Table(name="Cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Cliente")
    private Long id_Cliente;
    
    @Column(name="nombreCompleto")
    private String nombreCompleto;
    
    @Column(name="rfc")
    private String rfc;
    
    @Column(name="discapacidad")
    private String discapacidad;
    
    @Column(name="fechaNacimiento")
    private LocalDate fechaNacimiento;
    
    @Column(name="telefono")
    private String telefono;
    
    @ManyToOne
    @JoinColumn(name="id_Licencia")
    private AdquiereLiciencia adquiereLiciencia;
    
    @OneToMany(mappedBy= "Vehiculo", cascade= CascadeType.PERSIST)        
    private List<Vehiculo> vehiculo;

    public Cliente(Long id_Cliente, String nombreCompleto, String rfc, String discapacidad, LocalDate fechaNacimiento, String telefono) {
        this.id_Cliente = id_Cliente;
        this.nombreCompleto = nombreCompleto;
        this.rfc = rfc;
        this.discapacidad = discapacidad;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public Cliente(String nombreCompleto, String rfc, String discapacidad, LocalDate fechaNacimiento, String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.rfc = rfc;
        this.discapacidad = discapacidad;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    public Long getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(Long id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public AdquiereLiciencia getAdquiereLiciencia() {
        return adquiereLiciencia;
    }

    public void setAdquiereLiciencia(AdquiereLiciencia adquiereLiciencia) {
        this.adquiereLiciencia = adquiereLiciencia;
    }

    public List<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(List<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }

    
    @Override
    public String toString() {
        return "entities.Cliente{" + "id_Cliente=" + id_Cliente + ", nombreCompleto=" + nombreCompleto + ", rfc=" + rfc + ", discapacidad=" + discapacidad + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + '}';
    }
    
    
    
}
