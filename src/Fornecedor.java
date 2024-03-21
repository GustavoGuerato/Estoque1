import java.util.ArrayList;

public class Fornecedor {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String cnpj;
    private String tipo;
    private String horarioFuncionamento;
    private String termosPagamento;
    private double rating;
    private String categoriaProdutos;
    private String informacoesEntrega;
    private String documentacaoLegal;
    private String notasInternas;
    private ArrayList<Produto> produtosFornecidos;
    private ArrayList<Pedido> historicoPedidos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getTermosPagamento() {
        return termosPagamento;
    }

    public void setTermosPagamento(String termosPagamento) {
        this.termosPagamento = termosPagamento;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCategoriaProdutos() {
        return categoriaProdutos;
    }

    public void setCategoriaProdutos(String categoriaProdutos) {
        this.categoriaProdutos = categoriaProdutos;
    }

    public String getInformacoesEntrega() {
        return informacoesEntrega;
    }

    public void setInformacoesEntrega(String informacoesEntrega) {
        this.informacoesEntrega = informacoesEntrega;
    }

    public String getDocumentacaoLegal() {
        return documentacaoLegal;
    }

    public void setDocumentacaoLegal(String documentacaoLegal) {
        this.documentacaoLegal = documentacaoLegal;
    }

    public String getNotasInternas() {
        return notasInternas;
    }

    public void setNotasInternas(String notasInternas) {
        this.notasInternas = notasInternas;
    }

    public ArrayList<Produto> getProdutosFornecidos() {
        return produtosFornecidos;
    }

    public void setProdutosFornecidos(ArrayList<Produto> produtosFornecidos) {
        this.produtosFornecidos = produtosFornecidos;
    }

    public ArrayList<Pedido> getHistoricoPedidos() {
        return historicoPedidos;
    }

    public void setHistoricoPedidos(ArrayList<Pedido> historicoPedidos) {
        this.historicoPedidos = historicoPedidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        result = prime * result + ((horarioFuncionamento == null) ? 0 : horarioFuncionamento.hashCode());
        result = prime * result + ((termosPagamento == null) ? 0 : termosPagamento.hashCode());
        long temp;
        temp = Double.doubleToLongBits(rating);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((categoriaProdutos == null) ? 0 : categoriaProdutos.hashCode());
        result = prime * result + ((informacoesEntrega == null) ? 0 : informacoesEntrega.hashCode());
        result = prime * result + ((documentacaoLegal == null) ? 0 : documentacaoLegal.hashCode());
        result = prime * result + ((notasInternas == null) ? 0 : notasInternas.hashCode());
        result = prime * result + ((produtosFornecidos == null) ? 0 : produtosFornecidos.hashCode());
        result = prime * result + ((historicoPedidos == null) ? 0 : historicoPedidos.hashCode());
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
        Fornecedor other = (Fornecedor) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (endereco == null) {
            if (other.endereco != null)
                return false;
        } else if (!endereco.equals(other.endereco))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (cnpj == null) {
            if (other.cnpj != null)
                return false;
        } else if (!cnpj.equals(other.cnpj))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        if (horarioFuncionamento == null) {
            if (other.horarioFuncionamento != null)
                return false;
        } else if (!horarioFuncionamento.equals(other.horarioFuncionamento))
            return false;
        if (termosPagamento == null) {
            if (other.termosPagamento != null)
                return false;
        } else if (!termosPagamento.equals(other.termosPagamento))
            return false;
        if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
            return false;
        if (categoriaProdutos == null) {
            if (other.categoriaProdutos != null)
                return false;
        } else if (!categoriaProdutos.equals(other.categoriaProdutos))
            return false;
        if (informacoesEntrega == null) {
            if (other.informacoesEntrega != null)
                return false;
        } else if (!informacoesEntrega.equals(other.informacoesEntrega))
            return false;
        if (documentacaoLegal == null) {
            if (other.documentacaoLegal != null)
                return false;
        } else if (!documentacaoLegal.equals(other.documentacaoLegal))
            return false;
        if (notasInternas == null) {
            if (other.notasInternas != null)
                return false;
        } else if (!notasInternas.equals(other.notasInternas))
            return false;
        if (produtosFornecidos == null) {
            if (other.produtosFornecidos != null)
                return false;
        } else if (!produtosFornecidos.equals(other.produtosFornecidos))
            return false;
        if (historicoPedidos == null) {
            if (other.historicoPedidos != null)
                return false;
        } else if (!historicoPedidos.equals(other.historicoPedidos))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Fornecedor [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email
                + ", cnpj=" + cnpj + ", tipo=" + tipo + ", horarioFuncionamento=" + horarioFuncionamento
                + ", termosPagamento=" + termosPagamento + ", rating=" + rating + ", categoriaProdutos="
                + categoriaProdutos + ", informacoesEntrega=" + informacoesEntrega + ", documentacaoLegal="
                + documentacaoLegal + ", notasInternas=" + notasInternas + ", produtosFornecidos=" + produtosFornecidos
                + ", historicoPedidos=" + historicoPedidos + "]";
    }

    

}
