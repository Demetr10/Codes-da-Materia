import java.util.Scanner;

public class App {
    private static Scanner scan;
    private static Gerenciador gerenciador;

    private static String menu() {
        String str = "";
        str += "1 - Criar Lista de Compras\n";
        str += "2 - Adicionar Produto a Lista\n";
        str += "3 - Remover Produto da Lista\n";
        str += "4 - Calcular Valor Total da Lista\n";
        str += "5 - Calcular Peso Total da Lista\n";
        str += "0 - Sair\n";

        return str;
    }

    private static void criarListaCompra() {
        System.out.println("### Criação de Lista de Compras ###");
        System.out.println("Digite o nome da lista:");
        String nomeLista = scan.nextLine();
        gerenciador.cadastrarListaCompra(nomeLista);
        System.out.println("Lista de Compras criada com sucesso!");
    }

    private static void adicionarProduto() {
        System.out.println("### Adicionar Produto à Lista ###");
        System.out.println("Digite o nome da lista:");
        String nomeLista = scan.nextLine();
        ListadCompra lista = gerenciador.buscarListaCompra(nomeLista);
        if (lista != null) {
            System.out.println("Digite o nome do produto:");
            String nomeProduto = scan.nextLine();
            System.out.println("Digite o preço do produto:");
            double precoProduto = scan.nextDouble();
            System.out.println("Digite o peso do produto:");
            double pesoProduto = scan.nextDouble();
            Produto produto = new Produto(nomeProduto, precoProduto, pesoProduto);
            lista.adicionarProduto(produto);
            System.out.println("Produto adicionado à lista com sucesso!");
        } else {
            System.out.println("Lista de Compras não encontrada!");
        }
    }

    private static void removerProduto() {
        System.out.println("### Remover Produto da Lista ###");
        System.out.println("Digite o nome da lista:");
        String nomeLista = scan.nextLine();
        ListadCompra lista = gerenciador.buscarListaCompra(nomeLista);
        if (lista != null) {
            System.out.println("Digite o nome do produto a ser removido:");
            String nomeProduto = scan.nextLine();
            Produto produto = new Produto(nomeProduto, 0.0, 0.0);
            lista.removerProduto(produto);
            System.out.println("Produto removido da lista com sucesso!");
        } else {
            System.out.println("Lista de Compras não encontrada!");
        }
    }

    private static void calcularValorTotal() {
        System.out.println("### Calcular Valor Total da Lista ###");
        System.out.println("Digite o nome da lista:");
        String nomeLista = scan.nextLine();
        ListadCompra lista = gerenciador.buscarListaCompra(nomeLista);
        if (lista != null) {
            double valorTotal = lista.calcularValorTotal();
            System.out.println("Valor Total da Lista: R$" + valorTotal);
        } else {
            System.out.println("Lista de Compras não encontrada!");
        }
    }

    private static void calcularPesoTotal() {
        System.out.println("### Calcular Peso Total da Lista ###");
        System.out.println("Digite o nome da lista:");
        String nomeLista = scan.nextLine();
        ListadCompra lista = gerenciador.buscarListaCompra(nomeLista);
        if (lista != null) {
            double pesoTotal = lista.calcularPesoTotal();
            System.out.println("Peso Total da Lista: " + pesoTotal + " kg");
        } else {
            System.out.println("Lista de Compras não encontrada!");
        }
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        gerenciador = new Gerenciador();

        int opcao;

        do {
            System.out.println(menu());
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    criarListaCompra();
                    break;
                case 2:
                    adicionarProduto();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    calcularValorTotal();
                    break;
                case 5:
                    calcularPesoTotal();
                    break;
            }

        } while (opcao != 0);
    }
}