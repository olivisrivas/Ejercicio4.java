package com.generation;

import java.util.Scanner; // Se añade la importación de la clase Scanner

public class Codigo4 {

    public static void main(String[] args) { //Se añade "public static void main(String[] args)"
        Scanner s = new Scanner(System.in); // Pasa System.in al constructor de Scanner

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Se corrige el mensaje para el jugador 2
        String j2 = s.nextLine();

        if (j1 == j2) { // Se corrige la condición de igualdad eliminando ")"
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break; // Se añade el break
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    } // Cierre del if del "case 'papel': "
                    break; // Se añade el break
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
                default:
            } // Cierre de "switch"
            System.out.println("Gana el jugador " + g);
        } // Cierre de "else"
    } // Cierre de "public static void main(String[] args)"
}
