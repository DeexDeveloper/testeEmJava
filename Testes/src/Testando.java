public class Testando {
    String funcionario;
    String cpf;
    long telefone;
    Float salario;


    public Testando(String funcionario, String cpf, long telefone, Float salario) {
        this.funcionario = funcionario;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
    }
    
    public void promover (Float percent){
        this.salario*=1+(percent/100);
    }


    public String getFuncionario() {
        return funcionario;
    }


    public String getCpf() {
        return cpf;
    }


    public long getTelefone() {
        return telefone;
    }


    public Float getSalario() {
        return salario;
    }

}
