/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.util.List;

/**
 *
 * @author admin
 */
public class SLCiudad {
    private String nombre;
    private List<SLAcademia> listaAcademia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<SLAcademia> getListaAcademia() {
        return listaAcademia;
    }

    public void setListaAcademia(List<SLAcademia> listaAcademia) {
        this.listaAcademia = listaAcademia;
    }
    
    
}
