/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.canela.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.canela.entidades.Receta;
import mx.itson.canela.enumeradores.Dificultad;
import mx.itson.canela.entidades.Ingrediente;

/**
 *
 * @author miche
 */
public class Main {
      public static void main(String[] args) {
        
        Receta receta = new Receta();
        receta.setNombre("Frankie Brownie");
        receta.setDescripcion("Hornea una receta de FRANKIE BROWNIES con Leche Condensada LA LECHERA® para este Halloween y ofrécelas en tu reunión, con amigos, o con tu familia.");
        receta.setNumeroPorciones(6);
        receta.setTiempo(62);
        
        List<Ingrediente> ingredientes = new ArrayList<>();
        
        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("1 Caja de Harina para brownies chocolate Fudge de Betty Crocker® (519 g)");
        ingredientes.add(ingrediente1);
        
        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("3 Cucharadas de Agua");
        ingredientes.add(ingrediente2);
        
        receta.setIngredientes(ingredientes);
        
        // Agregar pasos
        
        receta.setDificultad(Dificultad.INTERMEDIO);
        
        
        
        
    }

}
