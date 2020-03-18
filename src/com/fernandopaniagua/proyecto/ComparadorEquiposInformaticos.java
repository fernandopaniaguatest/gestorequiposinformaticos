package com.fernandopaniagua.proyecto;

import java.util.Comparator;

/**
 * Implementación de la interface Comparator<br>
 * Compara dos <b>equipos informáticos</b> de la siguiente manera ...
 * ... integrando un <a href="https://es.wikipedia.org/wiki/Sistema_global_para_las_comunicaciones_m%C3%B3viles">GSM</a> bla, bla ...
 * 
 * @since 1.0
 * @version 1.1
 * @author FPA
 */
public class ComparadorEquiposInformaticos implements Comparator<EquipoInformatico> {
    /**
     * Compara dos Equipos según la regla ...
     * 
     * @param o1 Equipo 1
     * @param o2 Equipo 2
     * @return Devuelve 0 si son iguales, un número menor que cero si ...
     */
    @Override
    public int compare(EquipoInformatico o1, EquipoInformatico o2) {
        int resultado = o1.getMegabytesRAM()-o2.getMegabytesRAM();
        if (resultado!=0){
            return resultado;
        }
        resultado = o1.getCapacidadHD()-o2.getCapacidadHD();
        if (resultado!=0){
            return resultado;
        }
        return o1.getNombre().compareTo(o2.getNombre());
    }
    
}
