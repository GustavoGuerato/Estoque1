
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String nascimento;
    protected String rg;
    protected int numeroCPF;
    
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(int numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", nascimento=" + nascimento + ", rg=" + rg
                + ", numeroCPF=" + numeroCPF + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((rg == null) ? 0 : rg.hashCode());
        result = prime * result + numeroCPF;
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
        Pessoa other = (Pessoa) obj;
        if (rg == null) {
            if (other.rg != null)
                return false;
        } else if (!rg.equals(other.rg))
            return false;
        if (numeroCPF != other.numeroCPF)
            return false;
        return true;
    }

}
