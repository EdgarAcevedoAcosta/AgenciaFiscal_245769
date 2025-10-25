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
    public void agregar(AdquiereLiciencia adquiereLicencia)throws SQLException;
    public void actualizar(Long id, AdquiereLiciencia adLicNueva)throws SQLException;
    public AdquiereLiciencia consultar(Long idAdLic)throws SQLException;
    public List<AdquiereLiciencia> consultarTodas()throws SQLException;
}
