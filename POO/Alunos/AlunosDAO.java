package Alunos;
import java.util.ArrayList;
import java.util.List;

public class AlunosDAO {

    private List<Pessoa> ListaPessoas = new ArrayList<Pessoa>();

    public void addPessoa(Pessoa pessoa){
        ListaPessoas.add(pessoa);
    }

    public void deletePessoa(Pessoa pessoa){
        ListaPessoas.remove(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return ListaPessoas;
    }

    public AlunosDAO() {
    }

}