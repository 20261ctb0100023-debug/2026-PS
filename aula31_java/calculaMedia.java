public class calculaMedia {
    public static int calculaMediaInt(int[] numeros) {
        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        return soma / numeros.length;
    }

    public static double calculaMediaDouble(double[] numeros) {
        double soma = 0;
        for (double n : numeros) {
            soma += n;
        }
        return soma / numeros.length;
    }

    public static float calculaMediaFloat(float[] numeros) {
        float soma = 0;
        for (float n : numeros) {
            soma += n;
        }
        return soma / numeros.length;
    }

    public static void main(String[] args) {
        int[] numerosInt = {8, 3, 10, 5, 12};
        double[] numerosDouble = {8.5, 3.2, 10.0, 5.7, 12.4};
        float[] numerosFloat = {8.5f, 3.2f, 10.0f, 5.7f, 12.4f};

        System.out.println("Média com int: " + calculaMediaInt(numerosInt));
        System.out.println("Média com double: " + calculaMediaDouble(numerosDouble));
        System.out.println("Média com float: " + calculaMediaFloat(numerosFloat));
    }
}
