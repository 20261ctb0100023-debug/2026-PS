public class calcularsoma {
    public static int calculaSoma(int[] numeros) {
        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        return soma;
    }

    public static double calculaSomaDouble(double[] numeros) {
        double soma = 0;
        for (double n : numeros) {
            soma += n;
        }
        return soma;
    }

    public static float calculaSomaFloat(float[] numeros) {
        float soma = 0;
        for (float n : numeros) {
            soma += n;
        }
        return soma;
    }

    public static void main(String[] args) {
        int[] numeros = {8, 3, 10, 5, 12};
        double[] numerosDouble = {8.5, 3.2, 10.0, 5.7, 12.4};
        float[] numerosFloat = {8.5f, 3.2f, 10.0f, 5.7f, 12.4f};

        System.out.println("Soma com int: " + calculaSoma(numeros));
        System.out.println("Soma com double: " + calculaSomaDouble(numerosDouble));
        System.out.println("Soma com float: " + calculaSomaFloat(numerosFloat));
    }
}