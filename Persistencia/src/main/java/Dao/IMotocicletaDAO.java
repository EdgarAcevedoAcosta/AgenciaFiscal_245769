/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.Motocicleta;
import java.util.List;

/**
 *
 * @author edgar
 */
public interface IMotocicletaDAO {
    public void agregar(Motocicleta motocicleta);
    //public void actualizar(Motocicleta adLicVieja, Motocicleta adLicNueva);
    public Motocicleta consultar(Long idMoto);
    public List<Motocicleta> consultarTodas();
}
