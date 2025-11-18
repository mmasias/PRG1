package casosDeUso.matrices;

import java.util.Scanner;

class Matrices2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Momento A");
        scanner.nextLine();
        {
            int[][] tabla = {
                    { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 9 }
            };
            System.out.println("1) tabla[0] == tabla[1] -> " + (tabla[0] == tabla[1]));
            System.out.println("2) tabla[0] == tabla[2] -> " + (tabla[0] == tabla[2]));
            System.out.println("3) tabla[1] == tabla[2] -> " + (tabla[1] == tabla[2]));
        }

        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Momento B");
        scanner.nextLine();
        {
            int[] unaFila = { 1, 2, 3 };
            int[][] tablaCompartida = {
                    unaFila,
                    { 1, 2, 3 },
                    { 1, 2, 3 },
                    unaFila
            };
            System.out.println("4) tablaCompartida[0] == tablaCompartida[3] -> " + (tablaCompartida[0] == tablaCompartida[3]));
            System.out.println("5) tablaCompartida[0] == tablaCompartida[1] -> " + (tablaCompartida[0] == tablaCompartida[1]));
            unaFila[0] = 42;
            System.out.println("6) tablaCompartida[0][0] -> " + tablaCompartida[0][0]);
            System.out.println("7) tablaCompartida[3][0] -> " + tablaCompartida[3][0]);
            System.out.println("8) tablaCompartida[1][0] -> " + tablaCompartida[1][0]);
        }

        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Momento C");
        scanner.nextLine();
        {
            int[][] ragged = {
                    { 1, 2, 3 },
                    { 0 },
                    { 9, 8, 7 }
            };
            System.out.println("9) ragged[0][0] -> " + ragged[0][0]);
            System.out.println("10) ragged[1][0] -> " + ragged[1][0]);
            System.out.println("11) ragged[2][0] -> " + ragged[2][0]);
            int[] temp = ragged[0];
            ragged[0] = ragged[1];
            ragged[1] = ragged[2];
            ragged[2] = temp;
            System.out.println("12) ragged[0][0] -> " + ragged[0][0]);
            System.out.println("13) ragged[1][0] -> " + ragged[1][0]);
            System.out.println("14) ragged[2][0] -> " + ragged[2][0]);
        }

        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Momento D");
        scanner.nextLine();
        {
            int primitivaFilaA = 10;
            int primitivaFilaB = 20;
            int[][] desdePrimitivas = {
                    { primitivaFilaA, primitivaFilaB },
                    { -1 }
            };
            System.out.println("15) primitivaFilaA -> " + primitivaFilaA);
            System.out.println("16) primitivaFilaB -> " + primitivaFilaB);
            System.out.println("17) desdePrimitivas[0][0] -> " + desdePrimitivas[0][0]);
            System.out.println("18) desdePrimitivas[0][1] -> " + desdePrimitivas[0][1]);
            primitivaFilaA = 1234;
            primitivaFilaB = -1234;
            System.out.println("19) primitivaFilaA actualizado -> " + primitivaFilaA);
            System.out.println("20) primitivaFilaB actualizado -> " + primitivaFilaB);
            System.out.println("21) desdePrimitivas[0][0] sigue igual -> " + desdePrimitivas[0][0]);
            System.out.println("22) desdePrimitivas[0][1] sigue igual -> " + desdePrimitivas[0][1]);
        }

        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Momento E");
        scanner.nextLine();
        {
            int[][] permiteNull = {
                    { 1, 666, 3 },
                    null,
                    { 0 }
            };
            System.out.println("23) permiteNull[1] == null -> " + (permiteNull[1] == null));
            if (permiteNull[1] != null) {
                System.out.println("24) permiteNull[1][0] -> " + permiteNull[1][0]);
            } else {
                System.out.println("24) permiteNull[1][0] no existe");
            }
            permiteNull[2] = null;
            permiteNull[1] = permiteNull[0];
            System.out.println("25) permiteNull[1] == permiteNull[0] -> " + (permiteNull[1] == permiteNull[0]));
            System.out.println("26) permiteNull[2] == null -> " + (permiteNull[2] == null));
        }

        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Momento F");
        scanner.nextLine();
        {
            int[][] tablaOriginal = {
                    { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 9 }
            };
            int[][] historial = { tablaOriginal[0], tablaOriginal[1], tablaOriginal[2] };
            tablaOriginal = null;
            System.out.println("27) historial[0][0] -> " + historial[0][0]);
            System.out.println("28) tablaOriginal == null -> " + (tablaOriginal == null));
            int[][] tablaReconstruida = {
                    historial[2],
                    null,
                    historial[0]
            };
            System.out.println("29) tablaReconstruida[0] == historial[2] -> " + (tablaReconstruida[0] == historial[2]));
            System.out.println("30) tablaReconstruida[1] == null -> " + (tablaReconstruida[1] == null));
            System.out.println("31) tablaReconstruida[2] == historial[0] -> " + (tablaReconstruida[2] == historial[0]));
        }

        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Momento G");
        scanner.nextLine();
        {
            int[][] tabla = {
                    { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 9 }
            };
            int[][] copiaSuperficial = tabla;
            int[][] copiaProfunda = new int[tabla.length][];
            for (int i = 0; i < tabla.length; i++) {
                copiaProfunda[i] = new int[tabla[i].length];
                for (int j = 0; j < tabla[i].length; j++) {
                    copiaProfunda[i][j] = tabla[i][j];
                }
            }
            copiaSuperficial[0][0] = 999;
            copiaProfunda[2][copiaProfunda[2].length - 1] = -999;
            System.out.println("32) tabla[0][0] -> " + tabla[0][0]);
            System.out.println("33) copiaSuperficial[0][0] -> " + copiaSuperficial[0][0]);
            System.out.println("34) tabla[2][tabla[2].length-1] -> " + tabla[2][tabla[2].length - 1]);
            System.out.println("35) copiaProfunda[2][copiaProfunda[2].length-1] -> " + copiaProfunda[2][copiaProfunda[2].length - 1]);
        }

        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Momento H");
        scanner.nextLine();
        {
            int[][] tabla = {
                    { 7, 8, 9 },
                    null,
                    { 1, 2, 3 }
            };
            System.out.println("36) valor -> " + tabla[0][0]);
            System.out.println("37) valor -> " + tabla[0][1]);
            System.out.println("38) valor -> " + tabla[0][2]);
            System.out.println("39) fila null -> se salta");
            System.out.println("40) valor -> " + tabla[2][0]);
            System.out.println("41) valor -> " + tabla[2][1]);
            System.out.println("42) valor -> " + tabla[2][2]);
        }

        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Momento I");
        scanner.nextLine();
        {
            int[] brickFila = { 1, 2, 3 };
            int[][] matrizInmutable = {
                    brickFila.clone(),
                    new int[] { 4, 5, 6 }
            };
            int[] brick = matrizInmutable[0];
            brick = new int[] { 99, 98, 97 };
            System.out.println("43) ¿Se rompió el muro? -> " + (matrizInmutable[0][0] == 1));
        }

        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Momento J");
        scanner.nextLine();
        {
            int[] original = { 1, 2, 3 };
            int[][] matrizConClone = {
                    original.clone(),
                    new int[] { 4, 5, 6 }
            };
            System.out.println("44) original[0] antes -> " + original[0]);
            System.out.println("45) matrizConClone[0][0] antes -> " + matrizConClone[0][0]);
            original[0] = 12;
            System.out.println("46) original[0] después -> " + original[0]);
            System.out.println("47) matrizConClone[0][0] después -> " + matrizConClone[0][0]);
        }

        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Momento K");
        scanner.nextLine();
        {
            int[][][] terceraDimension = {
                    { { 1 }, { 2, 3 } },
                    null,
                    { { 4, 5, 6 } }
            };
            System.out.println("48) terceraDimension[0][0][0] -> " + terceraDimension[0][0][0]);
            System.out.println("49) terceraDimension[2][0][2] -> " + terceraDimension[2][0][2]);
            System.out.println("50) terceraDimension[1] == null -> " + (terceraDimension[1] == null));
        }

        scanner.close();
    }
}
