/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.AdquiereLiciencia;
import java.sql.SQLException;
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
public class AdquiereLicenciaDAO implements IAdquiereLicenciaDAO{
    private EntityManagerFactory managerFactory;

    public AdquiereLicenciaDAO() {
        this.managerFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPersist");
    }
    
    @Override
    public void agregar(AdquiereLiciencia adquiereLicencia) throws SQLException {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(adquiereLicencia);
        em.getTransaction().commit();
        System.out.println("Se agrego Adquiere Licencia");
    }

    @Override
    public void actualizar(Long id, AdquiereLiciencia adLicNueva) throws SQLException {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        AdquiereLiciencia adLic=em.find(AdquiereLiciencia.class, id);
        if(adLic!=null){
            adLic.setCostoTotal(adLicNueva.getCostoTotal());
            adLic.setFechaCompra(adLicNueva.getFechaCompra());
            adLic.setFechaExpiración(adLicNueva.getFechaExpiración());
            adLic.setLicenciaCostos(adLicNueva.getLicenciaCostos());
            adLic.setVigencia(adLicNueva.getVigencia());
            em.persist(adLic);
            
            System.out.println("Se actualizo correctamente");
        }
        em.getTransaction().commit();
    }

    @Override
    public AdquiereLiciencia consultar(Long idAdLic) throws SQLException {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        AdquiereLiciencia adLic=em.find(AdquiereLiciencia.class, idAdLic);
        em.getTransaction().commit();
        if(adLic==null){
            System.out.println("No se encontro el adquirir Licencia");
            return null;
        }else{
            return adLic;
        }
    }

    @Override
    public List<AdquiereLiciencia> consultarTodas() throws SQLException {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cr= em.getCriteriaBuilder().createQuery();
        cr.select(cr.from(AdquiereLiciencia.class));
        Query q=em.createQuery(cr);
        
        List<AdquiereLiciencia> redes=q.getResultList();
        em.getTransaction().commit();
        return redes;

    }
    
}
