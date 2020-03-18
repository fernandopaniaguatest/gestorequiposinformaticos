package com.fernandopaniagua.proyecto;

import java.util.Comparator;

/**
 * Clase bla, bla...
 * @author fpaniagua
 */
public class EquipoInformatico implements Comparator<EquipoInformatico>{
    private String nombre;//El nombre del equipo en formato JANDERKLANDER
    /**
     * Los megabytes de ram del equipo
     */
    public int megabytesRAM;
    private float mghz;//..
    private int capacidadHD;//..

    /**
     * Constructor
     * 
     * @param nombre Nombre en clave del equipo
     * @param megabytesRAM El número megabytes en la memoria RAM
     * @param mghz El número de ciclos máximo de la CPU
     * @param capacidadHD La capacidad en megabytes del disco duro
     */
    public EquipoInformatico(String nombre, int megabytesRAM, float mghz, int capacidadHD) {
        this.nombre = nombre;
        this.megabytesRAM = megabytesRAM;
        this.mghz = mghz;
        this.capacidadHD = capacidadHD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMegabytesRAM() {
        return megabytesRAM;
    }

    public void setMegabytesRAM(int megabytesRAM) {
        this.megabytesRAM = megabytesRAM;
    }

    /**
     * Devuelve los megahercios de velocidad de la CPU
     * 
     * @return Velocidad
     */
    public float getMghz() {
        return mghz;
    }

    public void setMghz(float mghz) {
        this.mghz = mghz;
    }

    public int getCapacidadHD() {
        return capacidadHD;
    }

    public void setCapacidadHD(int capacidadHD) {
        this.capacidadHD = capacidadHD;
    }

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

    /**
     * bla, bla
     * 
     * @param i bla, bla
     * @param j bla, bla
     * @return bla, bla
     * @throws Exception Indicar la causa de la exception
     * @deprecated Utilizar el método sayHello en lugar de este
     */
    public boolean saludar(int i, int j) throws Exception {
        if (i>10){
            throw new Exception("Error fatal y total del sistema");
        }
        return true;
    }
    
    /**
     * Dice hola
     */
    public void sayHello() {
        System.out.println("Hola");
    }
    
    private void saltar(){
        System.out.println("Saltando");
    }
    
    /**
     * El método corre
     */
    protected void correr(){
        System.out.println("Correr");
    }
    
    
}
