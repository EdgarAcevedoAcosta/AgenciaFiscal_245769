/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.AdquiereLiciencia;
import entities.LicenciaCostos;
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
public class LicienciaCostosDAO implements ILicenciaCostos {
    private EntityManagerFactory managerFactory;

    public LicienciaCostosDAO(EntityManagerFactory managerFactory) {
        this.managerFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPersist");
    }
    
    
    @Override
    public void agregar(LicenciaCostos liscenciaCosto) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(liscenciaCosto);
        em.getTransaction().commit();
        System.out.println("Se agrego Adquiere Licencia");
    }

    @Override
    public void actualizar(Long idLicenciaCosto, LicenciaCostos costoNuevo) {   
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        LicenciaCostos adLic=em.find(LicenciaCostos.class, idLicenciaCosto);
        if(adLic!=null){
            adLic.setAñosVigencia(costoNuevo.getAñosVigencia());
            adLic.setCosto(costoNuevo.getCosto());
            adLic.setAdquiereLiciencia(costoNuevo.getAdquiereLiciencia());
            em.persist(adLic);
            
            System.out.println("Se actualizo correctamente");
        }
        em.getTransaction().commit();
    }

    @Override
    public LicenciaCostos consultar(Long idLicenciaCosto) {
EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        LicenciaCostos adLic=em.find(LicenciaCostos.class, idLicenciaCosto);
        em.getTransaction().commit();
        if(adLic==null){
            System.out.println("No se encontro el adquirir Licencia");
            return null;
        }else{
            return adLic;
        }
    }

    @Override
    public List<LicenciaCostos> consultarTodas() {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cr= em.getCriteriaBuilder().createQuery();
        cr.select(cr.from(LicenciaCostos.class));
        Query q=em.createQuery(cr);
        
        List<LicenciaCostos> redes=q.getResultList();
        em.getTransaction().commit();
        return redes;
    }
    
}
