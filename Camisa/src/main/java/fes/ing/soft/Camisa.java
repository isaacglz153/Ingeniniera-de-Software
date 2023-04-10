/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.ing.soft;

/**
 *
 * @author isaac
 */
public class Camisa {
    private int Precio;
    private String Manga;
    private String Tipo;

    public Camisa() {
    }

    public Camisa(int Precio, String Manga, String Tipo) {
        this.Precio = Precio;
        this.Manga = Manga;
        this.Tipo = Tipo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getManga() {
        return Manga;
    }

    public void setManga(String Manga) {
        this.Manga = Manga;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Camisas{" + "Precio=" + Precio + ", Manga=" + Manga + ", Tipo=" + Tipo + '}';
    } 
}
