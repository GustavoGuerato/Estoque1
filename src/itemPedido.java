public class itemPedido {
    private Produto produto;
    private int quantidade;
    private double precoUnitario;
    private int id;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((produto == null) ? 0 : produto.hashCode());
        result = prime * result + quantidade;
        long temp;
        temp = Double.doubleToLongBits(precoUnitario);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + id;
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
        itemPedido other = (itemPedido) obj;
        if (produto == null) {
            if (other.produto != null)
                return false;
        } else if (!produto.equals(other.produto))
            return false;
        if (quantidade != other.quantidade)
            return false;
        if (Double.doubleToLongBits(precoUnitario) != Double.doubleToLongBits(other.precoUnitario))
            return false;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "itemPedido [produto=" + produto + ", quantidade=" + quantidade + ", precoUnitario=" + precoUnitario
                + ", id=" + id + "]";
    }

    public double calcularTotal() {
        return quantidade * precoUnitario;
    }

    public double getSubtotal() {
        return quantidade * precoUnitario;
    }

}
