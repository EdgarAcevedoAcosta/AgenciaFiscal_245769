/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.AdquiereLiciencia;
import entities.Automovil;
import entities.Camion;
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
public class CamionDAO implements ICamionDAO{
    private EntityManagerFactory managerFactory;

    public CamionDAO(EntityManagerFactory managerFactory) {
        this.managerFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPersist");
    }
    
    
    @Override
    public void agregar(Camion camion) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(camion);
        em.getTransaction().commit();
        System.out.println("Se agrego Adquiere Licencia");
    }

    /*@Override
    public void actualizar(Long id, Camion CamionNuev) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

    @Override
    public Camion consultar(Long idCamion) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        Camion adLic=em.find(Camion.class, idCamion);
        em.getTransaction().commit();
        if(adLic==null){
            System.out.println("No se encontro el automovil");
            return null;
        }else{
            return adLic;
        }
    }

    @Override
    public List<Camion> consultarTodas() {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cr= em.getCriteriaBuilder().createQuery();
        cr.select(cr.from(Camion.class));
        Query q=em.createQuery(cr);
        
        List<Camion> redes=q.getResultList();
        em.getTransaction().commit();
        return redes;
    }
}
