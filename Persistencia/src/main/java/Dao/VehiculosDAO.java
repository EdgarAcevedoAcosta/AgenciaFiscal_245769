/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entities.AdquiereLiciencia;
import entities.Automovil;
import entities.Cliente;
import entities.Vehiculo;
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
public class VehiculosDAO implements IVehiculosDAO {
    private EntityManagerFactory managerFactory;

    public VehiculosDAO() {
        this.managerFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPersist");
    }

    @Override
    public void agregar(Vehiculo vehiculo) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(vehiculo);
        em.getTransaction().commit();
        System.out.println("Se agrego Vehiculo");
    }

    @Override
    public Vehiculo consultar(Long idAdLic) {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        Vehiculo adLic=em.find(Vehiculo.class, idAdLic);
        em.getTransaction().commit();
        if(adLic==null){
            System.out.println("No se encontro el Vehiculo");
            return null;
        }else{
            return adLic;
        }
    }

    @Override
    public List<Vehiculo> consultarTodas() {
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cr= em.getCriteriaBuilder().createQuery();
        cr.select(cr.from(Vehiculo.class));
        Query q=em.createQuery(cr);
        
        List<Vehiculo> redes=q.getResultList();
        em.getTransaction().commit();
        return redes;
    }
    
    public List<Vehiculo> consultaClientesId(Cliente cliente){
        EntityManager em = managerFactory.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder cb=em.getCriteriaBuilder();
        CriteriaQuery<Vehiculo> cq= cb.createQuery(Vehiculo.class);
        Root<Vehiculo> root=cq.from(Vehiculo.class);
        
        cq.select(root).where(cb.equal(root.get("id_Cliente"), cliente)).orderBy(cb.asc(root.get("id_Cliente")));
        List<Vehiculo> resultado=em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        if(resultado==null){
            System.out.println("No se encontro el Automovil");
            return null;
        }else{
            return resultado;
        } 
    }
    
}
