
package com.mycompany.impresora;

import com.mycompany.impresora.Tinta;
import com.mycompany.impresora.Tinta;

/**
 *
 * @author Nico
 */
public class Impresorallamados {
     // Atributos
    private int hojas;
    private int impresionespendientescolor;
    private int impresionespendientesnegro;
    private Tinta tinta;
    //constructor
    public Impresorallamados(){
        hojas = 0;
        impresionespendientescolor = 0;
        impresionespendientesnegro=0;
        tinta = new Tinta();
        
    }
    

    public int getImpresionespendientescolor() {
        return impresionespendientescolor;
    }

    public int getImpresionespendientesnegro() {
        return impresionespendientesnegro;
    }

    public Tinta getTinta() {
        return tinta;
    }

    public void setHojas(int hojas) {
        this.hojas = hojas;
    }

    public void setImpresionespendientescolor(int impresionespendientescolor) {
        this.impresionespendientescolor = impresionespendientescolor;
    }

    public void setImpresionespendientesnegro(int impresionespendientesnegro) {
        this.impresionespendientesnegro = impresionespendientesnegro;
    }

    public void setTinta(Tinta tinta) {
        this.tinta = tinta;
    }
    public void recargarhojas(int hojasacargar){
        this.hojas+=hojasacargar;
     
    }

    }

    
    

