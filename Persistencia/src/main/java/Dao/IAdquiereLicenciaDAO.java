/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.AdquiereLiciencia;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author edgar
 */
public interface IAdquiereLicenciaDAO {
    public void agregar(AdquiereLiciencia adquiereLicencia);
    public void actualizar(Long id, AdquiereLiciencia adLicNueva);
    public AdquiereLiciencia consultar(Long idAdLic);
    public List<AdquiereLiciencia> consultarTodas();
}
