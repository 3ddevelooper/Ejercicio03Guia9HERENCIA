/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class ElectrodomestiscoServicio {

    public void mostrarDatos() {
        Scanner read = new Scanner(System.in);
        List<Electrodomestico> electrodomesticos = new ArrayList();
        Lavadora lavadora = new Lavadora();
        Televisor tele = new Televisor();
        int sele = 0, cont = 0, suma = 0;

        do {
            do {
                System.out.println("Que electrodomestico desea agregar - 1:LAVADOR - 2:TELEVISOR");
                sele = read.nextInt();
                if (sele == 1 || sele == 2) {
                    switch (sele) {
                        case 1:
                            electrodomesticos.add(lavadora.crearLavadora());
                            break;
                        case 2:
                            electrodomesticos.add(tele.crearTelevisor());
                            break;
                        default:
                            System.out.println("Ingreso un opción incorrecta");
                            break;
                    }
                } else {

                    System.out.println("Ingreso un opción incorrecta");
                }

            } while (sele != 1 && sele != 2);

            cont++;
        } while (cont != 4);
        for (Electrodomestico electro : electrodomesticos) {
            suma += electro.precioFinal();
            System.out.println(electro.getClass().getSimpleName() + " " + electro.precioFinal());
        }
        System.out.println("El precio total de todos los electromesticos es: " + suma);
    }
}


