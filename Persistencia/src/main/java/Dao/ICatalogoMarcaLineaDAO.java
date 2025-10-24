/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.CatalogoMarcaLinea;

/**
 *
 * @author edgar
 */
public interface ICatalogoMarcaLineaDAO {
    public void agregar(CatalogoMarcaLinea catalogoML);
    //public void actualizar(CatalogoMarcaLinea adLicVieja, CatalogoMarcaLinea adLicNueva);
    public void consultar(Long idCML);
    public void consultarTodas();
}
