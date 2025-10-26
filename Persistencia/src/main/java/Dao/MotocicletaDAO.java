/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.AdquiereLiciencia;
import entities.Motocicleta;
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
public class MotocicletaDAO implements IMotocicletaDAO {
    private EntityManagerFactory managerFactory;

    public MotocicletaDAO() {
        this.managerFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPersist");
    }
    
    @Override
    public void agregar(Motocicleta motocicleta) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(motocicleta);
        em.getTransaction().commit();
        System.out.println("Se agrego Adquiere Licencia");
    }

    @Override
    public Motocicleta consultar(Long idMoto) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        Motocicleta adLic=em.find(Motocicleta.class, idMoto);
        em.getTransaction().commit();
        if(adLic==null){
            System.out.println("No se encontro el adquirir Licencia");
            return null;
        }else{
            return adLic;
        }
    }

    @Override
    public List<Motocicleta> consultarTodas() {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cr= em.getCriteriaBuilder().createQuery();
        cr.select(cr.from(Motocicleta.class));
        Query q=em.createQuery(cr);
        
        List<Motocicleta> redes=q.getResultList();
        em.getTransaction().commit();
        return redes;
    }
    
}
