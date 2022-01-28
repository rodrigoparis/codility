package solutions;

import java.util.ArrayList;

public class BinaryGap {

    public int binaryGap(int n) {
        //buscar la cantidad de 0 q hay entre los 1 y
        // devolver cual es el máximo q se encuentra en ese numero como binario

        //genero un string con la representacion binaria de n
        String nToBinaryString = Long.toBinaryString(n);
        boolean started = false;
        int cont = 0;

        //creo un array dinamico donde ir guardando los gaps
        ArrayList<Integer> gaps = new ArrayList<>();

        //recorro una sola vez
        for (int i = 0; i < nToBinaryString.length(); i++) {
            String substring = nToBinaryString.substring(i, i + 1);
            if (substring.equals("1")) {
                if (started) {
                    gaps.add(cont);
                    cont = 0;
                    started = false;
                }
                started = true;
            } else {
                cont++;

            }
        }
        return gaps.stream().max((o1, o2) -> o1- o2).orElse(0);
    }
}
