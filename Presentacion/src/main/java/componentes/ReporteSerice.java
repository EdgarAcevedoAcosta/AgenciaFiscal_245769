/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

import entities.*;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

/**
 *
 * @author edgar
 */
public class ReporteSerice {
    @PersistenceContext
    private EntityManager em;
    
    public void generarReporteClientes(String nombreCompleto, LocalDate fechaInicio, LocalDate fechaFin){
        List<Cliente> datos;
    }
    
    private List<Cliente> obtenerDatos(String nombreCompleto, LocalDate fechaInicio, LocalDate fechaFin){
        String jpql="SELECT new entities.Cliente("+ 
                "u.id_Cliente, u.nombreCompleto, u.rfc, u.fechaNacimiento, u.telefono, u.discapacidad "+
                "FROM Cliente u"+
                "WHERE(:nombreCompleto IS NULL OR u.nombreCompleto LIKE :nombreCompleto)"+
                "AND " + " )";
        //Cliente cliente=new Cliente();
        return null;
        
    }
}
