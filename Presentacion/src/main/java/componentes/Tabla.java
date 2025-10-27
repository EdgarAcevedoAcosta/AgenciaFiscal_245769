/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edgar
 */
public class Tabla {
    private String titulo;
    private DefaultTableModel modeloTabla;
    public Tabla() {
    }

    /**
     * Constructor que inicializa los atributos de la clase
     *
     * @param titulo Titulo de la tabla
     * @param modeloTabla Objeto TableModel con los datos de la tabla.
     */
    public Tabla(String titulo, DefaultTableModel modeloTabla) {
        this.titulo = titulo;
        this.modeloTabla = modeloTabla;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }
}
