/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.AdquiereLiciencia;
import entities.CatalogoMarcaLinea;
import entities.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author edgar
 */
public class ClienteDAO implements IClienteDAO {
    private EntityManagerFactory managerFactory;

    public ClienteDAO() {
        this.managerFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPersist");
    }
    
    @Override
    public void agregar(Cliente cliente) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        System.out.println("Se agrego el clienete");
    }

    @Override
    public void actualizar(Long idCliente, Cliente clientecNuevo) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        Cliente adLic=em.find(Cliente.class, idCliente);
        if(adLic!=null){
            adLic.setDiscapacidad(clientecNuevo.getDiscapacidad());
            adLic.setFechaNacimiento(clientecNuevo.getFechaNacimiento());
            adLic.setNombreCompleto(clientecNuevo.getNombreCompleto());
            adLic.setRfc(clientecNuevo.getRfc());
            adLic.setTelefono(clientecNuevo.getTelefono());
            adLic.setAdquiereLicienciaCliente(clientecNuevo.getAdquiereLicienciaCliente());
            adLic.setVehiculo(clientecNuevo.getVehiculo());
            em.persist(adLic);
            
            System.out.println("Se actualizo correctamente");
        }
        em.getTransaction().commit();
    }

    @Override
    public Cliente consultar(Long idCliente) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        Cliente adLic=em.find(Cliente.class, idCliente);
        em.getTransaction().commit();
        if(adLic==null){
            System.out.println("No se encontro el adquirir Licencia");
            return null;
        }else{
            return adLic;
        }    }

    @Override
    public List<Cliente> consultarTodos() {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cr= em.getCriteriaBuilder().createQuery();
        cr.select(cr.from(Cliente.class));
        Query q=em.createQuery(cr);
        
        List<Cliente> redes=q.getResultList();
        em.getTransaction().commit();
        return redes;    
    }
    
}
