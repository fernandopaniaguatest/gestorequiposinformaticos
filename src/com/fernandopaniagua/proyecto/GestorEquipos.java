package com.fernandopaniagua.proyecto;

import java.util.ArrayList;
import java.util.Comparator;

//https://github.com/junit-team/junit4/wiki/Download-and-Install
public class GestorEquipos {
    public static void main(String[] args) {
        //RAM, HZ, HD
        EquipoInformatico e1 = new EquipoInformatico("Equipo bajo", 100, 15.5f, 250);
        EquipoInformatico e2 = new EquipoInformatico("Equipo gammer", 100, 18.5f, 250);
        EquipoInformatico e3 = new EquipoInformatico("Equipo medio", 100, 17.3f, 300);
        ArrayList<EquipoInformatico> equipos = new ArrayList();
        equipos.add(e1);
        equipos.add(e2);
        equipos.add(e3);
        for (EquipoInformatico equipo : equipos) {
            System.out.println(equipo.getNombre());
        }        
        //equipos.sort(new ComparadorEquiposInformaticos());//Opción 1, implementado Comparator en clase aparte
        //equipos.sort(new ComparadorEquiposInformaticosEasy());//Opción 1, implementado Comparator en clase aparte
        //equipos.sort(e3);//Opción 2, implementando Comparator en la propia clase
        equipos.sort(new Comparator<EquipoInformatico>() {//Opción 3, implementando Comparator en clase anónima
            @Override
            public int compare(EquipoInformatico o1, EquipoInformatico o2) {
                return o1.getCapacidadHD()-o2.getCapacidadHD();
            }
        });
        
        System.out.println("Después");
        for (EquipoInformatico equipo : equipos) {
            System.out.println(equipo.getNombre());
        }
        try {
            e2.saludar(0, 0);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
