/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.AdquiereLiciencia;
import entities.PlacasCosto;
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
public class PlacasCostosDAO implements IPlacasCostosDAO {
    private EntityManagerFactory managerFactory;

    public PlacasCostosDAO(EntityManagerFactory managerFactory) {
        this.managerFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPersist");
    }

    @Override
    public void agregar(PlacasCosto placasCostos) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(placasCostos);
        em.getTransaction().commit();
        System.out.println("Se agrego Adquiere Licencia");
    }

    @Override
    public void actualizar(Long idPlacaCost, PlacasCosto costoNueva) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        PlacasCosto adLic=em.find(PlacasCosto.class, idPlacaCost);
        if(adLic!=null){
            adLic.setCosto(costoNueva.getCosto());
            adLic.setEmpaca(costoNueva.getEmpaca());
            adLic.setTipoTramite(costoNueva.getTipoTramite());
            em.persist(adLic);
            
            System.out.println("Se actualizo correctamente");
        }
        em.getTransaction().commit();
    }

    @Override
    public PlacasCosto consultar(Long idPlacaCost) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        PlacasCosto adLic=em.find(PlacasCosto.class, idPlacaCost);
        em.getTransaction().commit();
        if(adLic==null){
            System.out.println("No se encontro el adquirir Licencia");
            return null;
        }else{
            return adLic;
        }
    }

    @Override
    public List<PlacasCosto> consultarTodas() {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cr= em.getCriteriaBuilder().createQuery();
        cr.select(cr.from(PlacasCosto.class));
        Query q=em.createQuery(cr);
        
        List<PlacasCosto> redes=q.getResultList();
        em.getTransaction().commit();
        return redes;
    }
    
}
