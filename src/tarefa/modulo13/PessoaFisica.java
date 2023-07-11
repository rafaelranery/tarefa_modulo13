package tarefa.modulo13;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica() {
        this.cpf = "CPF desconhecido";
    }
    public PessoaFisica(String nome) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome(nome);
    }

    public PessoaFisica(String nome, String cpf) {
        this.setNome(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                "nome='" + this.getNome() + '\'' +
                '}';
    }
}
