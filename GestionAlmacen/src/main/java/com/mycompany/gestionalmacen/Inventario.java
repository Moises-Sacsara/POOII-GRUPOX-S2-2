/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionalmacen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Inventario {
    private final List<Producto> productos;
    
    public Inventario() {
    productos= new ArrayList<>();
    }
    public void agregarProducto(Producto producto){
    productos.add(producto);
    }
    public void guardarProducto(String nombreArchivo){
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Producto producto : productos) {
                bw.write(producto.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los productos en el archivo: " + e.getMessage());
    }
}
}
