/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import entities.Cliente;

/**
 *
 * @author edgar
 */
public interface IClienteDAO {
    public void agregar(Cliente cliente);
    public void actualizar(Cliente clienteViejo, Cliente clientecNuevo);
    public void consultar(Long idCliente);
    public void consultarTodos();
}
