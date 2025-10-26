/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.Cliente;
import java.util.List;

/**
 *
 * @author edgar
 */
public interface IClienteDAO {
    public void agregar(Cliente cliente);
    public void actualizar(Long idCliente, Cliente clientecNuevo);
    public Cliente consultar(Long idCliente);
    public List<Cliente> consultarTodos();
}
