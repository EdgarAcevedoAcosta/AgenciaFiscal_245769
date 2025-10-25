/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.Camion;
import java.util.List;

/**
 *
 * @author edgar
 */
public interface ICamionDAO {
    public void agregar(Camion camion);
    //public void actualizar(Long id, Camion CamionNuev);
    public Camion consultar(Long idCamion);
    public List<Camion> consultarTodas();
}
