/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.PlacasCosto;
import java.util.List;

/**
 *
 * @author edgar
 */
public interface IPlacasCostosDAO {
    public void agregar(PlacasCosto placasCostos);
    public void actualizar(Long idPlacaCost, PlacasCosto costoNueva);
    public PlacasCosto consultar(Long idPlacaCost);
    public List<PlacasCosto> consultarTodas();
}
