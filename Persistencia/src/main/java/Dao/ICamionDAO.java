/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.Camion;

/**
 *
 * @author edgar
 */
public interface ICamionDAO {
    public void agregar(Camion camion);
    public void actualizar(Camion camionViej, Camion CamionNuev);
    public void consultar(Long idCamion);
    public void consultarTodas();
}
