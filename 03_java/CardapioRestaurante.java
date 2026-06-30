import java.util.Random;
import java.util.Scanner;

public class CardapioRestaurante {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random(474);

        String[] itens = {
            "X-Burguer",
            "Pizza",
            "Batata Frita",
            "Refrigerante",
            "Sorvete"
        };

        double[] precos = {
            18.0,
            35.0,
            12.0,
            8.0,
            7.0
        };

        int[] quantidades = new int[itens.length];
        boolean continuar = true;

        while (continuar) {
            System.out.println("===========================");
            System.out.println("FAST FOOD IFPR");
            System.out.println("===========================");
            System.out.println();
            for (int i = 0; i < itens.length; i++) {
                System.out.printf("%d - %s%n", i + 1, itens[i]);
            }
            System.out.println("6 - Finalizar Pedido");
            System.out.println();
            System.out.print("Escolha: ");
            int escolha = entrada.nextInt();
            System.out.println();

            switch (escolha) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.print("Quantidade: ");
                    int qtd = entrada.nextInt();
                    System.out.println();
                    if (qtd > 0) {
                        quantidades[escolha - 1] += qtd;
                        System.out.println("Item adicionado ao pedido!");
                        System.out.println();
                        System.out.println("Deseja continuar comprando?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Finalizar");
                        System.out.println();
                        System.out.print("Escolha: ");
                        int continuarEscolha = entrada.nextInt();
                        System.out.println();
                        if (continuarEscolha == 2) {
                            continuar = false;
                        }
                    } else {
                        System.out.println("Quantidade inválida. Tente novamente.");
                        System.out.println();
                    }
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println();
                    break;
            }
        }

        double total = 0;
        System.out.println("===========================");
        System.out.println("RESUMO DO PEDIDO");
        System.out.println("===========================");
        System.out.println();

        for (int i = 0; i < itens.length; i++) {
            if (quantidades[i] > 0) {
                double subTotal = quantidades[i] * precos[i];
                total += subTotal;
                String itemLinha = quantidades[i] + "x " + itens[i];
                System.out.printf("%s %s R$ %s%n", itemLinha, getDots(itemLinha), formatValor(subTotal));
            }
        }

        System.out.println();
        System.out.printf("TOTAL: R$ %s%n", formatValor(total));
        System.out.println();
        System.out.println("Forma de pagamento:");
        System.out.println();
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartão");
        System.out.println("3 - PIX");
        System.out.println();
        System.out.print("Escolha: ");
        int pagamento = entrada.nextInt();
        System.out.println();

        switch (pagamento) {
            case 1:
            case 2:
            case 3:
                int pedidoNumero = 100 + random.nextInt(900);
                System.out.println("Pagamento realizado com sucesso!");
                System.out.println();
                System.out.printf("Pedido Nº %d%n", pedidoNumero);
                System.out.println();
                System.out.println("Aguarde a chamada do seu pedido.");
                break;
            default:
                System.out.println("Forma de pagamento inválida.");
                break;
        }

        entrada.close();
    }

    private static String getDots(String nome) {
        int totalLength = 19;
        int dots = totalLength - nome.length();
        if (dots < 1) {
            dots = 1;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < dots; i++) {
            builder.append('.');
        }
        return builder.toString();
    }

    private static String formatValor(double valor) {
        return String.format("%.2f", valor).replace('.', ',');
    }
}
