package com.fernandopaniagua.proyecto;

import java.util.Comparator;

public class ComparadorEquiposInformaticosEasy implements Comparator<EquipoInformatico> {
    /**
     * Qué hace el método
     * 
     * @param o1 Qué es este parámetro + explicaciones
     * @param o2 "
     * @return Qué retorna + explicaciones
     */
    @Override
    public int compare(EquipoInformatico o1, EquipoInformatico o2) {
        float resultado = o1.getMghz()-o2.getMghz();
        return (int)resultado;
    }
    
}
