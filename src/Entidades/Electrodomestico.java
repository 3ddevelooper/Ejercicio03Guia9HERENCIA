/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Entidades;

import Enums.Colores;
import Enums.Eficiencia;
import java.util.Scanner;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Electrodomestico {
    
    protected Double precio;
     protected Colores color;
     protected Eficiencia eficiencia;
     protected Double peso;

     public Electrodomestico() {
     }

     public Electrodomestico(Double precio, Colores color, Eficiencia eficiencia, Double peso) {
          this.precio = precio;
          this.color = color;
          this.eficiencia = eficiencia;
          this.peso = peso;
     }

     public Double getPrecio() {
          return precio;
     }

     public void setPrecio(Double precio) {
          this.precio = precio;
     }

     public Colores getColor() {
          return color;
     }

     public void setColor(Colores color) {
          this.color = color;
     }

     public Eficiencia getEficiencia() {
          return eficiencia;
     }

     public void setEficiencia(Eficiencia eficiencia) {
          this.eficiencia = eficiencia;
     }

     public Double getPeso() {
          return peso;
     }

     public void setPeso(Double peso) {
          this.peso = peso;
     }

     public Eficiencia comprobarConsumoEnergetico(String letra) {
          for (Eficiencia value :Eficiencia.values()) {
               if (value.name().equalsIgnoreCase(letra)) {
                    return value;
               }
          }
          return Eficiencia.F;
     }

     public Colores comprobarColor(String color) {
          for (Colores value : Colores.values()) {
               if (value.name().equalsIgnoreCase(color)) {
                    return value;
               }
          }
          return Colores.BLANCO;
     }


     public void crearElectrodomestico() {
          Scanner scn = new Scanner(System.in).useDelimiter("\n");
          System.out.println("¿cuánto pesa el artículo?");
          this.peso = scn.nextDouble();
          System.out.println("ingrese el color del artículo");
          this.color = comprobarColor(scn.next());
          System.out.println("ingrese la eficiencia energética");
          this.eficiencia = comprobarConsumoEnergetico(scn.next().toUpperCase());
          this.precio = 1000d;
     }

     public double precioFinal() {
          
          double salida = 1000;
          switch (this.eficiencia) {
               case A:
                    salida += 1000d;
                    break;
               case B:
                    salida += 800;
                    break;
               case C:
                    salida += 600;
                    break;
               case D:
                    salida += 500;
                    break;
               case E:
                    salida += 300;
                    break;
               case F:
                    salida += 100;

          }
          if (this.peso >= 80) {
               salida += 1000;
          } else if (this.peso >= 50) {
               salida += 800;
          } else if (this.peso >= 20) {
               salida += 500;
          } else {
               salida += 100;
          }
          
          return salida;
     }
    
}
