/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify;

/**
 *
 * @author Diego
 */
public class Cancion {
    
//Atributos
    private int idCancion;
     private String tituloCancion;
    private String autorCancion;
    private double duracionCancion;
    private int anoCancion;
    
//Constructor
    public Cancion(int idCancion, String tituloCancion, String autorCancion, double duracionCancion, int anoCancion) {
        this.idCancion = idCancion;
        this.tituloCancion = tituloCancion;
        this.autorCancion = autorCancion;
        this.duracionCancion = duracionCancion;
        this.anoCancion = anoCancion;
    }

    // Getters
    public int getIdCancion() {
        return idCancion;
    }

    public String getTituloCancion() {
        return tituloCancion;
    }

    public String getAutorCancion() {
        return autorCancion;
    }

    public double getDuracionCancion() {
        return duracionCancion;
    }

    public int getAnoCancion() {
        return anoCancion;
    }

    // Setters
    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }

    public void setAutorCancion(String autorCancion) {
        this.autorCancion = autorCancion;
    }

    public void setDuracionCancion(double duracionCancion) {
        this.duracionCancion = duracionCancion;
    }

    public void setAnoCancion(int anoCancion) {
        this.anoCancion = anoCancion;
    }
}
