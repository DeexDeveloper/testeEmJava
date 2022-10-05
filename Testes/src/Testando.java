public class Testando {
    private String funcionario;
    private String cpf;
    private long telefone;
    private Float salario;


    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Testando(String funcionario, String cpf, long telefone, Float salario) {
        this.funcionario = funcionario;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
    }
    
    public void promover (Float percent){
        this.salario*=1+(percent/100);
    }

}
