package solutions;

import java.util.*;

public class GenomicRangeQuery {
    public static int[] solution(String S, int[] P, int[] Q) {
        int[] A = new int[S.length()];
        int[] C = new int[S.length()];
        int[] G = new int[S.length()];
        int[] T = new int[S.length()];
        int[] solution = new int[P.length];


        if (S.length() == 1) {
            switch (S) {
                case "A":
                    return new int[]{1};
                case "C":
                    return new int[]{2};
                case "G":
                    return new int[]{3};
                case "T":
                    return new int[]{4};
            }
        }
        int a = 0;
        int g = 0;
        int c = 0;
        int t = 0;
//reviso la repetición de letras a lo largo del String, sumo 1 si encuentro a la variable en concreto
        for (int i = 0; i < S.length(); i++) {
            switch (S.substring(i, i + 1)) {
                case "A":
                    a++;
                    break;
                case "C":
                    c++;
                    break;
                case "G":
                    g++;
                    break;
                case "T":
                    t++;
                    break;

            }
            A[i] = a;
            C[i] = c;
            G[i] = g;
            T[i] = t;
        }


        for (int i = 0; i < P.length; i++) {
            int start = P[i];
            int end = Q[i];
            char m = S.charAt(P[i]);
            if (P[i] == Q[i]) {
                switch (m) {
                    case 'A':
                        solution[i] = 1;
                        break;
                    case 'C':
                        solution[i] = 2;
                        break;
                    case 'G':
                        solution[i] = 3;
                        break;
                    case 'T':
                        solution[i] = 4;
                        break;
                }
            } else if (A[start] < A[end] || m == 'A') solution[i] = 1;
            else if (C[start] < C[end] || m == 'C') solution[i] = 2;
            else if (G[start] < G[end] || m == 'G') solution[i] = 3;
            else if (T[start] < T[end] || m == 'T') solution[i] = 4;

        }

        return solution;
    }

    public static int[] bruteSolution(String S, int[] P, int[] Q) { //62%
        ArrayList<Integer> impactFactorsArray = new ArrayList<>();
        LinkedList<Integer> results = new LinkedList<>();

        Map<String, Integer> values = new HashMap<>();
        values.put("A", 1);
        values.put("C", 2);
        values.put("G", 3);
        values.put("T", 4);
        int start = 0, end = 0;
        String subSequence = "";
        String stringToNumber = "";

        for (int i = 0; i < S.length(); i++) {
            impactFactorsArray.add(values.get(S.substring(i, i + 1)));
        }
        for (int i = 0; i < P.length; i++) {
            start = P[i];
            end = Q[i];
            int min = Integer.MAX_VALUE;

            for (int j = start; j <= end; j++) {
                int value = impactFactorsArray.get(j);
                if (value < min) {
                    min = value;

                }
            }
            results.add(min);
        }

        int[] resultados = new int[results.size()];

        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = results.get(i);
        }

        return resultados;
    }
}
