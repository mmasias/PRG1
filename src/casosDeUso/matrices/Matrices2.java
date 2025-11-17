package casosDeUso.matrices;

class Matrices2 {
    public static void main(String[] args) {
        int[][] tabla = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Momento A - A Day in the Life");
        System.out.println("1) tabla[0] == tabla[1] -> " + (tabla[0] == tabla[1]));
        System.out.println("2) tabla[0] == tabla[2] -> " + (tabla[0] == tabla[2]));
        System.out.println("3) tabla[1] == tabla[2] -> " + (tabla[1] == tabla[2]));

        System.out.println();
        System.out.println("Momento B - Echoes");
        int[] unaFila = {1, 2, 3};
        int[][] tablaCompartida = {
            unaFila,
            {1, 2, 3},
            {1, 2, 3},
            unaFila
        };
        System.out.println("4) tablaCompartida[0] == tablaCompartida[3] -> " + (tablaCompartida[0] == tablaCompartida[3]));
        System.out.println("5) tablaCompartida[0] == tablaCompartida[1] -> " + (tablaCompartida[0] == tablaCompartida[1]));
        unaFila[0] = 42;
        System.out.println("6) tablaCompartida[0][0] -> " + tablaCompartida[0][0]);
        System.out.println("7) tablaCompartida[3][0] -> " + tablaCompartida[3][0]);
        System.out.println("8) tablaCompartida[1][0] -> " + tablaCompartida[1][0]);

        System.out.println();
        System.out.println("Momento C - Kashmir");
        int[][] ragged = {
            {1, 2, 3},
            {0},
            {9, 8, 7}
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

        System.out.println();
        System.out.println("Momento D - Across the Universe");
        int primitivaFilaA = 10;
        int primitivaFilaB = 20;
        int[][] desdePrimitivas = {
            {primitivaFilaA, primitivaFilaB},
            {-1}
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

        System.out.println();
        System.out.println("Momento E - Under Pressure");
        int[][] permiteNull = {
            {1, 666, 3},
            null,
            {0}
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

        System.out.println();
        System.out.println("Momento F - Back in Black");
        int[][] historial = { tabla[0], tabla[1], tabla[2] };
        tabla = null;
        System.out.println("27) historial[0][0] -> " + historial[0][0]);
        System.out.println("28) tabla == null -> " + (tabla == null));
        tabla = new int[][] {
            historial[2],
            null,
            historial[0]
        };
        System.out.println("29) tabla[0] == historial[2] -> " + (tabla[0] == historial[2]));
        System.out.println("30) tabla[1] == null -> " + (tabla[1] == null));
        System.out.println("31) tabla[2] == historial[0] -> " + (tabla[2] == historial[0]));

        System.out.println();
        System.out.println("Momento G - Mirror in the Bathroom");
        int[][] copiaSuperficial = tabla;
        int[][] copiaProfunda = new int[tabla.length][];
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] != null) {
                copiaProfunda[i] = new int[tabla[i].length];
                for (int j = 0; j < tabla[i].length; j++) {
                    copiaProfunda[i][j] = tabla[i][j];
                }
            }
        }
        copiaSuperficial[0][0] = 999;
        if (copiaProfunda[2] != null) {
            copiaProfunda[2][copiaProfunda[2].length - 1] = -999;
        }
        System.out.println("32) tabla[0][0] -> " + tabla[0][0]);
        System.out.println("33) copiaSuperficial[0][0] -> " + copiaSuperficial[0][0]);
        System.out.println("34) tabla[2][tabla[2].length-1] -> " + tabla[2][tabla[2].length - 1]);
        System.out.println("35) copiaProfunda[2][copiaProfunda[2].length-1] -> " + copiaProfunda[2][copiaProfunda[2].length - 1]);

        System.out.println();
        System.out.println("Momento H - Road to Nowhere");
        int pregunta = 36;
        for (int[] fila : tabla) {
            if (fila == null) {
                System.out.println((pregunta++) + ") fila null -> se salta");
            } else {
                for (int valor : fila) {
                    System.out.println((pregunta++) + ") valor -> " + valor);
                }
            }
        }
    }
}
