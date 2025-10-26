/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.Vehiculo;
import java.util.List;

/**
 *
 * @author edgar
 */
public interface IVehiculosDAO {
    public void agregar(Vehiculo vehiculo);
    //public void actualizar(Vehiculo adLicVieja, Vehiculo adLicNueva);
    public Vehiculo consultar(Long idAdLic);
    public List<Vehiculo> consultarTodas();
}
