/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.Empaca;

/**
 *
 * @author edgar
 */
public interface IEmplacaDAO {
    public void agregar(Empaca emplaca);
    public void actualizar(Empaca adLicVieja, Empaca adLicNueva);
    public void cambiarEstado(Empaca empaca);
    public void consultar(Long idEmplaca);
    public void consultarTodas();
}
