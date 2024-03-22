import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("bem vindo ao estoque");
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar algo ao estoque? ");

        if (escolha == 0) {
            String input = JOptionPane.showInputDialog(null, "Qual a quantidade de produtos?");
            int qtdProdutos = Integer.parseInt(input);

            for (int qtd = 1; qtd <= qtdProdutos; qtd++) {
                String nome = JOptionPane.showInputDialog("qual o nome do produto " + qtd + " ?");

                String idInput = JOptionPane.showInputDialog("qual o id do produto" + qtd + "?");
                int id = Integer.parseInt(idInput);

                String descricao = JOptionPane.showInputDialog("qual a descrição do produto " + qtd + " ?");

                String quantidadeInput = JOptionPane.showInputDialog("qual a quantidade do produto " + qtd + " ?");
                int quantidade = Integer.parseInt(quantidadeInput);
                if (quantidade == 0) {
                    JOptionPane.showMessageDialog(null, "não é possivel adicionar nenhum produto");
                } else {
                    JOptionPane.showMessageDialog(null, "foram adicionados " + quantidade + " de " + nome);
                }
                String codigoBarraInput = JOptionPane.showInputDialog("qual o codigo de barras do produto ?");
                int codigoBarra = Integer.parseInt(codigoBarraInput);

                String precoInput = JOptionPane.showInputDialog("qual o valor do produto ?");
                double preco = Double.parseDouble(precoInput);

                String validade = JOptionPane.showInputDialog("qual a validade do produto? ");

                String fornecedor = JOptionPane.showInputDialog("qual o noemd o fornecedor");

                String promoInput = JOptionPane.showInputDialog("este produto está em promo");
                boolean promo = Boolean.parseBoolean(promoInput);
            }
        }
    }
}
