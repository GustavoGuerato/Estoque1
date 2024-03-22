public class Entrega {
    private String tempoEntrega;
    private String Transportadora;
    private String enderecoOrigem;
    private String enderecoDestino;
    private String numeroRastreamento;
    private double custoEntrega;
    private String nomeRemetente;
    private String enderecoRemetente;
    private String nomeDestinatario;
    private String enderecoDestinatario;

    public String getTempoEntrega() {
        return tempoEntrega;
    }

    public void setTempoEntrega(String tempoEntrega) {
        this.tempoEntrega = tempoEntrega;
    }

    public String getTransportadora() {
        return Transportadora;
    }

    public void setTransportadora(String transportadora) {
        Transportadora = transportadora;
    }

    public String getEnderecoOrigem() {
        return enderecoOrigem;
    }

    public void setEnderecoOrigem(String enderecoOrigem) {
        this.enderecoOrigem = enderecoOrigem;
    }

    public String getEnderecoDestino() {
        return enderecoDestino;
    }

    public void setEnderecoDestino(String enderecoDestino) {
        this.enderecoDestino = enderecoDestino;
    }

    public String getNumeroRastreamento() {
        return numeroRastreamento;
    }

    public void setNumeroRastreamento(String numeroRastreamento) {
        this.numeroRastreamento = numeroRastreamento;
    }

    public double getCustoEntrega() {
        return custoEntrega;
    }

    public void setCustoEntrega(double custoEntrega) {
        this.custoEntrega = custoEntrega;
    }

    public String getNomeRemetente() {
        return nomeRemetente;
    }

    public void setNomeRemetente(String nomeRemetente) {
        this.nomeRemetente = nomeRemetente;
    }

    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(String enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tempoEntrega == null) ? 0 : tempoEntrega.hashCode());
        result = prime * result + ((Transportadora == null) ? 0 : Transportadora.hashCode());
        result = prime * result + ((enderecoOrigem == null) ? 0 : enderecoOrigem.hashCode());
        result = prime * result + ((enderecoDestino == null) ? 0 : enderecoDestino.hashCode());
        result = prime * result + ((numeroRastreamento == null) ? 0 : numeroRastreamento.hashCode());
        long temp;
        temp = Double.doubleToLongBits(custoEntrega);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((nomeRemetente == null) ? 0 : nomeRemetente.hashCode());
        result = prime * result + ((enderecoRemetente == null) ? 0 : enderecoRemetente.hashCode());
        result = prime * result + ((nomeDestinatario == null) ? 0 : nomeDestinatario.hashCode());
        result = prime * result + ((enderecoDestinatario == null) ? 0 : enderecoDestinatario.hashCode());
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
        Entrega other = (Entrega) obj;
        if (tempoEntrega == null) {
            if (other.tempoEntrega != null)
                return false;
        } else if (!tempoEntrega.equals(other.tempoEntrega))
            return false;
        if (Transportadora == null) {
            if (other.Transportadora != null)
                return false;
        } else if (!Transportadora.equals(other.Transportadora))
            return false;
        if (enderecoOrigem == null) {
            if (other.enderecoOrigem != null)
                return false;
        } else if (!enderecoOrigem.equals(other.enderecoOrigem))
            return false;
        if (enderecoDestino == null) {
            if (other.enderecoDestino != null)
                return false;
        } else if (!enderecoDestino.equals(other.enderecoDestino))
            return false;
        if (numeroRastreamento == null) {
            if (other.numeroRastreamento != null)
                return false;
        } else if (!numeroRastreamento.equals(other.numeroRastreamento))
            return false;
        if (Double.doubleToLongBits(custoEntrega) != Double.doubleToLongBits(other.custoEntrega))
            return false;
        if (nomeRemetente == null) {
            if (other.nomeRemetente != null)
                return false;
        } else if (!nomeRemetente.equals(other.nomeRemetente))
            return false;
        if (enderecoRemetente == null) {
            if (other.enderecoRemetente != null)
                return false;
        } else if (!enderecoRemetente.equals(other.enderecoRemetente))
            return false;
        if (nomeDestinatario == null) {
            if (other.nomeDestinatario != null)
                return false;
        } else if (!nomeDestinatario.equals(other.nomeDestinatario))
            return false;
        if (enderecoDestinatario == null) {
            if (other.enderecoDestinatario != null)
                return false;
        } else if (!enderecoDestinatario.equals(other.enderecoDestinatario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Entrega [tempoEntrega=" + tempoEntrega + ", Transportadora=" + Transportadora + ", enderecoOrigem="
                + enderecoOrigem + ", enderecoDestino=" + enderecoDestino + ", numeroRastreamento=" + numeroRastreamento
                + ", custoEntrega=" + custoEntrega + ", nomeRemetente=" + nomeRemetente + ", enderecoRemetente="
                + enderecoRemetente + ", nomeDestinatario=" + nomeDestinatario + ", enderecoDestinatario="
                + enderecoDestinatario + "]";
    }

}
