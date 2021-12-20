package com.cuatroa.retotres.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Esta clase modela una coleccion de productos, e incluye cada uno de sus campos. Muchos de los proyectos incluyen
 * un identificador de tipo String denominado referencia (reference). Sin embargo es importante resaltar que algunos de los proyectos tienen
 * un identificador de tipo Integer

 * 
 * @author Milton Ovalle
 */
@Document(collection = "accesories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vegetarian {
    @Id
    private String reference;
    private String brand;
    private String category;
    /*private String material;*/
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;
}
