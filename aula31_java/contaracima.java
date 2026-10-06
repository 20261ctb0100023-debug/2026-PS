public class contaracima {
    public static int contarAcimaInt(int[] numeros, int limite) {
        int contador = 0;
        for (int n : numeros) {
            if (n > limite) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarAcimaDouble(double[] numeros, double limite) {
        int contador = 0;
        for (double n : numeros) {
            if (n > limite) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarAcimaFloat(float[] numeros, float limite) {
        int contador = 0;
        for (float n : numeros) {
            if (n > limite) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int[] numerosInt = {8, 3, 10, 5, 12};
        double[] numerosDouble = {8.5, 3.2, 10.0, 5.7, 12.4};
        float[] numerosFloat = {8.5f, 3.2f, 10.0f, 5.7f, 12.4f};

        int limiteInt = 6;
        double limiteDouble = 6.0;
        float limiteFloat = 6.0f;

        System.out.println("Acima de " + limiteInt + " (int): " + contarAcimaInt(numerosInt, limiteInt));
        System.out.println("Acima de " + limiteDouble + " (double): " + contarAcimaDouble(numerosDouble, limiteDouble));
        System.out.println("Acima de " + limiteFloat + " (float): " + contarAcimaFloat(numerosFloat, limiteFloat));
    }
}
