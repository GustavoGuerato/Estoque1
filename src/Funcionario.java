public class Funcionario extends Pessoa {
    private String cargo;
    private int idNum;
    private double salario;
    private String departamento;
    private String dataContratacao;
    private String horarioTrabalho;
    private String endereco;
    private String numeroTelefone;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "Funcionario [cargo=" + cargo + ", idNum=" + idNum + ", salario=" + salario + ", departamento="
                + departamento + ", dataContratacao=" + dataContratacao + ", horarioTrabalho=" + horarioTrabalho
                + ", endereco=" + endereco + ", numeroTelefone=" + numeroTelefone + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
        result = prime * result + idNum;
        long temp;
        temp = Double.doubleToLongBits(salario);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
        result = prime * result + ((dataContratacao == null) ? 0 : dataContratacao.hashCode());
        result = prime * result + ((horarioTrabalho == null) ? 0 : horarioTrabalho.hashCode());
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + ((numeroTelefone == null) ? 0 : numeroTelefone.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (cargo == null) {
            if (other.cargo != null)
                return false;
        } else if (!cargo.equals(other.cargo))
            return false;
        if (idNum != other.idNum)
            return false;
        if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
            return false;
        if (departamento == null) {
            if (other.departamento != null)
                return false;
        } else if (!departamento.equals(other.departamento))
            return false;
        if (dataContratacao == null) {
            if (other.dataContratacao != null)
                return false;
        } else if (!dataContratacao.equals(other.dataContratacao))
            return false;
        if (horarioTrabalho == null) {
            if (other.horarioTrabalho != null)
                return false;
        } else if (!horarioTrabalho.equals(other.horarioTrabalho))
            return false;
        if (endereco == null) {
            if (other.endereco != null)
                return false;
        } else if (!endereco.equals(other.endereco))
            return false;
        if (numeroTelefone == null) {
            if (other.numeroTelefone != null)
                return false;
        } else if (!numeroTelefone.equals(other.numeroTelefone))
            return false;
        return true;
    }

    

}