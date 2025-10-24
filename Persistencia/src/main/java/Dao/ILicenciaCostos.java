/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.LicenciaCostos;

/**
 *
 * @author edgar
 */
public interface ILicenciaCostos {
    public void agregar(LicenciaCostos liscenciaCosto);
    public void actualizar(LicenciaCostos costoViejo, LicenciaCostos costoNuevo);
    public void consultar(Long idLicenciaCosto);
    public void consultarTodas();
}
