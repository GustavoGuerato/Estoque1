import java.util.List;

public class Fatura {

    private Pedido pedido;
    private double total;
    private String data;
    private Cliente cliente;
    private List<itemPedido> itensPedido;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<itemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<itemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
        long temp;
        temp = Double.doubleToLongBits(total);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        result = prime * result + ((itensPedido == null) ? 0 : itensPedido.hashCode());
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
        Fatura other = (Fatura) obj;
        if (pedido == null) {
            if (other.pedido != null)
                return false;
        } else if (!pedido.equals(other.pedido))
            return false;
        if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        if (itensPedido == null) {
            if (other.itensPedido != null)
                return false;
        } else if (!itensPedido.equals(other.itensPedido))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Fatura [pedido=" + pedido + ", total=" + total + ", data=" + data + ", cliente=" + cliente
                + ", itensPedido=" + itensPedido + "]";
    }

    public void calcularTotal() {
        double total = 0.0;
        for (itemPedido item : itensPedido) {
            total += item.getSubtotal();
        }
        this.total = total;
    }

}
