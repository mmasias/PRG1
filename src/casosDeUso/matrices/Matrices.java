package casosDeUso.matrices;

import java.util.Scanner;

class Matrices {
    public static void main(String[] args) {

        System.out.println("Momento 1");
        (new Scanner(System.in)).nextLine();
        {
            int[] original = { 1, 2, 3 };
            int[] alias = original;
            int[] independiente = { 1, 2, 3 };
            int[] espejo = independiente;
            int[] fantasma = null;
            int[] copiaFantasma = fantasma;

            System.out.println("1) original == alias -> " + (original == alias));
            System.out.println("2) original == independiente -> " + (original == independiente));
            System.out.println("3) independiente == espejo -> " + (independiente == espejo));
            System.out.println("4) fantasma == copiaFantasma -> " + (fantasma == copiaFantasma));
        }

        (new Scanner(System.in)).nextLine();
        System.out.println();
        System.out.println("Momento 1 bis");
        (new Scanner(System.in)).nextLine();
        {
            int[] original = { 1, 2, 3 };
            int[] independiente = { 1, 2, 3 };
            int[] fantasma = null;
            int[] copiaFantasma = fantasma;
            boolean mismoContenido = original.length == independiente.length;
            for (int i = 0; i < original.length && mismoContenido; i++) {
                if (original[i] != independiente[i]) {
                    mismoContenido = false;
                }
            }
            System.out.println("5) original e independiente ¿lo mismo? -> " + mismoContenido);
            if (fantasma == null || copiaFantasma == null) {
                System.out.println("6) fantasma y copiaFantasma no se pueden comparar: alguna referencia es null");
            }
        }

        (new Scanner(System.in)).nextLine();
        System.out.println();
        System.out.println("Momento 2");
        (new Scanner(System.in)).nextLine();
        {
            int primitiva1 = 1;
            int primitiva2 = 2;
            int[] desdePrimitivas = { primitiva1, primitiva2 };
            System.out.println("7) primitiva1 -> " + primitiva1);
            System.out.println("8) primitiva2 -> " + primitiva2);
            System.out.println("9) desdePrimitivas[0] -> " + desdePrimitivas[0]);
            System.out.println("10) desdePrimitivas[1] -> " + desdePrimitivas[1]);
            primitiva1 = 500;
            primitiva2 = -500;
            System.out.println("11) primitiva1 actualizado -> " + primitiva1);
            System.out.println("12) primitiva2 actualizado -> " + primitiva2);
            System.out.println("13) desdePrimitivas[0] sigue igual -> " + desdePrimitivas[0]);
            System.out.println("14) desdePrimitivas[1] sigue igual -> " + desdePrimitivas[1]);
        }

        (new Scanner(System.in)).nextLine();
        System.out.println();
        System.out.println("Momento 3");
        (new Scanner(System.in)).nextLine();
        {
            int[] original = { 1, 2, 3 };
            int[] clonManual = new int[original.length];
            for (int i = 0; i < clonManual.length; i++) {
                clonManual[i] = original[i];
            }
            System.out.println("15) clonManual == original -> " + (clonManual == original));
            System.out.println("16) clonManual[1] -> " + clonManual[1]);
            System.out.println("17) original[1] -> " + original[1]);
        }

        (new Scanner(System.in)).nextLine();
        System.out.println();
        System.out.println("Momento 4");
        (new Scanner(System.in)).nextLine();
        {
            int[] original = { 1, 2, 3 };
            int[] alias = original;
            int[] independiente = { 7, 8, 9 };
            int[] espejo = independiente;
            alias[1] = 99;
            independiente[2] = 77;
            System.out.println("18) original[1] -> " + original[1]);
            System.out.println("19) espejo[2] -> " + espejo[2]);
            System.out.println("20) alias[1] -> " + alias[1]);
        }

        (new Scanner(System.in)).nextLine();
        System.out.println();
        System.out.println("Momento 5");
        (new Scanner(System.in)).nextLine();
        {
            int[] original = { 1, 2, 3 };
            int[] alias = original;
            alias = new int[] { -5, -5, -5 };
            System.out.println("21) alias[0] -> " + alias[0]);
            System.out.println("22) original[0] -> " + original[0]);
        }

        (new Scanner(System.in)).nextLine();
        System.out.println();
        System.out.println("Momento 6");
        (new Scanner(System.in)).nextLine();
        {
            int[] clonManual = { 10, 20, 30 };
            int[] independiente = clonManual;
            int[] espejo = { 7, 7, 7 };
            int[] alias = espejo;
            int[] intercambio = independiente;
            independiente = alias;
            alias = intercambio;
            System.out.println("23) independiente == clonManual -> " + (independiente == clonManual));
            System.out.println("24) alias == espejo -> " + (alias == espejo));
            System.out.println("25) alias[2] -> " + alias[2]);
            System.out.println("26) espejo[2] -> " + espejo[2]);
        }

        (new Scanner(System.in)).nextLine();
        System.out.println();
        System.out.println("Momento 7");
        (new Scanner(System.in)).nextLine();
        {
            int[] independiente = { 5, 6, 7, 8 };
            int[] reconstruido = new int[independiente.length];
            for (int i = 0; i < independiente.length; i++) {
                reconstruido[i] = independiente[independiente.length - 1 - i];
            }
            System.out.println("27) reconstruido == independiente -> " + (reconstruido == independiente));
            System.out.println("28) reconstruido[0] -> " + reconstruido[0]);
            System.out.println("29) independiente[0] -> " + independiente[0]);
        }

        (new Scanner(System.in)).nextLine();
        System.out.println();
        System.out.println("Momento 8");
        (new Scanner(System.in)).nextLine();
        {
            int[] fantasma = null;
            int[] copiaFantasma = null;
            fantasma = new int[] { 7, 7, 7 };
            copiaFantasma = fantasma;
            copiaFantasma[2] = -7;
            System.out.println("30) fantasma == copiaFantasma -> " + (fantasma == copiaFantasma));
            System.out.println("31) fantasma[2] -> " + fantasma[2]);
            System.out.println("32) copiaFantasma[2] -> " + copiaFantasma[2]);
        }

        (new Scanner(System.in)).nextLine();
        System.out.println();
        System.out.println("Momento 9");
        (new Scanner(System.in)).nextLine();
        {
            int[] original = { 1, 2, 3 };
            int[] clonManual = original;
            int[] independiente = clonManual;
            int[] alias = independiente;
            int[] espejo = alias;
            int[] fantasma = new int[] { 9, 9, 9 };
            int[] copiaFantasma = fantasma;
            System.out.println("33) original == clonManual -> " + (original == clonManual));
            System.out.println("34) independiente == clonManual -> " + (independiente == clonManual));
            System.out.println("35) alias == espejo -> " + (alias == espejo));
            System.out.println("36) fantasma == copiaFantasma -> " + (fantasma == copiaFantasma));
        }
    }
}
