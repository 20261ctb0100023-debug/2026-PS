import java.util.ArrayList;

public class ExerciciosAula29 {

    public static void main(String[] args) {
        double[] notas = {7.0, 5.0, 9.0, 6.0};
        exibirBoletim(notas);

        ArrayList<String> produtos = new ArrayList<>();
        adicionarProduto(produtos, "Pizza");
        adicionarProduto(produtos, "Suco");
        listarProdutos(produtos);

        System.out.println("Maior valor: " + maiorValor(new int[]{3, 9, 5}));
    }

    public static double calcularMedia(double[] notas) {
        if (notas == null || notas.length == 0) {
            return 0.0;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static int contarAprovados(double[] notas) {
        int aprovados = 0;
        for (double nota : notas) {
            if (nota >= 6.0) {
                aprovados++;
            }
        }
        return aprovados;
    }

    public static void adicionarProduto(ArrayList<String> lista, String nome) {
        if (lista != null && nome != null) {
            lista.add(nome);
        }
    }

    public static void listarProdutos(ArrayList<String> lista) {
        if (lista == null) {
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + " - " + lista.get(i));
        }
    }

    public static int maiorValor(int[] valores) {
        if (valores == null || valores.length == 0) {
            return 0;
        }

        int maior = valores[0];
        for (int valor : valores) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    public static int maiorValor(int a, int b) {
        return Math.max(a, b);
    }

    public static void exibirBoletim(double[] notas) {
        double media = calcularMedia(notas);
        int aprovados = contarAprovados(notas);
        String situacao = media >= 6.0 ? "APROVADA" : "EM RECUPERAÇÃO";

        System.out.printf("Média: %.2f%n", media);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Situação: " + situacao);
    }

    public static int contarAcimaDaMedia(double[] notas) {
        if (notas == null || notas.length == 0) {
            return 0;
        }

        double media = calcularMedia(notas);
        int acimaDaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            }
        }
        return acimaDaMedia;
    }
}
