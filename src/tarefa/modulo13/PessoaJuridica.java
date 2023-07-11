package tarefa.modulo13;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica() {
        this.cnpj = "CNPJ desconhecido";
    }
    public PessoaJuridica(String nome) {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome(nome);
    }

    public PessoaJuridica(String nome, String cnpj) {
        this.setNome(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                "nome='" + this.getNome() + '\'' +
                '}';
    }
}
