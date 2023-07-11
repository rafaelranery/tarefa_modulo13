package tarefa.modulo13;

public abstract class Pessoa {
    private String nome;

    public Pessoa() {
        this.nome = "Anônimo";
    }
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
