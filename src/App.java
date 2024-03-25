import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem-vindo ao estoque");

        boolean adicionarOutroProduto = true;

        while (adicionarOutroProduto) {
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar algo ao estoque? ");

            if (escolha == 0) {
                String input = JOptionPane.showInputDialog(null, "Qual a quantidade de produtos?");
                int qtdProdutos = Integer.parseInt(input);
                System.out.println("Quantidade de produtos a serem adicionados: " + qtdProdutos);

                for (int qtd = 1; qtd <= qtdProdutos; qtd++) {
                    System.out.println("Produto " + qtd);

                    String nome = JOptionPane.showInputDialog("Qual o nome do produto " + qtd + " ?");
                    System.out.println("Nome do produto: " + nome);

                    String idInput = JOptionPane.showInputDialog("Qual o id do produto" + qtd + "?");
                    int id = Integer.parseInt(idInput);
                    System.out.println("ID do produto: " + id);

                    String descricao = JOptionPane.showInputDialog("Qual a descrição do produto " + qtd + " ?");
                    System.out.println("Descrição do produto: " + descricao);

                    String quantidadeInput = JOptionPane.showInputDialog("Qual a quantidade do produto " + qtd + " ?");
                    int quantidade = Integer.parseInt(quantidadeInput);
                    if (quantidade == 0) {
                        JOptionPane.showMessageDialog(null, "Não é possível adicionar nenhum produto");
                    } else {
                        JOptionPane.showMessageDialog(null, "Foram adicionados " + quantidade + " de " + nome);
                    }
                    System.out.println("Quantidade do produto: " + quantidade);

                    String codigoBarraInput = JOptionPane.showInputDialog("Qual o código de barras do produto ?");
                    int codigoBarra = Integer.parseInt(codigoBarraInput);
                    System.out.println("Código de barras do produto: " + codigoBarra);

                    String precoInput = JOptionPane.showInputDialog("Qual o valor do produto ?");
                    double preco = Double.parseDouble(precoInput);
                    System.out.println("Valor do produto: " + preco);

                    String validade = JOptionPane.showInputDialog("Qual a validade do produto? ");
                    System.out.println("Validade do produto: " + validade);

                    String fornecedor = JOptionPane.showInputDialog("Qual o nome do fornecedor");
                    System.out.println("Nome do fornecedor: " + fornecedor);

                    String promoInput = JOptionPane.showInputDialog("Este produto está em promoção?");
                    boolean promo = Boolean.parseBoolean(promoInput);
                    System.out.println("Está em promoção? " + promo);
                }
            } else {
                adicionarOutroProduto = false;
            }
        }
        JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema de estoque!");
    }
}
