public class maiorvalor {
    public static int maiorValorInt(int[] numeros) {
        int maior = numeros[0];
        for (int n : numeros) {
            if (n > maior) {
                maior = n;
            }
        }
        return maior;
    }

    public static double maiorValorDouble(double[] numeros) {
        double maior = numeros[0];
        for (double n : numeros) {
            if (n > maior) {
                maior = n;
            }
        }
        return maior;
    }

    public static float maiorValorFloat(float[] numeros) {
        float maior = numeros[0];
        for (float n : numeros) {
            if (n > maior) {
                maior = n;
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        int[] numerosInt = {8, 3, 10, 5, 12};
        double[] numerosDouble = {8.5, 3.2, 10.0, 5.7, 12.4};
        float[] numerosFloat = {8.5f, 3.2f, 10.0f, 5.7f, 12.4f};

        System.out.println("Maior valor com int: " + maiorValorInt(numerosInt));
        System.out.println("Maior valor com double: " + maiorValorDouble(numerosDouble));
        System.out.println("Maior valor com float: " + maiorValorFloat(numerosFloat));
    }
}
