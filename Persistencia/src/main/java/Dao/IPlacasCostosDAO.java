/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.PlacasCosto;

/**
 *
 * @author edgar
 */
public interface IPlacasCostosDAO {
    public void agregar(PlacasCosto placasCostos);
    public void actualizar(PlacasCosto costoViejo, PlacasCosto costoNueva);
    public void consultar(Long idPlacaCost);
    public void consultarTodas();
}
