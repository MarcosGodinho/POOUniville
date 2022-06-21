package Listas;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

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

    public void getById(int IdPessoa){
        boolean AchouPessoa = false;

        for (Pessoa pessoa : ListaPessoas) {

            if(IdPessoa == pessoa.getId()){
                System.out.println(pessoa);
                AchouPessoa = true;
                break;
            }
        }
        if(AchouPessoa == false){
            System.out.println("ID Inexistente");
        }
    }

    public PessoaDAO() {
    }

}