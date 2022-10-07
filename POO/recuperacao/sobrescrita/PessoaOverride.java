package recuperacao.sobrescrita;

public class PessoaOverride {
    public String nome;
    public int matricula;

    public PessoaOverride(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

	public String getNome() {
		return this.nome;
	}

	public String setNome(String nome) {
		this.nome = nome + "Jorge";
		return nome;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
