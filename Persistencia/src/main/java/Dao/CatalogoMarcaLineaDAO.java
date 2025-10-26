/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.AdquiereLiciencia;
import entities.CatalogoMarcaLinea;
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
public class CatalogoMarcaLineaDAO implements ICatalogoMarcaLineaDAO {
    private EntityManagerFactory managerFactory;

    public CatalogoMarcaLineaDAO(EntityManagerFactory managerFactory) {
        this.managerFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPersist");
    }
    
    @Override
    public void agregar(CatalogoMarcaLinea catalogoML) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(catalogoML);
        em.getTransaction().commit();
        System.out.println("Se agrego Adquiere Licencia");
    }

    @Override
    public CatalogoMarcaLinea consultar(Long idCML) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CatalogoMarcaLinea adLic=em.find(CatalogoMarcaLinea.class, idCML);
        em.getTransaction().commit();
        if(adLic==null){
            System.out.println("No se encontro el adquirir Licencia");
            return null;
        }else{
            return adLic;
        }
    }

    @Override
    public List<CatalogoMarcaLinea> consultarTodas() {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cr= em.getCriteriaBuilder().createQuery();
        cr.select(cr.from(CatalogoMarcaLinea.class));
        Query q=em.createQuery(cr);
        
        List<CatalogoMarcaLinea> redes=q.getResultList();
        em.getTransaction().commit();
        return redes;

    }
    
}
