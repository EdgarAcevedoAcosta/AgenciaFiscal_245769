/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.Automovil;

/**
 *
 * @author edgar
 */
public interface IAutomovilDAO {
    public void agregar(Automovil automovil);
    //public void actualizar(Automovil adLicVieja, Automovil adLicNueva);
    public void consultar(Long idAuto);
    public void consultarTodas();
}
