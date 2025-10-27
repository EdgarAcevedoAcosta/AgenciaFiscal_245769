/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persistencia;

import Dao.*;
import entities.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edgar
 */
public class Persistencia {

    public static void main(String[] args) {
        System.out.println("Pruebas de persistencia");
        //Vehiculos
        /*IVehiculosDAO persVeh=new VehiculosDAO();
        Vehiculo veh1=new Vehiculo();
        Vehiculo veh2=new Vehiculo();
        Vehiculo veh3=new Vehiculo();
        Vehiculo veh4=new Vehiculo();
        
        
        //CatalogoMarcaLinea
        ICatalogoMarcaLineaDAO persCatML=new CatalogoMarcaLineaDAO();
        CatalogoMarcaLinea CML1=new CatalogoMarcaLinea();
        CML1.setLinea("Corolla");
        CML1.setMarca("Toyota");
        CML1.setModelo("2024");
        //CML1.setVehiculo(veh1);
        CatalogoMarcaLinea CML2=new CatalogoMarcaLinea();
        CML2.setLinea("Golf");
        CML2.setMarca("Volkswagen");
        CML2.setModelo("GTI 2022");
        
        CatalogoMarcaLinea CML3=new CatalogoMarcaLinea();
        CML3.setLinea("Serie 3");
        CML3.setMarca("BMW");
        CML3.setModelo("330i 2024");
        
        veh1.setCatMarcaLinea(CML1);
        veh2.setCatMarcaLinea(CML1);
        veh3.setCatMarcaLinea(CML2);
        veh4.setCatMarcaLinea(CML3);
        */
        /*
        List<Vehiculo> listaVeh1=new ArrayList<Vehiculo>();
        listaVeh1.add(veh1);
        listaVeh1.add(veh2);
        List<Vehiculo> listaVeh2=new ArrayList<Vehiculo>();
        listaVeh2.add(veh3);
        List<Vehiculo> listaVeh3=new ArrayList<Vehiculo>();
        listaVeh3.add(veh4);
        
        IAutomovilDAO perA= new AutomovilDAO();
        Automovil aut=new Automovil();
        
        
        CML1.setVehiculos(listaVeh1);
        CML2.setVehiculos(listaVeh2);
        CML3.setVehiculos(listaVeh3);
        
        
        persVeh.agregar(veh1);
        persVeh.agregar(veh2);
        persVeh.agregar(veh3);
        persVeh.agregar(veh4);
        
        persCatML.agregar(CML1);
        persCatML.agregar(CML2);
        persCatML.agregar(CML3);
        
        */
        
        
        
        //new Dao.VehiculosDAO().agregar(veh1);
                
                
        //AutoMovil
        //Motocicleta
        //camion
        //LicenciaCostos
        /*ILicenciaCostos pers=new LicienciaCostosDAO();
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
        pers.agregar(LicC1);
        
        IAdquiereLicenciaDAO pers1 = new AdquiereLicenciaDAO();
        AdquiereLiciencia adL=new AdquiereLiciencia();
        */
        //PlcacaCostos
        //Cliente/*
        IClienteDAO peC=new ClienteDAO();
        Cliente cl1=new Cliente();
        cl1.setDiscapacidad("true");
        LocalDate fechan=LocalDate.parse("2004-01-26");
        cl1.setFechaNacimiento(fechan);
        cl1.setNombreCompleto("Edgar Alvaro Obregon");
        cl1.setTelefono("644-227-3820");
        cl1.setRfc("das56d4a65ds4");
        //List<Vehiculo> listaVeh1=new ArrayList<Vehiculo>();
        //cl1.setVehiculo(listaVeh1);
        //cl1.setAdquiereLiciencia(adquiereLiciencia);
        new Dao.ClienteDAO().agregar(cl1);
        //Emplaca
        //AdquiereLicencia
        
    }
}
