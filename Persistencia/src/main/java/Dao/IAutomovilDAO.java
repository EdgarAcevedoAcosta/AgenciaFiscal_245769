/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.AdquiereLiciencia;
import entities.Automovil;
import java.util.List;

/**
 *
 * @author edgar
 */
public interface IAutomovilDAO {
    public void agregar(Automovil automovil);
    //public void actualizar(Automovil adLicVieja, Automovil adLicNueva);
    public Automovil consultar(Long idAuto);
    public List<Automovil> consultarTodas();
}
