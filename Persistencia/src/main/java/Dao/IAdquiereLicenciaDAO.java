/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.AdquiereLiciencia;
import java.sql.SQLException;

/**
 *
 * @author edgar
 */
public interface IAdquiereLicenciaDAO {
    public void agregar(AdquiereLiciencia adquiereLicencia)throws SQLException;
    public void actualizar(AdquiereLiciencia adLicVieja, AdquiereLiciencia adLicNueva)throws SQLException;
    public void consultar(Long idAdLic)throws SQLException;
    public void consultarTodas()throws SQLException;
}
