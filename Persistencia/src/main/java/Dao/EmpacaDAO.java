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
public class EmpacaDAO implements IEmplacaDAO{
    private EntityManagerFactory managerFactory;

    public EmpacaDAO() {
        this.managerFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPersist");
    }

    @Override
    public void agregar(Empaca emplaca) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(emplaca);
        em.getTransaction().commit();
        System.out.println("Se agrego Adquiere Licencia");
    }

    @Override
    public void actualizar(Long idEmplaca, Empaca adLicNueva) {
EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        Empaca adLic=em.find(Empaca.class, idEmplaca);
        if(adLic!=null){
            adLic.setCostoTotal(adLicNueva.getCostoTotal());
            adLic.setEstado(adLicNueva.getEstado());
            adLic.setFechaEmision(adLicNueva.getFechaEmision());
            adLic.setFechaRecepcion(adLicNueva.getFechaRecepcion());
            adLic.setNombrePlaca(adLicNueva.getNombrePlaca());
            adLic.setAutomovil(adLicNueva.getAutomovil());
            adLic.setPlacasCosto(adLicNueva.getPlacasCosto());
            
            em.persist(adLic);
            
            System.out.println("Se actualizo correctamente");
        }
        em.getTransaction().commit();
    }

    @Override
    public void cambiarEstado(Long idEmplaca) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        Empaca adLic=em.find(Empaca.class, idEmplaca);
        if(adLic==null){
            System.out.println("No se encontro el la placa comprada");
            
        }else{
            System.out.println("Este metodo solo se va a Usar Para la desactivación de alguna Placa");
            System.out.println("Se cambio el Estado de la Placa");
            if(adLic.getEstado()=="Activo"){
                adLic.setEstado("Inactivo");
                em.persist(adLic);
            }else{
                System.out.println("Esta Placa ya Esta Inactiva");
            }

        }
        em.getTransaction().commit();
    }

    @Override
    public Empaca consultar(Long idEmplaca) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        Empaca adLic=em.find(Empaca.class, idEmplaca);
        em.getTransaction().commit();
        if(adLic==null){
            System.out.println("No se encontro el adquirir Licencia");
            return null;
        }else{
            return adLic;
        }    
    }

    @Override
    public List<Empaca> consultarTodas() {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cr= em.getCriteriaBuilder().createQuery();
        cr.select(cr.from(Empaca.class));
        Query q=em.createQuery(cr);
        
        List<Empaca> redes=q.getResultList();
        em.getTransaction().commit();
        return redes;
    }
    
    public List<Empaca> consultarAutomoviles(List<Automovil> automovil) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder cb=em.getCriteriaBuilder();
        CriteriaQuery<Empaca> cq= cb.createQuery(Empaca.class);
        Root<Empaca> root=cq.from(Empaca.class);
        
        cq.select(root).where(cb.equal(root.get("empaca"), automovil)).orderBy(cb.asc(root.get("empaca")));
        List<Empaca> resultado=em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        if(resultado==null){
            System.out.println("No se encontro el el Auto Emplacado");
            return null;
        }else{
            return resultado;
        } 
    }
    
    public Empaca consultaNombre(String nombre){
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder cb=em.getCriteriaBuilder();
        CriteriaQuery<Empaca> cq= cb.createQuery(Empaca.class);
        Root<Empaca> root=cq.from(Empaca.class);
        
        cq.select(root).where(cb.equal(root.get("nombrePlaca"), nombre)).orderBy(cb.asc(root.get("nombrePlaca")));
        Empaca resultado=em.createQuery(cq).getSingleResult();
        em.getTransaction().commit();
        if(resultado==null){
            System.out.println("No se encontro el la placa");
            return null;
        }else{
            return resultado;
        } 
    }
    
    
    
}
