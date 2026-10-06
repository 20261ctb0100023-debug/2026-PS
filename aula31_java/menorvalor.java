public class menorvalor {
    public static int menorValorInt(int[] numeros) {
        int menor = numeros[0];
        for (int n : numeros) {
            if (n < menor) {
                menor = n;
            }
        }
        return menor;
    }

    public static double menorValorDouble(double[] numeros) {
        double menor = numeros[0];
        for (double n : numeros) {
            if (n < menor) {
                menor = n;
            }
        }
        return menor;
    }

    public static float menorValorFloat(float[] numeros) {
        float menor = numeros[0];
        for (float n : numeros) {
            if (n < menor) {
                menor = n;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int[] numerosInt = {8, 3, 10, 5, 12};
        double[] numerosDouble = {8.5, 3.2, 10.0, 5.7, 12.4};
        float[] numerosFloat = {8.5f, 3.2f, 10.0f, 5.7f, 12.4f};

        System.out.println("Menor valor com int: " + menorValorInt(numerosInt));
        System.out.println("Menor valor com double: " + menorValorDouble(numerosDouble));
        System.out.println("Menor valor com float: " + menorValorFloat(numerosFloat));
    }
}
