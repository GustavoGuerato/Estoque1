public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private int qtd;
    private int codigoBarras;
    private double preco;
    private String validade;
    private String fornecedor;
    private boolean emPromocao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isEmPromocao() {
        return emPromocao;
    }

    public void setEmPromocao(boolean emPromocao) {
        this.emPromocao = emPromocao;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", qtd=" + qtd + ", codigoBarras="
                + codigoBarras + ", preco=" + preco + ", validade=" + validade + ", fornecedor=" + fornecedor
                + ", emPromocao=" + emPromocao + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + qtd;
        result = prime * result + codigoBarras;
        long temp;
        temp = Double.doubleToLongBits(preco);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((validade == null) ? 0 : validade.hashCode());
        result = prime * result + ((fornecedor == null) ? 0 : fornecedor.hashCode());
        result = prime * result + (emPromocao ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (id != other.id)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (qtd != other.qtd)
            return false;
        if (codigoBarras != other.codigoBarras)
            return false;
        if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
            return false;
        if (validade == null) {
            if (other.validade != null)
                return false;
        } else if (!validade.equals(other.validade))
            return false;
        if (fornecedor == null) {
            if (other.fornecedor != null)
                return false;
        } else if (!fornecedor.equals(other.fornecedor))
            return false;
        if (emPromocao != other.emPromocao)
            return false;
        return true;
    }

}
