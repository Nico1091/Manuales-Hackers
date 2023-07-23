/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.impresora;

/**
 *
 * @author Nico
 */
public class Tinta {
    private int tintacolor;
    private int tintanegra;

    public Tinta() {
        this.tintacolor = 0;
        this.tintanegra = 0;
    }

    public int getTintacolor() {
        return tintacolor;
    }

    public int getTintanegra() {
        return tintanegra;
    }

    public void setTintacolor(int tintacolor) {
        this.tintacolor = tintacolor;
    }

    public void setTintanegra(int tintanegra) {
        this.tintanegra = tintanegra;
    }
    
    
}
