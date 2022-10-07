package recuperacao.sobrescrita;

public class FuncionarioOverride extends PessoaOverride {
    
    private String departamento;
    
    public FuncionarioOverride(String nome, int matricula, String departamento) {
        super(nome, matricula);
        this.departamento = departamento;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String setNome(String nome) {
        return this.nome + " Carlos";
    }

}
