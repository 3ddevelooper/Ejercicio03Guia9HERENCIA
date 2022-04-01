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
public class Televisor extends Electrodomestico {
    
     private Double resolucion;
     private boolean tdt;
     Scanner scn = new Scanner(System.in).useDelimiter("\n");

     public Double getResolucion() {
          return resolucion;
     }

     public void setResolucion(Double resolucion) {
          this.resolucion = resolucion;
     }

     public Televisor() {
     }

     public Televisor(Double resolucion, boolean tdt, Double precio, Colores color, Eficiencia eficiencia, Double peso) {
          super(precio, color, eficiencia, peso);
          this.resolucion = resolucion;
          this.tdt = tdt;
     }
     

     public boolean isTdt() {
          return tdt;
     }

     public void setTdt(boolean tdt) {
          this.tdt = tdt;
     }
     
     public Televisor crearTelevisor(){
          Televisor t1 = new Televisor();
          t1.crearElectrodomestico();
          System.out.println("Ingrese la resolución en pulgadas");
          t1.resolucion = scn.nextDouble();
          System.out.println("posee sintonizador TDT?");
          if (scn.next().equalsIgnoreCase("SI")) {
               t1.tdt=true;
          }else{
               t1.tdt = false;
          }
          return t1;
     }
     
     @Override
     public double precioFinal(){
          double salida = super.precioFinal();
          
          if (this.resolucion>40) {
               salida *= 1.3;
          }
          if (tdt) {
               salida += 500;
          }
          return salida;
     }
}
