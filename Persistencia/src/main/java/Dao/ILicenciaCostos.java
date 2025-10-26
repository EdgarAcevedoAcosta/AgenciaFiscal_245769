/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.LicenciaCostos;
import java.util.List;

/**
 *
 * @author edgar
 */
public interface ILicenciaCostos {
    public void agregar(LicenciaCostos liscenciaCosto);
    public void actualizar(Long idLicenciaCosto, LicenciaCostos costoNuevo);
    public LicenciaCostos consultar(Long idLicenciaCosto);
    public List<LicenciaCostos> consultarTodas();
}
