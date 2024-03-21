import java.util.ArrayList;

public class Pedido {
    private int numeroPedido;
    private int dataPedido;
    private Cliente cliente;
    private ArrayList<itemPedido> itens;

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(int dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<itemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<itemPedido> itens) {
        this.itens = itens;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numeroPedido;
        result = prime * result + dataPedido;
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        result = prime * result + ((itens == null) ? 0 : itens.hashCode());
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
        Pedido other = (Pedido) obj;
        if (numeroPedido != other.numeroPedido)
            return false;
        if (dataPedido != other.dataPedido)
            return false;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        if (itens == null) {
            if (other.itens != null)
                return false;
        } else if (!itens.equals(other.itens))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pedido [numeroPedido=" + numeroPedido + ", dataPedido=" + dataPedido + ", cliente=" + cliente
                + ", itens=" + itens + "]";
    }

}
