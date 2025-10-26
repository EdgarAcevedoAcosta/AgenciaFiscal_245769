/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.CatalogoMarcaLinea;
import entities.Empaca;
import java.util.List;

/**
 *
 * @author edgar
 */
public interface IEmplacaDAO {
    public void agregar(Empaca emplaca);
    public void actualizar(Long idEmplaca, Empaca adLicNueva);
    public void cambiarEstado(Long idEmplaca);
    public Empaca consultar(Long idEmplaca);
    public List<Empaca> consultarTodas();
}
