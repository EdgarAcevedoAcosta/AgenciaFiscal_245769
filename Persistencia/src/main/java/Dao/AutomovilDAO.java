/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.AdquiereLiciencia;
import entities.Automovil;
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
public class AutomovilDAO implements IAutomovilDAO{
    private EntityManagerFactory managerFactory;

    public AutomovilDAO(EntityManagerFactory managerFactory) {
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
    
}
