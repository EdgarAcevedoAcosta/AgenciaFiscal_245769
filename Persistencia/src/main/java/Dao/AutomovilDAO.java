/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.AdquiereLiciencia;
import entities.Automovil;
import entities.Cliente;
import entities.Empaca;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author edgar
 */
public class AutomovilDAO implements IAutomovilDAO{
    private EntityManagerFactory managerFactory;

    public AutomovilDAO() {
        this.managerFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPersist");
    }
    
    @Override
    public void agregar(Automovil automovil) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(automovil);
        em.getTransaction().commit();
        System.out.println("Se agrego Adquiere Licencia");
    }

    @Override
    public Automovil consultar(Long idAuto) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        Automovil adLic=em.find(Automovil.class, idAuto);
        
        em.getTransaction().commit();
        if(adLic==null){
            System.out.println("No se encontro el automovil");
            return null;
        }else{
            return adLic;
        }
    }

    @Override
    public List<Automovil> consultarTodas() {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cr= em.getCriteriaBuilder().createQuery();
        cr.select(cr.from(Automovil.class));
        Query q=em.createQuery(cr);
        
        List<Automovil> redes=q.getResultList();
        em.getTransaction().commit();
        return redes;
    }
    
    public Automovil consultaNumeroSerie(String numeroSerie){
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder cb=em.getCriteriaBuilder();
        CriteriaQuery<Automovil> cq= cb.createQuery(Automovil.class);
        Root<Automovil> root=cq.from(Automovil.class);
        
        cq.select(root).where(cb.equal(root.get("numeroSerie"), numeroSerie)).orderBy(cb.asc(root.get("numeroSerie")));
        Automovil resultado=em.createQuery(cq).getSingleResult();
        em.getTransaction().commit();
        if(resultado==null){
            System.out.println("No se encontro el Automovil");
            return null;
        }else{
            return resultado;
        } 
    }
    public List<Automovil> consultaClientesAd(List<Cliente> cliente){
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder cb=em.getCriteriaBuilder();
        CriteriaQuery<Automovil> cq= cb.createQuery(Automovil.class);
        Root<Automovil> root=cq.from(Automovil.class);
        
        cq.select(root).where(cb.equal(root.get("id_Cliente"), cliente)).orderBy(cb.asc(root.get("id_Cliente")));
        List<Automovil> resultado=em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        if(resultado==null){
            System.out.println("No se encontro el Automovil");
            return null;
        }else{
            return resultado;
        } 
    }
    
    public List<Automovil> consultaClientesId(Cliente cliente){
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder cb=em.getCriteriaBuilder();
        CriteriaQuery<Automovil> cq= cb.createQuery(Automovil.class);
        Root<Automovil> root=cq.from(Automovil.class);
        
        cq.select(root).where(cb.equal(root.get("id_Cliente"), cliente.getId_Cliente())).orderBy(cb.asc(root.get("id_Cliente")));
        List<Automovil> resultado=em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        if(resultado==null){
            System.out.println("No se encontro el Automovil");
            return null;
        }else{
            return resultado;
        } 
    }
    
    
    public Automovil consultaEmplalca(Empaca cliente){
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder cb=em.getCriteriaBuilder();
        CriteriaQuery<Automovil> cq= cb.createQuery(Automovil.class);
        Root<Automovil> root=cq.from(Automovil.class);
        
        cq.select(root).where(cb.equal(root.get("id_Placa"), cliente)).orderBy(cb.asc(root.get("id_Placa")));
        Automovil resultado=em.createQuery(cq).getSingleResult();
        em.getTransaction().commit();
        if(resultado==null){
            System.out.println("No se encontro el Automovil");
            return null;
        }else{
            return resultado;
        } 
    }
}
