/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

import entities.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edgar
 */
public class Convertidor {
    //String nombresColumnaTablaCostosPlacas[]={"Tramite", "Costo Normal"};
    //String nombresColumnaTablaCostosLicencias[]={"Vigencia", "Costo Normal", "Costo por Discapacidad"};
    String nombresColumnaTablaMarcasAuto[]={"id_CatalogoMarcaLinea", "Marca", "Linea","Modelo"};
    String nombresColumnaTablaCliente[]={"id_Cliente", "Nombre Completo", "RFC","Fecha de Nacimiento","Telefono","Discapacidad"};
    String nombresColumnaTablaAutos[]={"id_Vehiculo", "Numero de Serie", "Color", "Estado", "Nombre Placa"};
    String nombresColumnaTablaAdquiereLic[]={"id_Licencia", "Vigencia", "Fecha de Compra","Fecha de Expiracion","Costo Total", "Total Gastado"};
    String nombresColumnaTablaEmplaca[]={"id_Placa",  "Nombre de Placa", "Fecha de Emision","Fecha de Recepcion","Estado", "Costo Total"};
        
    public DefaultTableModel CatalogoMarcaLineaTableModel(List<CatalogoMarcaLinea> listaMarcaLinea) {
        Object tabla[][];
        if (listaMarcaLinea != null) {
            tabla = new Object[listaMarcaLinea.size()][4];
            for (int i = 0; i < listaMarcaLinea.size(); i++) {
                // Obten una medico de la lista de medicos
                CatalogoMarcaLinea catalogo = listaMarcaLinea.get(i);
                // Almacena sus atributos en la fila del arreglo

                tabla[i][0] = catalogo.getId_CatalogoMarcaLinea();
                tabla[i][1] = catalogo.getMarca();
                tabla[i][2] = catalogo.getLinea();
                tabla[i][3] = catalogo.getModelo();

            }
            return new DefaultTableModel(tabla, nombresColumnaTablaMarcasAuto);
        }
        return null;
    }
    
    public DefaultTableModel ClienteTableModel(List<Cliente> listaClientes) {
        Object tabla[][];
        if (listaClientes != null) {
            tabla = new Object[listaClientes.size()][6];
            for (int i = 0; i < listaClientes.size(); i++) {
                // Obten una medico de la lista de medicos
                Cliente catalogo = listaClientes.get(i);
                // Almacena sus atributos en la fila del arreglo

                tabla[i][0] = catalogo.getId_Cliente();
                tabla[i][1] = catalogo.getNombreCompleto();
                tabla[i][2] = catalogo.getRfc();
                tabla[i][3] = catalogo.getFechaNacimiento();
                tabla[i][4] = catalogo.getTelefono();
                tabla[i][5] = catalogo.getDiscapacidad();

            }
            return new DefaultTableModel(tabla, nombresColumnaTablaCliente);
        }
        return null;
    }
    
    public DefaultTableModel AutomovilTableModel(List<Automovil> listaAutos) {
        Object tabla[][];
        if (listaAutos != null) {
            tabla = new Object[listaAutos.size()][5];
            for (int i = 0; i < listaAutos.size(); i++) {
                // Obten una medico de la lista de medicos
                Automovil catalogo = listaAutos.get(i);
                // Almacena sus atributos en la fila del arreglo

                tabla[i][0] = catalogo.getId_Vehiculo();
                tabla[i][1] = catalogo.getNumeroSerie();
                tabla[i][2] = catalogo.getColor();
                tabla[i][3] = catalogo.getEmpaca().getEstado();
                tabla[i][4] = catalogo.getEmpaca().getNombrePlaca();

            }
            return new DefaultTableModel(tabla, nombresColumnaTablaAutos);
        }
        return null;
    }
    
    public DefaultTableModel AquiereLicenTableModel(List<AdquiereLiciencia> listaAutos) {
        Object tabla[][];
        if (listaAutos != null) {
            tabla = new Object[listaAutos.size()][5];
            double total=0.0;
            for (int i = 0; i < listaAutos.size(); i++) {
                // Obten una medico de la lista de medicos
                
                AdquiereLiciencia catalogo = listaAutos.get(i);
                // Almacena sus atributos en la fila del arreglo
                total=total +catalogo.getCostoTotal();
                tabla[i][0] = catalogo.getId_Licencia();
                tabla[i][1] = catalogo.getVigencia()+" Años";
                tabla[i][2] = catalogo.getFechaCompra();
                tabla[i][3] = catalogo.getCostoTotal();
                tabla[i][4] = total;

            }
            return new DefaultTableModel(tabla, nombresColumnaTablaAdquiereLic);
        }
        return null;
    }
    
    public DefaultTableModel EmplacaTableModel(List<Empaca> listaAutos) {
        Object tabla[][];
        if (listaAutos != null) {
            tabla = new Object[listaAutos.size()][6];
          
            for (int i = 0; i < listaAutos.size(); i++) {
                // Obten una medico de la lista de medicos
                
                Empaca catalogo = listaAutos.get(i);
                // Almacena sus atributos en la fila del arreglo
               
                tabla[i][0] = catalogo.getId_Placa();
                tabla[i][1] = catalogo.getNombrePlaca();
                tabla[i][2] = catalogo.getFechaEmision();
                tabla[i][3] = catalogo.getFechaRecepcion();
                tabla[i][4] = catalogo.getEstado();
                tabla[i][5] = catalogo.getCostoTotal();

            }
            return new DefaultTableModel(tabla, nombresColumnaTablaEmplaca);
        }
        return null;
    }
}
