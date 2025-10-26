/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persistencia;

import Dao.*;
import entities.*;
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
        IVehiculosDAO persVeh=new VehiculosDAO();
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
        
        List<CatalogoMarcaLinea> listaCat=new ArrayList<CatalogoMarcaLinea>();
        listaCat.add(CML1);
        listaCat.add(CML2);
        listaCat.add(CML3);
        
        //new Dao.VehiculosDAO().agregar(veh1);
                
                
        //AutoMovil
        //Motocicleta
        //camion
        //LicenciaCostos
        //PlcacaCostos
        //Cliente
        //Emplaca
        //AdquiereLicencia
        
    }
}
