package recuperacao.interface1;

public class FuncionarioInterface implements PessoaInterface {
    
    private String nome;
    private int matricula;
    private String departamento;

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

    public String getNome() {

        return nome;
    }

    public int getMatricula() {

        return matricula;
    }
}
