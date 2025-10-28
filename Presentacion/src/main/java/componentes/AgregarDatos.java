/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

import entities.*;
import java.time.LocalDate;

/**
 *
 * @author edgar
 */
public class AgregarDatos {
    public AgregarDatos() {
        //AgregarClietes();
        //AgregarCostosPlacas();
        //AgregarCostosLicencias();
        //AgregarLicencias();
        //AgregarAutomoviles();
        //AgregarCatalogoMarcasLineas();
        //AgregarEmplaca();
        
        
    }
    public void AgregarClietes(){
        Cliente cliente1 =new Cliente();
        cliente1.setNombreCompleto("Edgar Arturo Acevedo");
        LocalDate fechaNacimiento= LocalDate.parse("2004-01-26");
        cliente1.setFechaNacimiento(fechaNacimiento);
        cliente1.setRfc("VBLE560223SM0");
        cliente1.setDiscapacidad("false");
        cliente1.setTelefono("6442273820");
        new Dao.ClienteDAO().agregar(cliente1);
    }
    public void AgregarCostosPlacas(){
        PlacasCosto pc=new PlacasCosto();
        pc.setTipoTramite("Auto Nuevo");
        pc.setCosto(1500.00);
        PlacasCosto pcs=new PlacasCosto();
        pcs.setTipoTramite("Auto Nuevo");
        pcs.setCosto(1000.00);
        
        new Dao.PlacasCostosDAO().agregar(pc);
        new Dao.PlacasCostosDAO().agregar(pcs);
        
    }
    public void AgregarCostosLicencias(){
         LicenciaCostos LicC1 =new LicenciaCostos();
        LicenciaCostos LicC2 =new LicenciaCostos();
        LicenciaCostos LicC3 =new LicenciaCostos();
        LicenciaCostos LicC4 =new LicenciaCostos();
        LicenciaCostos LicC5 =new LicenciaCostos();
        LicenciaCostos LicC6 =new LicenciaCostos();
        
        LicC1.setAñosVigencia(1);
        LicC1.setCosto(600.00);
        LicC2.setAñosVigencia(1);
        LicC2.setCosto(200.00);
        
        LicC3.setAñosVigencia(2);
        LicC3.setCosto(900.00);
        LicC4.setAñosVigencia(2);
        LicC4.setCosto(500.00);
        
        LicC5.setAñosVigencia(3);
        LicC5.setCosto(1100.00);
        
        LicC6.setAñosVigencia(3);
        LicC6.setCosto(700.00);
        LicC1.setAdquiereLiciencia(null);
        new Dao.LicienciaCostosDAO().agregar(LicC1);
        new Dao.LicienciaCostosDAO().agregar(LicC2);
        new Dao.LicienciaCostosDAO().agregar(LicC3);
        new Dao.LicienciaCostosDAO().agregar(LicC4);
        new Dao.LicienciaCostosDAO().agregar(LicC5);
        new Dao.LicienciaCostosDAO().agregar(LicC6);
        
        //LicenciaCostos
    }
    public void AgregarLicencias(){
        AdquiereLiciencia ad=new AdquiereLiciencia();
        //deberia poner
        ad.setCliente(new Dao.ClienteDAO().consultarTodos());
        LocalDate fechaCompra= LocalDate.parse("2010-07-15");
        LocalDate fechaE= LocalDate.parse("2011-07-15");
        ad.setFechaCompra(fechaCompra);
        ad.setFechaExpiración(fechaE);
        ad.setVigencia(new Dao.AdquiereLicenciaDAO().consultar(Long.valueOf(1)).getVigencia());
        ad.setLicenciaCostos(new Dao.LicienciaCostosDAO().consultarTodas());
        ad.setCostoTotal(new Dao.LicienciaCostosDAO().consultar(Long.valueOf(1)).getCosto());
        new Dao.AdquiereLicenciaDAO().agregar(ad);
        
        Cliente cl=new Dao.ClienteDAO().consultar(Long.valueOf(1));
        cl.setAdquiereLicienciaCliente(ad);
        new Dao.ClienteDAO().actualizar(Long.valueOf(1), cl);
    }
    public void AgregarAutomoviles(){
        Automovil au= new Automovil();
        au.setColor("Negro");
        au.setNumeroSerie("ADS-456");
        au.setCatalogoMarcaLinea(new Dao.CatalogoMarcaLineaDAO().consultaCatalogo("Toyota", "Deportivo", "Supre"));
        au.setCliente(new Dao.ClienteDAO().consultar(Long.valueOf(1)));
        
        new Dao.AutomovilDAO().agregar(au);
        
    }
    public void AgregarCatalogoMarcasLineas(){
        CatalogoMarcaLinea cat1=new CatalogoMarcaLinea();
        cat1.setMarca("Toyota");
        cat1.setLinea("Sedanes");
        cat1.setModelo("Corrolla");
        new Dao.CatalogoMarcaLineaDAO().agregar(cat1);
        CatalogoMarcaLinea cat2=new CatalogoMarcaLinea();
        cat2.setMarca("Toyota");
        cat2.setLinea("Sedanes");
        cat2.setModelo("Camry");
        new Dao.CatalogoMarcaLineaDAO().agregar(cat2);
        CatalogoMarcaLinea cat3=new CatalogoMarcaLinea();
        cat3.setMarca("Toyota");
        cat3.setLinea("Deportivos");
        cat3.setModelo("GR86");
        new Dao.CatalogoMarcaLineaDAO().agregar(cat3);
        CatalogoMarcaLinea cat4=new CatalogoMarcaLinea();
        cat4.setMarca("Toyota");
        cat4.setLinea("Deportivos");
        cat4.setModelo("Supra");
        new Dao.CatalogoMarcaLineaDAO().agregar(cat4);
    }
    public void AgregarEmplaca(){
        Empaca emplaca=new Empaca();
        emplaca.setCostoTotal(new Dao.PlacasCostosDAO().consultar(Long.valueOf(1)).getCosto());
        emplaca.setEstado("Activo");
        LocalDate fechaCompra= LocalDate.parse("2010-07-15");
        LocalDate fechaE= LocalDate.parse("2011-07-15");
        emplaca.setFechaEmision(fechaCompra);
        emplaca.setFechaRecepcion(fechaE);
        emplaca.setNombrePlaca("FASF-987");
        //validacion de lista de un solo id
        emplaca.setPlacasCosto(new Dao.PlacasCostosDAO().consultarTodas());
        
        
    }
    
}
