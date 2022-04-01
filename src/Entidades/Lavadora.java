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
public class Lavadora extends Electrodomestico {
     private Double carga;
     
     public Lavadora(){};
     
     Scanner scn = new Scanner(System.in).useDelimiter("\n");

     public Lavadora(Double carga, Double precio, Colores color, Eficiencia eficiencia, Double peso) {
          super(precio, color, eficiencia, peso);
          this.carga = carga;
     }

     public Double getCarga() {
          return carga;
     }

     public void setCarga(Double carga) {
          this.carga = carga;
     }
     public Lavadora crearLavadora(){
          Lavadora e1 = new Lavadora();
          e1.crearElectrodomestico();
          System.out.println("ingrese la carga de la lavadora");
          e1.setCarga(scn.nextDouble());
          return e1;
     }
     
     @Override
     public double precioFinal(){
          return (carga>30)?super.precioFinal()+500:super.precioFinal();
     }
}
